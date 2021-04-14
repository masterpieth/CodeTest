package stack;
import java.util.*;
import java.util.Stack;

public class b_17413 {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		Stack<Character> s = new Stack<>();
		boolean isReverse = true;
		
		for(char c : str.toCharArray()) {
			if(c == '<') {
				while(!s.isEmpty()) {
					sb.append(s.pop());
				}
				isReverse = false;
				sb.append(c);
			}
			else if(c == '>') {
				isReverse = true;
				sb.append(c);
			}
			else {
				if(isReverse) {
					if(c == ' ') {
						while(!s.isEmpty()) {
							sb.append(s.pop());
						}
						sb.append(c);
					} else {
						s.push(c);
					}
				}
				else {
					sb.append(c);
				}
			}
		}
		while(!s.isEmpty()) {
			sb.append(s.pop());
		}
		System.out.println(sb);
	}
}
