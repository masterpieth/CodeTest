package tpsw;
import java.util.*;

public class J05 {
	public int solution(int n) {
		int answer=0;
		int lt=1,rt=2, sum=0;
		while(lt<n && rt<n) {
			sum=0;
			for(int i=lt; i<=rt; i++) {
				sum+=i;
			}
			if(sum==n) {
				answer++;
				lt++;
				rt++;
			}
			else if(sum<n) rt++;
			else if(sum>n) lt++;
		}
		return answer;
	}
	public static void main(String[] args) {
		J05 J = new J05();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(J.solution(n));
	}
}
