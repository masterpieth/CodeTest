package tpsw;
import java.util.*;

public class J07 {
	public int solution(int[] arr, int n, int k) {
		int answer=-1;
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int l=j+1; l<n; l++) {
					Tset.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
		int cnt=0;
		for(int x : Tset) {
			cnt++;
			if(cnt==k) return x;
		}
		return answer;
	}
	public static void main(String[] args) {
		J07 J = new J07();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(J.solution(arr, n, k));
	}
}
