package recursiveTreeGraph;

public class J02 {
    public void DFS(int n) {
        if(n==0) return;
        else {
            DFS(n/2);
            System.out.print(n%2);
        }
    }
    public static void main(String[] args) {
        J02 J = new J02();
        J.DFS(11);
    }
}
