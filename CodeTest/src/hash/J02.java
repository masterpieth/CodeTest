package hash;
import java.util.*;

public class J02 {
	public String solution(String s1, String s2) {
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<>();
		//s1을 map에 담는다
		for(char x : s1.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		for(char x : s2.toCharArray()) {
			//x라는 키값이 없거나, 줄이려고 봤더니 value가 0인경우 NO를 반환한다.
			if(!map.containsKey(x) || map.get(x)==0) return "NO";
			//key 값이 있는 경우에는 value를 1 줄인다.
			map.put(x, map.get(x)-1);
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
