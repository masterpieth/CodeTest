package recursiveTreeGraph;

public class J01 {
    public void DFS(int n) {
        if(n==0) return;
        else {
            DFS(n-1);
            System.out.print(n + " ");
        }
    }
    public static void main(String[] args) {
        J01 J = new J01();
        J.DFS(3);
    }
}
