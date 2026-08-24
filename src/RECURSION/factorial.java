package RECURSION;

public class factorial {
    public static int fact(int n ) {
        if(n==1||n==0) return 1;
        int ans =n*fact(n-1);
        System.out.println(ans);
        return ans;
    }
    public static void main(String[] args) {
        int n =5;
        fact(5);
    }
}
