package string;
import java.util.*;

public class J11 {
	public String solution(String str) {
		String answer = "";
		str += " ";
		
		int cnt = 1;
		
		//셀프코드
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i) == str.charAt(i+1)) cnt++;
			else {
				answer += str.charAt(i);
				if(cnt != 1) answer += String.valueOf(cnt);
				cnt = 1;
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		J11 J = new J11();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(J.solution(str));
	}
}
