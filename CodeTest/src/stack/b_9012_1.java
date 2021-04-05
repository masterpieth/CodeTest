package stack;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class b_9012_1 {
	public static String isVPS(String str) {
        Stack<Character> s = new Stack<>();
        for(char c : str.toCharArray()) {
            if(c == '(') s.push(c);
            else {
                if(!s.isEmpty()) s.pop();
                else return "NO";
            }
        }
        if(s.isEmpty()) return "YES";
        else return "NO";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0) {
            bw.write(isVPS(sc.next()) + "\n");
        }
        bw.flush();
    }
}
