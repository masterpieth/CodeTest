package recursiveTreeGraph;

public class J03 {
    public int DFS(int n) {
        if(n==0) return 1;
        else {
            return n * DFS(n-1);
        }
    }

    public static void main(String[] args) {
        J03 J = new J03();
        System.out.print(J.DFS(5));
    }
}
