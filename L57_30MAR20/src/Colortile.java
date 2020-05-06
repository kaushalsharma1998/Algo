
public class Colortile {
	public static int tile(int n, int m) {
		if (n <= m)// n==m two ways either h or v ,n<m only 1 way horizontal
			return n == m ? 2 : 1;

		int hori = tile(n - 1, m);
		int verti = tile(n - m, m);
		return hori + verti;
	}

	public static int tile01(int n, int m, int dp[]) {
		if (n <= m) {
			dp[n] = (n == m ? 2 : 1);
			return dp[n];

		}
		if (dp[n] != 0) {
			return dp[n];
		}
		int hori = tile01(n - 1, m, dp);
		int verti = tile01(n - m, m, dp);
		return dp[n] = hori + verti;
	}

	public static int tile02(int n, int m, int dp[]) {
		for (int i = 0; i < n; i++) {
			
			if(i<=m)
			{
				dp[i]=(i==m)?2:1;
			continue;
			}
			dp[i]=dp[i-1]+dp[i-m];
		}
		return dp[n];
		}

	

	public static void main(String args[]) {
//		System.out.println(tile(30, 1));
		System.out.println(tile01(7, 4, new int[18]));

	}

}
