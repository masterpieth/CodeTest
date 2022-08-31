package array;
import java.util.*;

public class J08 {
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		int cnt = 1;
		for(int i=0; i<n; i++) {
			cnt = 1;
			for(int j=0; j<n; j++) {
				if(arr[j]>arr[i]) cnt++;
			}
			answer[i] = cnt;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		J08 J = new J08();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int x : J.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}
}
