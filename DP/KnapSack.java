/*
0-1 KnapSack Problem  Recursive Solution
Here W    -------> Max Weight of knapsack
Here n    -------> Total choices we have
Here Wt[] -------> Weight Associated at particular index with profit in Val[] respectively
*/

public class KnapSack {

    public static int KnapSacks(int W, int wt[], int val[], int n) {
        if (n == 0 || W == 0)
            return 0;
        if (wt[n - 1] > W)
            return KnapSacks(W, wt, val, n - 1);
        else
            return Math.max(KnapSacks(W, wt, val, n - 1), KnapSacks(W - wt[n - 1], wt, val, n - 1) + val[n - 1]);
    }

    public static void main(String[] args) {
        int val[] = { 10, 40, 30, 50 };
        int wt[] = { 5, 4, 6, 3 };
        int W = 10;
        int n = 4;
        System.out.println(KnapSacks(W, wt, val, n));
    }
}