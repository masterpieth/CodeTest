package ss;
import java.util.*;

public class J01 {
	public int[] solution(int[] arr) {
		int idx = 0;
		for(int i=0; i<arr.length;i++) {
			idx = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[idx]>arr[j]) idx = j;
			}
			int temp = 0;
			temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;
		}
		return arr;
	}
	public static void main(String[] args) {
		J01 J = new J01();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int x : J.solution(arr)) {
			System.out.print(x + " ");
		}
	}
}
