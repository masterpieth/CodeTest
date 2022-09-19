package hash;
import java.util.*;

public class J01 {
	public char solution(int n, String s) {
		char answer = ' ';
		HashMap<Character, Integer> map=new HashMap<>();
		for(char x: s.toCharArray()) {
			map.put(x, map.getOrDefault(x,0)+1);
		}
		//메서드 추가 설명
		//answer라는 키가 있으면 true, 없으면 false
		map.containsKey(answer);
		map.containsValue(1);
		//key의 갯수를 반환한다.
		map.size();
		//A라는 key를 삭제한다.
		map.remove('A');
		//메서드 추가 설명 끝
		int max = Integer.MIN_VALUE;
		for(char key : map.keySet()) {
			if(map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		J01 J = new J01();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		System.out.println(J.solution(n,str));
	}
}
