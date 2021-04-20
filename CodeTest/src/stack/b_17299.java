package stack;
import java.util.*;
import java.util.Stack;
import java.io.*;

public class b_17299 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] cnt = new int[1000001];
		int[] arr = new int[n];
		Stack<Integer> s = new Stack<>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			cnt[arr[i]]++;
		}
		
		for(int i = 0; i < n; i++) {
			while(!s.isEmpty() && cnt[arr[s.peek()]] < cnt[arr[i]]) {
				arr[s.pop()] = arr[i];
			}
			s.push(i);
		}
		
		while(!s.isEmpty()) {
			arr[s.pop()] = -1;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i : arr) sb.append(i).append(" ");
		System.out.println(sb);
    }
}
