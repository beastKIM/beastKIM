import java.util.*;
public class LinkedListQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> queue = new LinkedList<String>();
		queue.offer("»ç½¿");
		queue.offer("¸äµÅÁö");
		queue.offer("°ø·æ");
		while(!queue.isEmpty()) {
			String str = queue.poll();
			System.out.println(str);
		}
	}

}
