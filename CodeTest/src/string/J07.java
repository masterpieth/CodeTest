package string;
import java.util.*;

public class J07 {
	public String solution(String str) {
		String answer = "YES";
		
		//내가 짠 코드
		str = str.toLowerCase();
		for(int i=0;i<str.length()/2;i++) {
			char[] s = str.toCharArray();
			int lt=0, rt=str.length()-1;
			while(lt<rt) {
				if(s[lt]!=s[rt]) {
					answer="NO";
					break;
				}
				else {
					lt++;
					rt--;
				}
			}
		}
		//방법1
		str = str.toLowerCase();
		int len = str.length();
		for(int i=0;i<len/2;i++) {
			if(str.charAt(i)!= str.charAt(len-i-1)) return "NO";
		}
		//방법2
//		String answer = "NO";
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp)) answer = "YES";
		return answer;
	}
	
	public static void main(String[] args) {
		J07 J = new J07();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(J.solution(str));
	}
}
