
public class Signs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinusThread thread = new MinusThread();
		thread.start();
		for(int cnt = 0; cnt < 100; cnt ++)
			System.out.print('+');
	}

}
