package string;

import java.util.*;

public class J05 {
	public String solution(String str) {
		String answer = "";
		char[] s = str.toCharArray();
		int lt=0, rt= str.length()-1;
		while(lt<rt) {
			if(!Character.isAlphabetic(s[lt])) lt++;
			else if(!Character.isAlphabetic(s[rt])) rt--;
			else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(s);
		
		return answer;
	}
	public static void main(String[] args) {
		J05 J = new J05();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(J.solution(str));
	}
}
