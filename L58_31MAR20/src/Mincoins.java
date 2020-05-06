import java.util.Arrays;

public class Mincoins {
	public int coinChange(int[] coins, int amount) { if (coins.length == 0 || amount <= 0)
        return 0; int dp[]=new int[amount+1];
        Arrays.fill(dp,(int)1e8);
        int ans = minCoins(coins, amount, dp);

    return ans != 1e8 ? ans : -1;
    }
    public  int minCoins(int arr[], int target, int dp[]) {
		dp[0] = 0;
    for (int t = 1; t <= target; t++)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (t - arr[i] >= 0)
            {
                dp[t] = Math.min(dp[t], dp[t - arr[i]] + 1);
            }
        }
    }
    return dp[target];
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
