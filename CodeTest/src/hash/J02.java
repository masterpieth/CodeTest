package hash;
import java.util.*;

public class J02 {
	public String solution(String s1, String s2) {
		String answer = "YES";
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		for(char x : s1.toCharArray()) {
			map1.put(x, map1.getOrDefault(x, 0)+1);
		}
		for(char x : s2.toCharArray()) {
			map2.put(x, map2.getOrDefault(x, 0)+1);
		}
		for(char key : map1.keySet()) {
			if(map1.get(key) != map2.get(key)) answer = "NO";
		}
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
