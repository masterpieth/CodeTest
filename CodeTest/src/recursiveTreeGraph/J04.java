package recursiveTreeGraph;

public class J04 {
    static int[] fibo;
    public int DFS(int n) {
        if(fibo[n] > 0) return fibo[n];
        if(n==1) return fibo[n] = 1;
        else if(n==2) return fibo[n] = 1;
        else return fibo[n] = DFS(n-2) + DFS(n-1);
    }
    public static void main(String[] args) {
        J04 J = new J04();
        int n=45;
        fibo = new int[n+1];
        J.DFS(n);
        for(int f : fibo) System.out.print(f + " ");
    }
}
