import java.util.Arrays;

public class Jumpgame {
	public static int minjumps(int idx,int arr[])
	{
		if(idx==arr.length-1)
		{
			return 0;
		}
		if(arr[idx]==0)
		{
			return (int)1e7;
		}
		int minAns=(int)1e7;
		for(int i=1;i<=arr[idx];i++)
		{
			int minJmp= minjumps(idx+i, arr);
			if(minJmp!=(1e8) &&minJmp+1<minAns)
			{
				minAns=minJmp+1;
			}
		}
	return minAns;
	}
	
	public static int minjumps02(int idx,int arr[],int dp[])
	{
		if(idx==arr.length-1)
		{
			return 0;
		}
		if(arr[idx]==0)
		{
			return (int)1e7;
		}
		if(dp[idx]!=0)
			return dp[idx];
		int minAns=(int)1e7;
		int minJmp=0;
		for(int i=1;i<=arr[idx];i++)
		{	
			if(i+idx<=arr.length-1)
			{ minJmp= minjumps02(idx+i, arr,dp);}
			
			if(minJmp!=(1e8) &&minJmp+1<minAns)
			{
				minAns=minJmp+1;
			}
		}
	return dp[idx]=minAns;
	}	
	   // for 1 3 5 8 9 2 6 7 8 9 10 first we will check how far  this can go  0th to 1th index as 
	   //1 then if cmax==new max we will update steps and currentmax if new max exceeds  arr length -1 we will return steps 
	   // for val  3 nmax will  be 1(its index) +3= 4th index   and now as cmax=i cmax will update to newmax  which is 4 
	
	//   again for i=2 new max will be 2+5=7 FOR I=3 IT IS 11 HENCE THE  RETURN ANS   
 	
	
	
	
	public int jump03(int[] arr) {
	        if(arr.length<=1)
	            return 0;
	        int cmax=0,nmax=0,steps=1;
	        for(int i=0;i<arr.length;i++)
	        {
	            nmax = Math.max(nmax,arr[i]+i);
	            if(nmax>=arr.length-1)
	                return steps;
	            if(cmax==i){
	                cmax=nmax;
	            steps++;
	            }
	            }
	  return steps;           
	    }
	public int jumpgam04(int arr[])
	{	 int dp[]= new int [arr.length];
		Arrays.fill(dp, (int)1e7);
		dp[arr.length-1]=0;
		for (int i=arr.length-2;i>=0;i--)
		{
			int minAns=(int)1e7;
			for(int j=1; j<=arr[i]&&j+i<=arr.length-1;j++)
			{ int minjmp= dp[i+j];
				 if(minjmp!=(int)1e7)
				 minAns=Math.min(minAns, minjmp+1);
				 
			}
		dp[i]=minAns;
		}
	return dp[0];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(minjumps(0, new int[] {2,3,1,1,4}));
System.out.println(minjumps02(0, new int[] {2,1},new int [20]));	
	}

}
