package stack;
import java.util.*;
import java.util.Stack;

public class J02 {
	public String solution(String str) {
		StringBuilder answer = new StringBuilder();
		Stack<Character> s = new Stack<>();
		for(char x : str.toCharArray()) {
			if(x !=')') s.push(x);
			else {
				while(true) {
					char flag = s.pop();
					if(flag=='(') break;
				}
			}
		}
		while(!s.isEmpty()) {
			answer.append(s.pop());
		}
		return answer.reverse().toString();
	}
	
	public static void main(String[] args) {
		J02 J = new J02();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(J.solution(str));
	}
}
