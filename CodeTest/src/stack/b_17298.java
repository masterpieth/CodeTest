package stack;
import java.util.Stack;
import java.util.*;
import java.io.*;


public class b_17298 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> s = new Stack<>();
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < n; i++) {
			while(!s.isEmpty() && arr[s.peek()] < arr[i]) {
				arr[s.pop()] = arr[i];
			}
			s.push(i);
		}
		
		while(!s.isEmpty()) {
			arr[s.pop()] = -1;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i : arr) sb.append(i + " ");
		
		System.out.println(sb);
	}
}
