package hash;
import java.util.*;

public class J04 {
	public int solution(String a, String b) {
		int answer=0;
		HashMap<Character, Integer> am = new HashMap<>();
		HashMap<Character, Integer> bm = new HashMap<>();
		for(char x : b.toCharArray()) bm.put(x, bm.getOrDefault(x, 0)+1);
		//b보다 1 작은 길이만큼의 map을 일단 먼저 만든다.
		int L = b.length()-1;
		for(int  i=0; i<L; i++) am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0)+1);
		int lt=0;
		//two pointers를 돌린다. 이제 bm과 am의 길이가 같아졌다.
		for(int rt=L; rt<a.length(); rt++) {
			am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0)+1);
			//두 map이 같은지 확인한다.
			if(am.equals(bm)) answer++;
			//lt 인덱스 값을 확인하고 카운트를 1 줄인다.
			am.put(a.charAt(lt), a.charAt(lt)-1);
			//만일 value가 0이되면 key를 제거한다.
			if(am.get(a.charAt(lt))==0) am.remove(a.charAt(lt));
			lt++;
		} 
		return answer;
	}
	public static void main(String[] args) {
		J04 J = new J04();
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		System.out.println(J.solution(a,b));
	}
}
