package stack;

import java.util.Scanner;

public class b_10799 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        int cnt = 0;
        int result = 0;
        char prev = ' ';
        
        for(char c : str.toCharArray()) {
            if(c == '(') {
                cnt++;
            }
            else if(c == ')') {
                cnt--;
                if(prev == '(') result += cnt;
                else result++;
            }
            prev = c;
        }
        System.out.println(result);
    }
}
