package leetcode;

import org.junit.Test;

/**
 * @author zhangyu
 * @version V1.0
 * @ClassName: ClimbingStairs
 * @Description: TOTO
 * @date 2018/12/5 16:22
 **/


public class ClimbingStairs {
    @Test
    public void fun() {
        long startTime = System.currentTimeMillis();
        int n = 44;
        int num = climbingStairs(n);
        long endTime = System.currentTimeMillis();
        System.out.println(num);
        System.out.println((endTime-startTime)/1000.0+"s");
    }

    // 动态规划，记忆算法
    private int climbingStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    private int climbStairs2(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return climbStairs2(n - 1) + climbStairs2(n - 2);
        }
    }
}
