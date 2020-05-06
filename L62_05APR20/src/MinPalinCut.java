
public class MinPalinCut {
	public static boolean[][] ispalin(String str) {
		boolean dp[][] = new boolean[str.length()][str.length()];

		for (int gap = 0; gap < str.length(); gap++) {
			for (int i = 0, j = gap; j < str.length(); j++, i++) {
				if (gap == 0) {
					dp[i][j] = true;

				} else if (str.charAt(i) == str.charAt(j)) {
					if (gap == 1)
						dp[i][j] = true;
					else if (dp[i + 1][j - 1])
						dp[i][j] = true;

				}
			}
		}
		return dp;
	}

	public static int minPalincut(String ans, int si, int ei, boolean isPalin[][], int dp[][]) {
		if (isPalin[si][ei]) {
			dp[si][ei] = 0;
			return 0;

		}
		if (dp[si][ei] != 0)
			return dp[si][ei];
		int min_ = (int)1e7;
		for (int cut = si; cut < ei; cut++) {
			int left = minPalincut(ans, si, cut, isPalin, dp);
			int right = minPalincut(ans, cut+1, ei, isPalin, dp);
			int myAns =  left + 1 + right;
			min_ = Math.min(min_, myAns);

		}
		return dp[si][ei] = min_;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abbaaba";
		boolean isPalin[][] = ispalin(str);
		
		int dp[][] = new int[str.length()][str.length()];
//		for(boolean[] a:isPalin)
//		{	for(boolean b:a )
//				System.out.print(b+" ");
//				System.out.println();
//		}		
		System.out.println(minPalincut(str, 0, str.length() - 1, isPalin, dp));
	}

}
