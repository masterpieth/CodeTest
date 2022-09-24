package stack;
import java.util.*;
import java.util.Stack;

public class J05 {
	public int solution(String str) {
		int answer = 0;
		Stack<Character> s = new Stack<>();
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '(') s.push('(');
			else {
				s.pop();
				if(str.charAt(i-1)=='(') answer += s.size();
				else answer++;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		J05 J = new J05();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(J.solution(str));
	}
}
