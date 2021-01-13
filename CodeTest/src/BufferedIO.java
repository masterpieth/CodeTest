import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BufferedIO {
	public static void main(String[] args) throws IOException {
		/* 버퍼(Buffer)
		 * : 데이터를 한 곳에서 다른 곳으로 전송하는 동안 일시적으로 그 데이터를 보관하는 임시 메모리 영역
		 * 입출력 향상을 위해 사용함
		 * 
		 * 버퍼 플러시(Buffer flush)
		 * : 버퍼에 남아있는 데이터를 출력시킴(버퍼를 비우는 동작)
		 * 입력: BufferedReader
		 * 출력: BufferedWriter
		 *  */
		try {
			
			/* BufferedReader 사용예 */
			//콘솔에서 입력받음
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			//파일에서 입력받음
//			FileReader fr = new FileReader("파일명");
//			BufferedReader brf = new BufferedReader(fr);
			
			//기본적으로 한줄씩 읽어온다
			String str = br.readLine();
			//1 4 이렇게 입력을 받는 경우 array로 처리시켜서 후처리를 함
			//br은 string으로 받아오기 때문에 필요시 형변환이 필요하다.
			//쪼개는 방법 1.StringTokenizer
			StringTokenizer st = new StringTokenizer(str);
			int a1 = Integer.parseInt(st.nextToken());
			//쪼개는 방법 2.split(생략)
			//사용후 리소스 반납 필수
			br.close();
			/* ----------------------- */
			
			/* BufferedWriter 사용예 */
			int sth = 12;
			//기본적으로 개행이 없기 때문에 필요시 개행처리를 해줘야함
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			bw.write("출력할 글자\n");
			bw.newLine(); //\n과 동일함
			bw.write(String.valueOf(sth)); //데이터 출력의 경우 string 변환이 필요함
			bw.flush(); //남아있는 데이터를 모두 출력하고 없앰
			bw.close(); //리소스 반납
			/* ----------------------- */
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
