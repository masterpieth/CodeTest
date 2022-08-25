package string;
import java.util.*;

public class J06 {
	public String solution(String str) {
		String answer = "";
		for(int i=0;i<str.length();i++) {
			if(str.indexOf(str.charAt(i)) == i) answer+=str.charAt(i);
		}
		
		return answer;
	}
	public static void main(String[] args) {
		J06 J = new J06();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(J.solution(str));
	}
}
