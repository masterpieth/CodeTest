package array;
import java.util.*;

public class J01 {
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		answer.add(arr[0]);
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1] < arr[i]) answer.add(arr[i]);
		}
		
		return answer;
	}
	public static void main(String[] args) {
		J01 J = new J01();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int x : J.solution(n, arr)) {
			System.out.print(String.valueOf(x) + " ");
		}
	}
}
