package array;
import java.util.*;

public class J10 {
	//방향 배열 dx[0], dy[0] 이라고 하면 나보다 윗행의 값이된다.
	int[] dx = {-1,0,1,0};
	int[] dy = {0,1,0,-1};
	public int solution(int n, int[][] arr) {
		int answer = 0;
		//배열을 탐색하기 위한 이중 for문
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				//대소비교용값
				boolean flag = true;
				//시계방향으로 돌면서 검사한다.
				for(int k=0; k<4; k++) {
					//방향 배열의 값을 더해준 값을 저장한다.
					int nx = i + dx[k];
					int ny = j + dy[k];
					//방향의 값과 현재의 값이 크거나 같으면 봉우리가 아니므로 false하고 break한다.
					//반드시 먼저 인덱스 범위를 지정해서 걸러준다.
					if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]) {
						flag = false;
						break;
					}
				}
				//k를 다 돌았는데도 true로 남아있는경우, 상하좌우가 다 작다는 뜻이므로 카운팅한다.
				if(flag) answer++;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		J10 J = new J10();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(J.solution(n,arr));
	}
}
