package string;
import java.util.*;

public class J12 {
	public String solution(String str, int n) {
		String answer = "";
		String[] s = new String[n];
		for(int i=0;i<n;i++) {
			s[i] = str.substring(0, 7).replace("#", "1").replace("*", "0");
			str = str.substring(7);
		}
		for(String x : s) {
			answer+= (char)Integer.parseInt(x, 2);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		J12 J = new J12();
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String str = sc.nextLine();
		
		System.out.println(J.solution(str, n));
	}
}
