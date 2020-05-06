    
public class Targetcombination {

	public static int targetcombination(int arr[], int target, int vidx) {
		if (target == 0 | vidx >= arr.length) {
			if (target == 0)
				return 1;
			return 0;
		}
		int count = 0;
		for (int i = vidx; i < arr.length; i++) {
			if (target - arr[i] >= 0)
				count += targetcombination(arr, target - arr[i], i);
		}
		return count;
	}

	public static int targetcombination01(int arr[], int target, int vidx, int dp[]) {
		
			if (target == 0) {
				return dp[target] = 1;

			
			
		}
		
		int count = 0;
		for (int i = vidx; i < arr.length; i++) {
			
				
			if (target - arr[i] >= 0)
		{   //if(dp[target-arr[i]]!=0)
				//return dp[target-arr[i]];
				count += targetcombination01(arr, target - arr[i], i+1, dp);

		}
		}
		return dp[target] = count;
	}
	public static int targetcombination02(int arr[],int target,int dp[])
	{ int vidx=0;
		for (int i = 0; i < arr.length; i++){
			
			for (int t = 0; t <=target; t++) 
			 {	if (t == 0) {
					dp[t] = 1;
					continue;
				}
				if (t - arr[i] >= 0)
				{		dp[t] += dp[t - arr[i]];
				
				}
			}
			
		}
		return dp[target];

			
		
	
	}
	public static void main(String args[]) {
		int dp[] = new int[11];
		System.out.println(targetcombination01(new int[] {2, 3, 5, 7 }, 10,0,dp));
		for (int a : dp)
			System.out.print(a + " ");
	}

}
