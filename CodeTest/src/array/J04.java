package array;
import java.util.*;

public class J04 {
	public int[] solution(int n) {
		int[] answer = new int[n];
		answer[0] = 1;
		answer[1] = 1;
		for(int i=2;i<n;i++) {
			answer[i] = answer[i-1] + answer[i-2];
		}
		return answer;
	}
	public static void main(String[] args) {
		J04 J = new J04();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int x : J.solution(n)) {
			System.out.print(x);
		}
	}
}
