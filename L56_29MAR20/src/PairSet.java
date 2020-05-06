
public class PairSet {

	public static int pairset(int n, int k) {
		if (n == k)
			return 1;
		if (n < k)
			return 0;
		if (k == 1)
			return 1;// first call denotes nth making new set and then n-1 have to be divided in k-1
						// sets while
		return pairset(n - 1, k - 1) + (pairset(n - 1, k) * k);// 2nd call denotes nth waiting to join any of the k sets
																// which are returned
// by  the n-1 ,k calls 
	}

	public static int pairset01(int n, int k, int dp[][]) {
		if (n == k) {
			dp[n][k] = 1;
			return 1;
		}
		if (n < k) {
			return 0;
		}
		if (k == 1) {
			dp[n][k] = 1;
			return 1;
		}
		if (dp[n][k] != 0) {
			return dp[n][k];
		}
		int meinonesingle = 0;
		meinonesingle = pairset01(n - 1, k - 1, dp);

		int meinothersset = 0;
		meinothersset = (pairset01(n - 1, k, dp) * k);
		return dp[n][k] = meinonesingle + meinothersset;
	}

	public static int pairset03(int n , int k)
	{
		int  dp[][]=new int[n+1][k+1];
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=k;j++)
			{	if(i<j)
				{
					dp[i][j]=0;
					continue;
				}
				if(i==j)
					{dp[i][j]=1;
				continue;}
				dp[i][j]=dp[i-1][j-1]+dp[i-1][j]*j;
				
			}
		}
	return dp[n][k];
	}

	public static void main(String args[]) {
		//System.out.println(pairset01(5, 3, new int[701][501]));
		// System.out.println(pairset(10, 9 ));
		System.out.println(pairset03(5, 3));
	}
}
