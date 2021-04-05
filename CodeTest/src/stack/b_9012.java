package stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class b_9012 {
	public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        while(t-->0) {
            String str = br.readLine() + "\n";
            Stack<Character> s = new Stack<>();
            
            for(char c : str.toCharArray()) {
                if(c == '(') s.push(c);
                else if(c == ')' && !s.isEmpty()) s.pop();
            }
            if(s.isEmpty()) bw.write("YES\n");
            else bw.write("NO\n");
        }
        bw.flush();
    }
}
