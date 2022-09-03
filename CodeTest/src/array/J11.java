package array;
import java.util.*;

public class J11 {
	public int solution(int n, int[][] arr) {
		int answer = 0, max=Integer.MIN_VALUE;
		//학생번호
		for(int i=1; i<=n; i++) {
			int cnt=0;
			//다른 학생
			for(int j=1; j<=n; j++) {
				//학년
				for(int k=1; k<=5; k++) {
					if(arr[i][k]==arr[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if(cnt>max) {
				max=cnt;
				answer=i;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		J11 J = new J11();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n+1][6];
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=5; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(J.solution(n, arr));
	}
}
