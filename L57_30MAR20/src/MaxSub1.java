import java.util.Arrays;

public class MaxSub1 {
	public static int max = 0;

	public static int sub1s(int arr[][], int x, int y, int dp[][]) {
		if (x == arr.length - 1 || y == arr[0].length - 1) {
			{
				return arr[x][y];
			}
		}
		if (dp[x][y] != -1)
			return dp[x][y];
		int ans = 0;
		int right = sub1s(arr, x, y + 1, dp);
		int down = sub1s(arr, x + 1, y, dp);
		int diag = sub1s(arr, x + 1, y + 1, dp);
		if (arr[x][y] == 1) {
			ans = Math.min(Math.min(down, right), diag) + 1;

			max = Math.max(ans, max);
		}

		return dp[x][y] = ans;

	}

	public static int sub1s02(int arr[][], int x, int y, int dp[][]) {
		for (x = arr.length - 1; x >= 0; x--) {
			for (y = arr[0].length - 1; y >= 0; y--) {

				if (x == arr.length - 1 || y == arr[0].length - 1) {
					dp[x][y] = arr[x][y];
					continue;
				}

				int ans = 0;

				if (arr[x][y] == 1) {
					ans = Math.min(Math.min(dp[x + 1][y], dp[x][y + 1]), dp[x + 1][y + 1]) + 1;

					max = Math.max(ans, max);
				}
				dp[x][y] = ans;
			}

		}
		return max;
	}

	public static void main(String args[]) {
		int dp[][] = new int[7][7];
		for (int i = 0; i < dp.length; i++)
			for (int j = 0; j < dp[0].length; j++)
				dp[i][j] = -1;

		// System.out.println(sub1s(new int[][] { { 0, 1, 1, 0, 1 }, { 1, 1, 0, 1, 0 },
		// { 0, 1, 1, 1, 0 },
		// { 1, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 0 } }, 0, 0, dp));
		// System.out.println(max);
		System.out.println(sub1s02(new int[][] { { 0, 1, 1, 0, 1 }, { 1, 1, 0, 1, 0 }, { 0, 1, 1, 1, 0 },
				{ 1, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 0 } }, 0, 0, dp));

	}

}
