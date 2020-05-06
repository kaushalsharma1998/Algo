
public class Pairpeople {

	public static int pair(int n, int dp[]) {
		if (n <= 2)
			return n;

		return pair(n - 1, dp) + (pair(n - 2, dp) * (n - 1)); //PAIR NTH AND REMAINIG ARE N-1  AND FOR OTHER CALL PAIR N-2 
															//N-1TH CAN BE PAIRED WITH N-1 REMAINING AS ONE IS SINGLE
															// 2 ELEMENTS CAN BE PAIRED IN 1, BOTH SINGLE AND 1 BOTH IN PAIR HENCE 2  

	}

	public static int pair02(int n, int dp[]) {
		if (n <= 2)
			return dp[n] = n;

		if (dp[n] != 0)
			return dp[n];
		return dp[n] = pair02(n - 1, dp) + (pair02(n - 2, dp) * (n - 1));

	}

	public static int pair03(int n, int dp[]) {
		for (int i = 0; i < dp.length; i++) {
			if (i <= 2) {
				dp[i] = i;
				continue;
			}

			dp[i] = dp[i - 1] + dp[i - 2] * (i - 1);
		}
		return dp[n];
	}

	public static int pair04(int n, int dp[]) {
		if (n <= 2) {
			return n;
		}
		int a = 1;
		int b = 2;
		int c = 0;
		for (int i = 3; i <= n; i++) {
			c = b + a * (i - 1);
			a = b;
			b = c;

		}
		return c;

	}

	public static void main(String args[]) {
		System.out.println(pair04(10, new int[11]));
	}
}