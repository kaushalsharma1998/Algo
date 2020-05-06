import java.util.Arrays;

public class MinDeletion {
	public static int lis(int arr[])
	{
		int dp[]=new int[arr.length];
		Arrays.fill(dp, 1);
		int max_=0;
		for(int i=1;i<arr.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[i]>=arr[j])
				{
					dp[i]=Math.max(dp[i], dp[j]+1);
				}
				
				
			}
			max_=Math.max(dp[i], max_);
		}
	return max_;
	
	}
	public static void main(String args[])
	{	int arr[]={0,8,4,12,2,10,6,14,1,9,5,13,11,7,15};
		int a=lis(arr);
		System.out.println("Min Deletion: "+ (arr.length-a) );
	}
}
