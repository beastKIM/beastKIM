
public class CalcThread extends Thread{
	SharedArea sharedArea;
	public void run() {
		for(int cnt = 1; cnt < 1000000000; cnt += 2) {
			if(cnt / 2 % 2 == 0)
				sharedArea.pi += 4.0 / cnt;
			else
				sharedArea.pi -= 4.0 / cnt;
		}
		sharedArea.done = true;
	}
}
