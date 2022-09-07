package tpsw;
import java.util.*;

public class J04 {
	public int solution(int n, int m, int[] arr) {
		int answer=0;
		int lt=0, rt=0, sum=0;
		while(lt<n && rt<n) {
			//sum을 초기화시킨다
			sum=0;
			//lt부터 rt까지를 합한다
			for(int i=lt; i<=rt; i++) {
				sum+=arr[i];
			}
			//m과 비교해서 값이 같으면 카운팅하고 rt를 올린다
			if(sum == m) {
				answer++;
				rt++;
			}
			//값이 작으면 rt를 올린다
			else if(sum<m) rt++;
			//값이 크면 lt값을 빼고 lt를 올린다.
			else if(sum>m) sum-=arr[lt++];
		}
		
		return answer;
	}
	public static void main(String[] args) {
		J04 J = new J04();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(J.solution(n,m,arr));
	}
}
