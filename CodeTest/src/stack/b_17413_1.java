package stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class b_17413_1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		Stack<Character> s = new Stack<>();
		boolean isReverse = true;
		
		for(char c : str.toCharArray()) {
			if(c == '<') {
				while(!s.isEmpty()) {
					bw.write(s.pop());
				}
				isReverse = false;
				bw.write(c);
			}
			else if(c == '>') {
				isReverse = true;
				bw.write(c);
			}
			else {
				if(isReverse) {
					if(c == ' ') {
						while(!s.isEmpty()) {
							bw.write(s.pop());
						}
						bw.write(c);
					} else {
						s.push(c);
					}
				}
				else {
					bw.write(c);
				}
			}
		}
		while(!s.isEmpty()) {
			bw.write(s.pop());
		}
		bw.flush();
	}
}
