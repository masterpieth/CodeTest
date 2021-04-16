package queue;
import java.io.*;
import java.util.*;

public class b_17298 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] sArr = str.split(" ");
        Queue<Integer> q = new LinkedList<>();
        
        int[] arr = new int[n];
        
        for(String s : sArr) q.offer(Integer.parseInt(s));
        
        int loop = n-1;
        
        for(int i = 0; i < n-1; i++) {
            int cur = q.poll();
            int val = cur;
            
            for(int j = 0; j < loop; j++) {
                int temp = q.poll();
                q.offer(temp);
                if(val < temp) {
                	val = temp;
                	break;
                }
            }
            if(cur == val) arr[i] = -1;
            else arr[i] = val;
            loop--;
        }
        
        arr[n-1] = -1;
        
        StringBuilder sb = new StringBuilder();
        
        for(int i : arr) sb.append(i + " ");
        
        System.out.println(sb);
    }
}
