package stack;
import java.util.*;
import java.util.Stack;
import java.io.*;

public class b_1874 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> s = new Stack<>();
		int start = 0;
		
		int n = Integer.parseInt(br.readLine());
		
		while(n-- > 0) {
			int value = Integer.parseInt(br.readLine());
			
			if(start < value) {
				for(int i = start + 1; i <= value; i++) {
					s.push(i);
					sb.append("+\n");
				}
				start = value;
			}
			else if (s.peek() != value) {
				System.out.println("NO");
				//둘 중 아무거나 써도 상관 없다.
//				System.exit(0);
				return;
			}
			
			s.pop();
			sb.append("-\n");
		}
		System.out.println(sb.toString());
	}
}
