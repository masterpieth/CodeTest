package array;
import java.util.*;

public class J03 {
	public ArrayList<String> solution(int n, int[] arr1, int[] arr2) {
		ArrayList<String> answer = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			if(arr1[i] == arr2[i]) answer.add("D");
			else if(arr1[i] == 1 && arr2[i] == 3) answer.add("A");
			else if(arr1[i] == 2 && arr2[i] == 1) answer.add("A");
			else if(arr1[i] == 3 && arr2[i] == 2) answer.add("A");
			else answer.add("B");
		}
		return answer;
	}
	
	public static void main(String[] args) {
		J03 J = new J03();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		
		for(int i=0;i<n;i++) {
			arr1[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			arr2[i] = sc.nextInt();
		}
		
		for(String x : J.solution(n, arr1, arr2)) {
			System.out.println(x);
		}
	}
}
