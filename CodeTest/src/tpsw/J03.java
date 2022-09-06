package tpsw;
import java.util.*;

public class J03 {
	public int solution(int n, int k, int[] arr) {
		int answer=0, sum=0;
		for(int i=0; i<k; i++) {
			answer+=arr[i];
			sum+=arr[i];
		}
		for(int i=k; i<n; i++) {
			sum = sum + arr[i] - arr[i-k];
			if(answer<sum) answer=sum;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		J03 J = new J03();
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
