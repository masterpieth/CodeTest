package string;
import java.util.*;

public class J08 {
	public String solution(String s) {
		String answer = "NO";
		//A-Z 가 아닌 것들을 "" 처리한다
		s = s.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp = new StringBuilder(s).reverse().toString();
		if(s.equals(tmp)) answer = "YES";
		
		return answer;
	}
	public static void main(String[] args) {
		J08 J = new J08();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(J.solution(str));
	}
}
