
public class PrintThread extends Thread{
	SharedArea sharedArea;
	public void run() {
		while(!sharedArea.done) {
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
			System.out.println(sharedArea.pi);
		}
	}
}
