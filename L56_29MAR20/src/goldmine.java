
public class goldmine {
	public static int goldmine01(int x, int y, int arr[][], int dp[][])

	{
		if (y == arr[0].length - 1)
			return dp[x][y] = arr[x][y];
		int dir[][] = { { 0, 1 }, { -1, 1 }, { 1, 1 } };
		int maxans=(int)-1e7;
		if(dp[x][y]!=0)
			return dp[x][y];
			
		for (int d = 0; d < 3; d++) {
			int r = x + dir[d][0];
			int c = y + dir[d][1];
			if(r<arr.length&&r>=0&&c<arr[0].length&&c>=0)	
			{
				 maxans= Math.max(maxans, goldmine01(r, c, arr, dp));
						
			}
		}
           return dp[x][y]=maxans+arr[x][y];
          
	}
	public static int driver(int arr[][])
	{	
		int maxans=(int)-1e7;
	
		for(int i=0;i<arr.length;i++)
		{
			maxans=Math.max(maxans, goldmine01(i, 0, arr, new int[arr.length][arr[0].length]));
		}
		return maxans;
	}
	 public static int goldmine02(int arr[][])
	{
		int dir[][] = { { 0, 1 }, { -1, 1 }, { 1, 1 } };
		
		for(int i=arr.length-1;i>=0;i--)
		{
			for(int j=arr[0].length-1;j>=0;j--)
			{   
				if(j==arr[0].length-1)
				{
					continue;
				}
				int maxans=(int)-1e7;
				for (int d = 0; d < 3; d++) {
					int r = i + dir[d][0];
					int c = j + dir[d][1];
					if(r<arr.length&&r>=0&&c<arr[0].length&&c>=0)	
					{
						 maxans=Math.max(maxans, arr[r][c]);
								
					}
					
				}
		           
		        arr[i][j]+=maxans;
			}
		
			
		}
		  int maxAns = (int)-1e6;
		    for (int row = 0; row < arr.length; row++)
		    {
		        maxAns = Math.max(maxAns, arr[row][0]);
		    }

		    return maxAns;

	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= new int[][] {{1,3,3},
							     {2,1,4},
							    {0,6,4}};
			System.out.println(driver(arr));
	System.out.println(goldmine02(arr));	
	}
	}


