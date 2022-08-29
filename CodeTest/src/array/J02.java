package array;
import java.util.*;

public class J02 {
	public int solution(int n, int[] arr) {
		int answer = 0;
		int max = 0;
		answer+=1;
		max = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				answer++;
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		J02 J = new J02();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(J.solution(n, arr));
	}
}
