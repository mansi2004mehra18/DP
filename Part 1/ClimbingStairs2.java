
import java.util.Arrays;

public class ClimbingStairs2 { //memoization - O(n)
    public static int countWays(int n, int ways[]) {
        if(n == 0) {
            return 1;
        }
        if(n < 0) {
            return 0;
        }

        if(ways[n] != -1) { //already calculated
            return ways[n];
        }

        ways[n] = countWays(n-1, ways) + countWays(n-2, ways);
        return ways[n];
    }
    public static void main(String args[]) {
        int n=5;
        int ways[] = new int[n+1];// 0 0 0 0
        Arrays.fill(ways, -1);// -1 -1 -1 -1
        System.out.println(countWays(n,ways));
    }
}
