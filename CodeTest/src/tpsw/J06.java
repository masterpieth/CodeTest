package tpsw;
import java.util.*;

public class J06 {
	public int solution(int n, int k, int[] arr) {
		int answer = 0, cnt = 0, lt = 0;
		//arr 배열을 rt가 1씩 증가하며 탐색한다.
		for(int rt=0; rt<n; rt++) {
			//arr배열에서 0을 만나면 cnt를 1 올린다.
			if(arr[rt]==0) cnt++;
			//만약 cnt가 k보다 커졌을 경우에는 lt를 올리며 0을 탐색한다.
			while(cnt>k) {
				//0을 만나는 경우 cnt를 1 내린다.
				if(arr[lt]==0) cnt--;
				//lt가 계속 증가하며 0을 탐색한다.
				lt++;
			}
			//기존 answer값과 바뀐 길이중에 큰 값을 찾는다.
			answer = Math.max(answer, rt-lt+1);
		}
		return answer;
	}
	public static void main(String[] args) {
		J06 J = new J06();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(J.solution(n,k,arr));
	}
}
