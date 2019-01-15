
public class ResultThread extends Thread{
	SharedArea sharedArea;
	public void run() {
		int sum = 0;
		for(int cnt = 0; cnt < 1000000; cnt ++) {
			java.util.Random random = new java.util.Random();
			boolean isHead = random.nextBoolean();
			if(isHead)
				sum++;
		}
		sharedArea.ratio = sum / 1000000.0;
		synchronized (sharedArea) {
			sharedArea.notify();	//wait신호를 보내는 스레드로 신호를 보냄.
		}
	}
}
