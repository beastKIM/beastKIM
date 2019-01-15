
public class QuizMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimulThread thread1 = new SimulThread();	//스레드 객체 생성.
		ResultThread thread2 = new ResultThread();	
		SharedArea obj = new SharedArea();			//공유영역 객체 생성.
		thread1.sharedArea = obj;		//스레드에 공유영역 할당.
		thread2.sharedArea = obj;		
		thread1.start();		//스레드 실행.
		thread2.start();
	}

}
