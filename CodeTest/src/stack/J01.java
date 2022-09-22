package stack;
import java.util.*;
import java.util.Stack;

public class J01 {
	public String solution(String str) {
		String answer = "YES";
		Stack<Character> s = new Stack<>();
		for(char x : str.toCharArray()) {
			if(x=='(') s.push(x);
			else {
				if(s.isEmpty()) return "NO";
				s.pop();
			}
		}
		if(!s.isEmpty()) return "NO";
		return answer;
	}
	
	public static void main(String[] args) {
		J01 J = new J01();
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		System.out.println(J.solution(str));
	}
}
