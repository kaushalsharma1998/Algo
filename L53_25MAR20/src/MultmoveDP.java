
public class MultmoveDP {
	public static int multimove(int sr, int sc, int er, int ec) {
		if (sr == er && sc == ec) {
			return 1;

		}
		int count = 0;
		for (int i = 1; i <= er; i++) {
			if (sr + i <= er)
				count += multimove(sr + i, sc, er, ec);
		}
		for (int i = 1; i <= ec; i++) {
			if (sc + i <= ec)
				count += multimove(sr, sc + i, er, ec);
		}
		for (int i = 1; i <= er && i <= ec; i++) {
			if (sr + i <= er && sc + i <= ec)
				count += multimove(sr + i, sc + i, er, ec);
		}
		return count;
	}

	public static int multimove01(int sr, int sc, int er, int ec, int dp[][]) {
		if (sr == er && sc == ec) {
			return dp[sr][sc] = 1;

		}
		if (dp[sr][sc] != 0)
			return dp[sr][sc];
		int count = 0;
		for (int i = 1; i <= er; i++) {
			if (sr + i <= er)
				count += multimove01(sr + i, sc, er, ec, dp);
		}
		for (int i = 1; i <= ec; i++) {
			if (sc + i <= ec)
				count += multimove01(sr, sc + i, er, ec, dp);
		}
		for (int i = 1; i <= er && i <= ec; i++) {
			if (sr + i <= er && sc + i <= ec)
				count += multimove01(sr + i, sc + i, er, ec, dp);
		}
		return dp[sr][sc] = count;
	}

	public static int multimove02(int sr, int sc, int er, int ec, int dp[][]) {
		for (sr = er; sr >= 0; sr--)

		{
			for (sc = ec; sc >= 0; sc--) {
				if (sr == er && sc == ec) {
					dp[sr][sc] = 1;
					continue;
				}

				int count = 0;
				for (int i = 1; i <= er; i++) {
					if (sr + i <= er)
						count += dp[sr + i][sc];
				}
				for (int i = 1; i <= ec; i++) {
					if (sc + i <= ec)
						count += dp[sr][sc + i];
				}
				for (int i = 1; i <= er && i <= ec; i++) {
					if (sr + i <= er && sc + i <= ec)
						count += dp[sr + i][sc + i];
				}
				dp[sr][sc] = count;
			}
		}
		return dp[0][0];
	}

	public static void main(String args[]) {
		int dp[][] = new int[3][3];
		System.out.println(multimove(0, 0, 2, 2));

		System.out.println(multimove02(0, 0, 2, 2, dp));
		for (int a[] : dp) {
			for (int b : a) {
				System.out.print(b + " ");
			}
			System.out.println();

		}
	}
}
