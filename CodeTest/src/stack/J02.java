package stack;
import java.util.*;
import java.util.Stack;

public class J02 {
	public String solution(String str) {
		String answer="";
		Stack<Character> s = new Stack<>();
		for(char x : str.toCharArray()) {
			if(x==')') {
				while(s.pop()!='(');
			}
			else s.push(x);
		}
		for(int i=0; i<s.size(); i++) {
			answer+=s.get(i);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		J02 J = new J02();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(J.solution(str));
	}
}
