package hash;
import java.util.*;

public class J03 {
	public ArrayList<Integer> solution(int n, int k, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		int lt=0, rt=k-1;
		for(int i=0; i<k-1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
		}
		while(rt<n) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
			rt++;
			answer.add(map.size());
			map.put(arr[lt], map.getOrDefault(arr[lt], 0)-1);
			if(map.get(arr[lt]) == 0) map.remove(arr[lt]);
			lt++;
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
		for(int x : J.solution(n,k,arr)) {
			System.out.print(x + " ");
		}
	}
}
