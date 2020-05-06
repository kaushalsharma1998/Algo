
public class DpmazeHV {

	public static int mazebox(int sr, int sc, int er, int ec, int dp[][]) {
		if (sr == er && sc == ec) {
			dp[sr][sc] = 1;
			return 1;
		}
		int count = 0;

		if (dp[sr][sc] != 0)
			return dp[sr][sc];
		if (er == ec && dp[sc][sr] != 0)
			return dp[sc][sr];
		if (sr + 1 <= er) {
			count += mazebox(sr + 1, sc, er, ec, dp);
		}
		if (sc + 1 <= ec) {
			count += mazebox(sr, sc + 1, er, ec, dp);
		}
		dp[sr][sc] = count;
		dp[sc][sr] = count;
		return count;
	}

	public static int mazebox02(int sr, int sc, int er, int ec, int dp[][]) {
		for (int i = er; i >= sr; i--) {
			for (int j = ec; j >= sc; j--) {
				int count = 0;
				if (i == er && j == ec) {
					dp[i][j] = 1;
					continue;
				}
				if (i + 1 <= er) {
					count += dp[i + 1][j];
				}
				if (j + 1 <= ec)
					count += dp[i][j + 1];
				dp[i][j] = count;
			}
		}
		return dp[0][0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mazebox(0, 0, 2, 2, new int[3][3]));
		System.out.println(mazebox02(0, 0, 2, 2, new int[3][3]));
	}

}
