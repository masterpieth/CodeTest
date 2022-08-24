package string;
import java.util.*;

public class J03 {

	public String solution(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE, pos;
		
		//방법1: 배열로 처리하여 최댓값 알고리즘으로 검사하기
		String[] s = str.split(" ");
		for(String x: s) {
			int len = x.length();
			if(len>m) {
				m = len;
				answer = x;
			}
		}
		
		//방법2:index of 사용
		//indexOf: 해당 문자열이 앞에서부터 처음 발견되는 위치를 반환한다. 찾지 못하면 -1을 반환
		//앞에서부터 차례로 검사하며 띄어쓰기 발견되면 해당 인덱스를, 발견 못하면 -1을 리턴한다.
		//lastIndexOf: 뒤에서부터 검사한다.
		while((pos = str.indexOf(' ')) != -1) {
			//substring: 시작값부터 pos 직전까지 자른다
			String tmp=str.substring(0, pos);
			int len = tmp.length();
			//len>=m 하면 길이 같은 단어도 리턴됨
			if(len>m) {
				m = len;
				answer = tmp;
			}
			//tmp를 변경하기 위해서, 이전에 찾은 단어까지는 없애고, 띄어쓰기 뒷편부터 잘라낸다.
			str = str.substring(pos+1);
		}
		if(str.length()>m) answer = str;
		return answer;
	}
	public static void main(String[] args) {
		J03 J = new J03();
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(J.solution(str));
	}
}
