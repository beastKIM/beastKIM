
public class MinusThread extends Thread{
	public void run() {
		for(int cnt = 0; cnt < 100; cnt ++)
			System.out.print('-');
	}
}
