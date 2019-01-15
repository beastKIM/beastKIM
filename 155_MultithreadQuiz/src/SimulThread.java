
public class SimulThread extends Thread{
	SharedArea sharedArea;
	public void run() {
		if(sharedArea.ratio == null) {
			try {
				synchronized(sharedArea) {	//critical section 동기화를 통해 결과가 이상해지는것을 방지.
					sharedArea.wait();		//wait신호를 보내서 notify신호를 받을 준비를 함. 신호가 올때까지 대기.
				}
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}			
		}
		System.out.println(sharedArea.ratio);
	}
}
