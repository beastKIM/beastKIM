
public class MultithreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcThread thread1 = new CalcThread();
		PrintThread thread2 = new PrintThread();
		SharedArea obj = new SharedArea();
		MonitorThread thread3 = new MonitorThread(thread2);
		thread1.sharedArea = obj;
		thread2.sharedArea = obj;
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
