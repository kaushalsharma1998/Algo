import java.util.Arrays;



public class LongestIncSS {

	public static  int lIss(int arr[])
	{	 int max_=0;
		int dp[]=new int [arr.length];
		Arrays.fill(dp, 1);
		for(int i=1;i<arr.length;i++)
		{
			for( int j=0;j<i;j++)
			{
				if(arr[i]>arr[j])
					dp[i]=Math.max(dp[i], dp[j]+1);
				
			}
			max_=Math.max(max_, dp[i]);
		}
		 
		for(int i=0;i<dp.length;i++ )
			System.out.print(dp[i]+" ");
	System.out.println();
		return max_;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,22,9,33,21,50,41,60,80};
		int arr2[]= {0,8,4,12,2,10,6,14,1,9,5,13,11,7,15};
		System.out.println(lIss(arr2));
	}
	

}
