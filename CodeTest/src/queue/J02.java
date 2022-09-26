package queue;
import java.util.*;
import java.util.Queue;

public class J02 {
	public String solution(String s1, String s2) {
		String answer = "YES";
		Queue<Character> q = new LinkedList<>();
		for(char x : s1.toCharArray()) q.offer(x);
		for(char x : s2.toCharArray()) {
			if(q.contains(x)) {
				if(x!= q.poll()) return "NO";
			}
		}
		if(!q.isEmpty()) return "NO";
		return answer;
	}
	public static void main(String[] args) {
		J02 J = new J02();
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println(J.solution(s1,s2));
	}
}
