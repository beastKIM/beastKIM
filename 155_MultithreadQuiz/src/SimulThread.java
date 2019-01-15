
public class SimulThread extends Thread{
	SharedArea sharedArea;
	public void run() {
		if(sharedArea.ratio == null) {
			try {
				synchronized(sharedArea) {	//critical section ����ȭ�� ���� ����� �̻������°��� ����.
					sharedArea.wait();		//wait��ȣ�� ������ notify��ȣ�� ���� �غ� ��. ��ȣ�� �ö����� ���.
				}
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}			
		}
		System.out.println(sharedArea.ratio);
	}
}
