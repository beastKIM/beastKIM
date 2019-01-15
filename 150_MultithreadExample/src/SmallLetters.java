
public class SmallLetters implements Runnable{
	public void run() {
		for(char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(700);
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
