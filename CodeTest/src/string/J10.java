package string;
import java.util.*;

public class J10 {
	public int[] solution(String s, char t) {
		int[] answer = new int[s.length()];
		int p = 1000;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == t) {
				p = 0;
				answer[i] = p;
			}
			else {
				p++;
				answer[i] = p;
			}
		}
		//셀프코드
		for(int i= s.length()-1;i>=0;i--) {
			if(s.charAt(i) == t) {
				p = 0;
				answer[i] = p;
			}
			else {
				p++;
				if(answer[i] > p) answer[i] = p;
			}
		}
		//정답코드
		p=1000;
		
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i) == t) p=0;
			else {
				p++;
				answer[i] = Math.min(answer[i], p);
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		J10 J = new J10();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);
		for(int x : J.solution(str, c)) {
			System.out.print(String.valueOf(x) + " ");
		}
	}
}
