// Using Tabulation Technique
public class Fibonaci2 {

    public static int fib(int n) {
        int[] memo = new int[n + 1];
        memo[0] = 0;
        memo[1] = 1;
        for (int i = 2; i <= n; i++)
            memo[i] = memo[i - 1] + memo[i - 2];
        return memo[n];

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }

}
