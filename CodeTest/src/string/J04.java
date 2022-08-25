package string;
import java.util.*;

public class J04 {
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		
		//방법1. 단순히 다 뒤집기
		for(String x : str) {
			//String 연산이 많아지는 경우 builder를 쓰는 것이 효율적
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		
		//방법2. 특정 조건으로 뒤집기
		for(String x : str) {
			char[] s = x.toCharArray();
			int lt = 0, rt = x.length()-1;
			while(lt<rt) {
				char tmp = s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
			String tmp=String.valueOf(s);
			answer.add(tmp);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		J04 J = new J04();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		for(int i=0;i<n;i++) {
			str[i] = sc.next();
		}
		for(String x: J.solution(n, str)) {
			System.out.println(x);
		}
	}
}
