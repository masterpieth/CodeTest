package tpsw;
import java.util.*;

public class J01 {
	public ArrayList<Integer> solution(int n, int[] a, int m, int[] b) {
		ArrayList<Integer> answer = new ArrayList<>();
		int p1=0, p2=0;
		while(p1<n && p2<m) {
			if(a[p1] < b[p2]) {
				answer.add(a[p1]);
				p1++;
			}
			else {
				answer.add(b[p2]);
				p2++;
			}
		}
		if(p1<n) {
			for(int i=p1; i<n; i++) {
				answer.add(a[i]);
			}
		}
		if(p2<m) {
			for(int i=p2; i<m; i++) {
				answer.add(b[i]);
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		J01 J = new J01();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] b = new int[m];
		for(int i=0; i<m; i++) {
			b[i] = sc.nextInt();
		}
		for(int x: J.solution(n,a,m,b)) {
			System.out.print(x + " ");
		}
	}
}
