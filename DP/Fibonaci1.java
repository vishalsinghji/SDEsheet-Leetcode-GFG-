import java.util.*;
/**
 * Fibonaci1 Memonization
 */
public class Fibonaci1 {
    static int memo[];

    static int fib(int n)
    {
        if(memo[n]==-1)
        {
            int res;
            if(n<=1)
            return n;
            else 
            res=fib(n-1)+fib(n-2);
            memo[n]=res;
        }
        return memo[n];
    }
    public static void main(String[] args) {
        int n=5;
        memo=new int[n+1];
        Arrays.fill(memo,-1);
        System.out.println(fib(n));
    }
}