package stack;

import java.io.*;
import java.util.Stack;

public class b_1406 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        
        String n = br.readLine();
        for(int i = 0; i < n.length(); i++) {
            s1.push(n.charAt(i));
        }
        int m = Integer.parseInt(br.readLine());
        
        while(m-- > 0) {
            String cmd = br.readLine();
            
            if(cmd.equals("L")) {
                if(!s1.isEmpty()) s2.push(s1.pop());
            }
            else if(cmd.equals("D")) {
                if(!s2.isEmpty()) s1.push(s2.pop());
            }
            else if(cmd.equals("B")) {
                if(!s1.isEmpty()) s1.pop();
            }
            else {
                s1.push(cmd.charAt(2));
            }
        }
        
        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!s2.isEmpty()) {
            sb.append(s2.pop());
        }
        
        System.out.println(sb.toString());
    }
}
