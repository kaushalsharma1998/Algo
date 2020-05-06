
public class BoardPath {

	public static int Staircase(int n, int dp[]) {
		if (n == 1 | n == 0) {
			dp[0] = 1;
			dp[1] = 1;
			return 1;
		}

		else if (dp[n] != 0) {
			return dp[n];
		} else if (n == 2) {
			dp[2] = 2;
			return 2;
		} else if (n == 3) {
			dp[3] = (Staircase(n - 1, dp) + Staircase(n - 2, dp) + Staircase(n - 3, dp));
			return dp[3];
		} else if (n == 4) {
			dp[4] = (Staircase(n - 1, dp) + Staircase(n - 2, dp) + Staircase(n - 3, dp) + Staircase(n - 4, dp));
			return dp[4];
		} else if (n == 5) {
			dp[5] = (Staircase(n - 1, dp) + Staircase(n - 2, dp) + Staircase(n - 3, dp) + Staircase(n - 4, dp)
					+ Staircase(n - 5, dp));
			return dp[5];
		}
		dp[n] = (Staircase(n - 1, dp) + Staircase(n - 2, dp) + Staircase(n - 3, dp) + Staircase(n - 4, dp)
				+ Staircase(n - 5, dp) + Staircase(n - 6, dp));
		return dp[n];

	}

	public static int boardtab(int start, int end, int dp[]) {
		for (int i = end; i >= start; i--) {
			if (i == end) {
				dp[i] = 1;
				continue;
			}
			int count = 0;
			for (int dice = 1; dice <= 6 && i + dice <= end; dice++) {
				count += dp[i + dice];
			}
			dp[i] = count;
		}
		return dp[0];
	}
	
	public static int boardtab02(int dest ,int dp[]) {
		for(int i=0;i<=dest;i++)
		{
			if (i==0) {
				dp[i]=1;
				continue;
			}
			
			for (int j = 1; j <= 6 ; j++) {
				if(i-j>=0)
				dp[i]+=dp[i-j];
			
			}
			
		}
		return dp[dest];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Staircase(10, new int[11]));
	//System.out.println(boardtab(0, 10, new int[12]));
	System.out.println(boardtab02(10,new int[11]));
	}

}
