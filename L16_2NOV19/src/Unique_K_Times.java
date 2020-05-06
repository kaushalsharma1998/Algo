
public class Unique_K_Times {
	 public static int UniqueKTimes(int arr[], int k)
	 { int ans=0;
		for(int i=0;i<32;i++)
		{ int count =0;
			for( int  ele:arr)
			{ int mask=(1<<i);
				if((ele&mask)!=0) {
					count++;
				}
			}
		
		
		if(count%k!=0)
		{
			ans|=(1<<i);
		}
	 }
		return ans;
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {3,3,3,2,2,2,4};
      
 System.out.println(UniqueKTimes(arr, 3));
	}

}
