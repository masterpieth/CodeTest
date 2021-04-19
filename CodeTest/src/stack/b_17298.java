package stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.io.*;


public class b_17298 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		String str = br.readLine();
        String[] sArr = str.split(" ");
        
        int[] arr = new int[n];
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 0; i < n; i++) {
        	arr[i] = Integer.parseInt(sArr[i]);
        }
        
        for(int i = 0; i < n-1; i++) {
        	for(int j = i+1; j < n; j++) {
        		if(arr[i] < arr[j]) {
        			q.offer(arr[j]);
        			break;
        		}
        	}
        	if(q.size() != i+1) q.offer(-1);
        }
        q.offer(-1);
        
        while(!q.isEmpty()) {
        	bw.write(q.poll() + " ");
        }
        bw.flush();
	}
}
