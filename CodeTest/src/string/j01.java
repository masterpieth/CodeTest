package string;
import java.util.*;

public class j01 {
	public int solution(String str, char c) {
		int answer = 0;
		
		str = str.toLowerCase();
		c = Character.toLowerCase(c);
		
		//방법1 - for문을 사용함
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == c) answer++;
		}
		//방법2 - 향상된 for문을 사용함
		for(char x : str.toCharArray()) {
			if(x == c) answer++;
		}
		return answer;
	}
	public static void main(String[] args) {
		j01 J = new j01();
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);
		
		System.out.println(J.solution(str, c));
		
	}
}
