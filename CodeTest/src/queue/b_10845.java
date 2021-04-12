package queue;
import java.util.*;

public class b_10845 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] queue = new int[n];
		
		int start = 0;
		int end = 0;
		
		while(n-- > 0) {
			String cmd = sc.next();
			
			if(cmd.equals("push")) {
				int num = Integer.parseInt(sc.next());
				queue[end++] = num;
			}
			else if(cmd.equals("pop")) {
				if(start == end) System.out.println(-1);
				else System.out.println(queue[start++]);
			}
			else if(cmd.equals("size")) {
				System.out.println(end - start);
			}
			else if(cmd.equals("empty")) {
				if(start == end) System.out.println(1);
				else System.out.println(0);
			}
			else if(cmd.equals("front")) {
				if(start == end) System.out.println(-1);
				else System.out.println(queue[start]);
			}
			else if(cmd.equals("back")) {
				if(start == end) System.out.println(-1);
				else System.out.println(queue[end-1]);
			}
		}
	}
}
