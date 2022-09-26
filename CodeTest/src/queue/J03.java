package queue;
import java.util.*;

public class J03 {
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		Queue<Person> Q = new LinkedList<>();
		for(int i=0; i<n; i++) {
			Q.offer(new Person(i, arr[i]));
		}
		while(!Q.isEmpty()) {
			Person tmp = Q.poll();
			for(Person x : Q) {
				if(x.priority > tmp.priority) {
					Q.offer(tmp);
					tmp = null;
					break;
				}
			}
			if(tmp != null) {
				answer++;
				if(tmp.id==m) return answer;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		J03 J = new J03();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(J.solution(n,m,arr));
	}
	class Person {
		int id;
		int priority;
		public Person(int id, int priority) {
			this.id = id;
			this.priority = priority;
		}
	}
}
