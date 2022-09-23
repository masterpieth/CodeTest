package stack;
import java.util.*;
import java.util.Stack;

public class J04 {
	public int solution(String str) {
		int answer=0;
		Stack<Integer> s = new Stack<>();
		for(char c: str.toCharArray()) {
			if(Character.isDigit(c)) s.push(c-48);
			else {
				int rt = s.pop();
				int lt = s.pop();
				if(c=='+') s.push(lt+rt);
				else if(c=='-') s.push(lt-rt);
				else if(c=='*') s.push(lt*rt);
				else if(c=='/') s.push(lt/rt);
			}
		}
		answer = s.get(0);
		return answer;
	}
	public static void main(String[] args) {
		J04 J = new J04();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(J.solution(str));
	}
}
