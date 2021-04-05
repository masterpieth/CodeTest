package stack;
import java.util.*;
import java.io.*;

public class b_9093 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        Stack<Character> s = new Stack<>();
        
        while(t-- > 0) {
            String str = br.readLine() + "\n";
            for(char c : str.toCharArray()) {
                if(c == '\n' || c == ' ') {
                    while(!s.isEmpty()) {
                        bw.write(s.pop());
                    }
                    bw.write(c);
                } else {
                    s.push(c);
                }
            }
        }
        bw.flush();
    }
}
