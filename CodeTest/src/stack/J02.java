package stack;
import java.util.*;

public class J02 {
	public String solution(String str) {
		StringBuilder answer = new StringBuilder();
		for(char x : str.toCharArray()) {
			if(Character.isAlphabetic(x)) answer.append(x);
		}
		return answer.toString();
	}
	
	public static void main(String[] args) {
		J02 J = new J02();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(J.solution(str));
	}
}
