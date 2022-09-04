package tpsw;
import java.util.*;

public class J01 {
	public ArrayList<Integer> solution(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
		for(int i=0; i<arr1.size(); i++) {
			arr2.add(arr1.get(i));
		}
		arr2.sort(Comparator.naturalOrder());
		
		return arr2;
	}
	
	public static void main(String[] args) {
		J01 J = new J01();
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		ArrayList<Integer> arr1 = new ArrayList<>();
		for(int i=0; i<n1; i++) {
			arr1.add(sc.nextInt());
		}
		int n2 = sc.nextInt();
		ArrayList<Integer> arr2 = new ArrayList<>();
		for(int i=0; i<n2; i++) {
			arr2.add(sc.nextInt());
		}
		for(int x : J.solution(arr1,arr2)) {
			System.out.print(x + " ");
		}
	}
}
