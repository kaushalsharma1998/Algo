import java.util.Arrays;

public class LDS {

	public static int lds(int arr[]) {
		int max_ = 0;
		int dp[] = new int[arr.length];
		Arrays.fill(dp, 1);
		for (int i = arr.length - 2; i >= 0; i--) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j])
					dp[i] = Math.max(dp[i], dp[j]+1); 
			}
			max_ = Math.max(max_, dp[i]);
		}
		for (int a : dp)
			System.out.print(a + " ");
		System.out.println();
		return max_;
	}

	public static void main(String args[]) {
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60, 80 };
		int arr2[]= {0,8,4,12,2,10,6,14,1,9,5,13,11,7,15};
		System.out.println(lds(arr2));
	}
}
