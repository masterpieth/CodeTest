package ss;
import java.util.*;

public class J03 {
	public int[] solution(int[] arr) {
		int size = arr.length;
		for(int i=1;i<size;i++) {
			int tmp = arr[i];
			for(int j=i-1;j>=0;j--) {
				if(arr[j]>tmp) {
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		J03 J = new J03();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int x : J.solution(arr)) {
			System.out.print(x + " ");
		}
	}
}
