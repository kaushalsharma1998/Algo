
public class TargetPermutation {

	public static int targetpermutation(int arr[], int target, int dp[]) {
		if (target == 0) {
			dp[target] = 0;

			return 1;

		}
		if (dp[target] != 0)
			return dp[target];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (target - arr[i] >= 0) {
				count += targetpermutation(arr, target - arr[i], dp);

			}

		}
		return dp[target] = count;
	}

	public static int targetpermutation01(int arr[], int target, int dp[]) {

		for (int t = 0; t <=target; t++) {
			if (t == 0) {
				dp[t] = 1;
				continue;
			}

			for (int i = 0; i < arr.length; i++) {
				if (t - arr[i] >= 0)
					dp[t] += dp[t - arr[i]];
			}
		}
		return dp[target];

	}

	public static void main(String args[]) {
		//int a = targetpermutation(new int[] { 2, 3, 5, 7 }, 10, new int[11]);
		//System.out.println(a);
		int dp[]=new int[11];
		System.out.println(targetpermutation01(new int[] { 2, 3, 5, 7 }, 10,dp));
		for(int a:dp)
		System.out.print(a+" ");
	}
}
