
public class MCM {
	public static int mcm(int arr[],int si,int ei,int dp[][] )
	{
		if(si+1==ei)
			return 0;
		
		int min_=(int)1e8;
		if(dp[si][ei]!=0)
			return dp[si][ei];
		for(int cut=si+1;cut<ei;cut++)
		{
			int left=mcm(arr, si, cut, dp);
			int right=mcm(arr, cut, ei, dp);
			int myCost=left+arr[si]*arr[cut]*arr[ei]+right;
			min_=Math.min(min_, myCost);
			
		}
		return dp[si][ei]=min_;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {40, 20, 30, 10, 30};
		int dp[][]=new int[arr.length][arr.length];
   System.out.println(mcm(arr, 0, arr.length-1, dp));
	}

}
