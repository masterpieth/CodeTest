package string;
import java.util.*;

public class J02 {
	public String solution(String str) {
		String answer = "";
		
		//향상된 for 문으로 검사하기
		for(char c : str.toCharArray()) {
			if(Character.isLowerCase(c)) answer += Character.toUpperCase(c);
			else answer += Character.toLowerCase(c);
		}
		//ascii 코드로 검사하기 -> 대문자: 65~90 / 소문자: 97~122 소문자에서 32를 빼면 대문자가 됨
		//단순히 더하면 숫자가 되기 때문에 char 캐스팅을 해줘야한다.
		for(char c : str.toCharArray()) {
			if(c>=97 && c<=122) answer += (char)(c-32);
			else answer += (char)(c+32);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		J02 J = new J02();
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(J.solution(str));
		
	}
}
