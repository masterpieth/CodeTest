package tpsw;
import java.util.*;

public class J02 {
	public ArrayList<Integer> solution(int n, int[] a, int m, int[] b) {
		ArrayList<Integer> answer = new ArrayList<>();
		int p1=0, p2=0;
		Arrays.sort(a);
		Arrays.sort(b);
		while(p1<n && p2<m) {
			if(a[p1] == b[p2]) {
				answer.add(b[p2++]);
				p1++;
			}
			else if(a[p1] < b[p2]) p1++;
			else p2++;
		}
 		return answer;
	}
	
	public static void main(String[] args) {
		J02 J = new J02();
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
