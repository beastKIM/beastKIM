import RPi.GPIO as GPIO
import time
import os
import sys
import paho.mqtt.client as mqtt
import json

#configure host and token
HOST = 'demo.thingsboard.io'
TOKEN = 'beastPIR'

client = mqtt.Client()
client.username_pw_set(TOKEN)
client.connect(HOST, 1883, 60)

#json format data
sensor_data = {'contact' : 0}
input_data = 0

#gpio pin setup
GPIO.setmode(GPIO.BCM)
PIR_PIN = 7;
GPIO.setup(PIR_PIN, GPIO.IN)
client.loop_start()

try:
        print "PIR Module Test."
        time.sleep(2)
        print "Ready"

        while True:
                input_data = GPIO.input(PIR_PIN)
                t = time.localtime()
                if(input_data == 1):
                        print "%d:%d:%d Motion Detected." % (t.tm_hour, t.tm_min, t.tm_sec)
                sensor_data['contact'] = input_data
                #push data to thingsboard.io database
                client.publish('v1/devices/me/telemetry', json.dumps(sensor_data), 1)
                time.sleep(3)

except KeyboardInterrupt:
        pass
        GPIO.cleanup()

client.loop_stop()
client.disconnect()