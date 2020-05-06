import java.util.Arrays;

public class LBS {
	public static void lbsfn(int arr[]) {
		int lbs[] = new int[arr.length];
		int lis[] = lis(arr);
		int lds[] = lds(arr);
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			lbs[i] = lis[i] + lds[i] - 1;
			System.out.print(lbs[i]+" ");
			max = Math.max(max, lbs[i]);
		}
		System.out.println();
		System.out.print(max);
		
	}

	private static int[] lds(int[] arr) {
		int dp[] = new int[arr.length];
		Arrays.fill(dp, 1);
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j])

					dp[i] = Math.max(dp[i], dp[j] + 1);
			}

		}
		for(int i=0;i<dp.length;i++ )
			System.out.print(dp[i]+" ");
	System.out.println();
		return dp;

	}

	private static int[] lis(int[] arr) {
		int dp[] = new int[arr.length];
		Arrays.fill(dp, 1);
		for (int i = arr.length-2; i >=0; i--) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j])

					dp[i] = Math.max(dp[i], dp[j] + 1);
			}

		}
		for(int i=0;i<dp.length;i++ )
			System.out.print(dp[i]+" ");
	System.out.println();
		return dp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	lbsfn(new int[] {0,8,4,12,2,10,6,14,1,9,5,13,11,7,15});
	}

}
