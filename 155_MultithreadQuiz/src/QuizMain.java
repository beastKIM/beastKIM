
public class QuizMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimulThread thread1 = new SimulThread();	//������ ��ü ����.
		ResultThread thread2 = new ResultThread();	
		SharedArea obj = new SharedArea();			//�������� ��ü ����.
		thread1.sharedArea = obj;		//�����忡 �������� �Ҵ�.
		thread2.sharedArea = obj;		
		thread1.start();		//������ ����.
		thread2.start();
	}

}
