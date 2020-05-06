
public class MaxPalindrome {
	public static boolean[][] isPalin(String str) {
		boolean dp[][] = new boolean[str.length()][str.length()];

		for (int gap = 0; gap < str.length(); gap++) {
			for (int i = 0, j = gap; j < str.length(); i++, j++) {
				if (gap == 0)
					dp[i][j] = true;
				else if (str.charAt(i) == str.charAt(j)) {
					if (gap == 1)
						dp[i][j] = true;
					else if (dp[i + 1][j - 1])
						dp[i][j] = true;
				}
			}

		}
		return dp;

	}

	public static int Longsubstring(String str, int dp[][]) {
		boolean isPalin[][] = isPalin(str);
		for (int gap = 0; gap < str.length(); gap++) {
			for (int i = 0, j = gap; j < str.length(); j++, i++) {
				if (gap == 0)
					dp[i][j] = 1;
				else if (str.charAt(i) == str.charAt(j) && gap == 1)
					dp[i][j] = 2;
				else if (str.charAt(i) == str.charAt(j) && isPalin[i + 1][j - 1])
					dp[i][j] = dp[i + 1][j - 1] + 2;
				else
					dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
			}

		}
		return dp[0][str.length() - 1];

	}

	public static int Longsubseq(String str, int dp[][]) {

		for (int gap = 0; gap < str.length(); gap++) {
			for (int i = 0, j = gap; j < str.length(); j++, i++) {
				if (gap == 0)
					dp[i][j] = 1;
				else if (str.charAt(i) == str.charAt(j))

					dp[i][j] = dp[i + 1][j - 1] + 2;
				else
					dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
			}

		}
		return dp[0][str.length() - 1];

	}

	public static int subseqcount(String str, int dp[][]) {

		for (int gap = 0; gap < str.length(); gap++) {
			for (int i = 0, j = gap; j < str.length(); j++, i++) {
				if (gap == 0)
					dp[i][j] = 1;
				else if (str.charAt(i) == str.charAt(j)) {
					dp[i][j] += dp[i + 1][j - 1] + 1; // when both first and last character is inclded.
					dp[i][j] += dp[i + 1][j] + dp[i][j - 1] - dp[i + 1][j - 1]; // when one character is included from
																				// first and last at a time.

					// dp[i][j] = dp[i + 1][j] + dp[i][j - 1] + 1;
				} else
					dp[i][j] = dp[i + 1][j] + dp[i][j - 1] - dp[i + 1][j - 1];
			}
		}

		return dp[0][str.length() - 1];
	}

	public static void main(String args[]) {
		String str = "aabba";
		int dp[][] = new int[str.length()][str.length()];
		//System.out.println(Longsubstring(str, dp));
		System.out.println(subseqcount(str, dp));
		for(int a[]:dp)
		{
			for(int b:a)
				System.out.print(b+" ");
			System.out.println();
		}

	}

}