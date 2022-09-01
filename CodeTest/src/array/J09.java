package array;
import java.util.*;

public class J09 {
	public int solution(int n, int[][] arr) {
		int answer = 0;
		for(int i=0; i<n; i++) {
			int tmp = 0;
			for(int j=0; j<n; j++) {
				tmp+=arr[i][j];
			}
			if(answer<tmp) answer = tmp;
		}
		for(int i=0; i<n; i++) {
			int tmp = 0;
			for(int j=0; j<n; j++) {
				tmp+=arr[j][i];
			}
			if(answer<tmp) answer = tmp;
		}
		for(int i=0; i<n; i++) {
			int tmp = 0;
			for(int j=n-1; j>=0; j--) {
				tmp+=arr[i][j];
			}
			if(answer<tmp) answer = tmp;
		}
		int tmp = 0;
		for(int i=0; i<n; i++) {
			tmp+=arr[i][i];
		}
		if(answer<tmp) answer = tmp;
		return answer;
	}
	
	public static void main(String[] args) {
		J09 J = new J09();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(J.solution(n, arr));
	}
}
