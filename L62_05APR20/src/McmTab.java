
public class McmTab {

	public static int mcmtab(int arr[], int dp[][]) {
		for(int gap=1;gap<arr.length;gap++)
		{
			for(int si=0,ei=gap;ei<arr.length;si++,ei++)
				
			{	
				
				
				if(si+1==ei)
				{
				dp[si][ei]=0;
				continue;
				}
				int min_=(int)1e7;
				for(int cut=si+1;cut<ei;cut++)
				{
				int left=dp[si][cut];
				int right=dp[cut][ei];
				int mycost=left+arr[si]*arr[cut]*arr[ei]+right;
				min_=Math.min(min_, mycost);
				
				}
				dp[si][ei]=min_;
			}
			
		}
		return dp[0][arr.length-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {40, 20, 30, 10, 30};
		int dp[][]=new int[arr.length][arr.length];
   System.out.println(mcmtab(arr, dp));
	}
}
