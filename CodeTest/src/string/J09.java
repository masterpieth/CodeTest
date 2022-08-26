package string;
import java.util.*;

public class J09 {
	public int solution(String str) {
		int answer = 0;
		str = str.toUpperCase().replaceAll("[A-Z]", "");
		answer = Integer.parseInt(str);
		return answer;
	}
	public static void main(String[] args) {
		J09 J = new J09();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(J.solution(str));
	}
}
