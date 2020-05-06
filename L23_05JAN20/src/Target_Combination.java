
public class Target_Combination {
	public static int TC(int arr[],int vidx,int target,String ans)
	{
		if (target==0)
		{
			System.out.print(ans+" ");
		return 1;
		}
	int count=0;
	for (int i=vidx;i<arr.length;i++)
	{ if (target-arr[i]>=0)
		count +=TC(arr, i, target-arr[i], ans+arr[i]+"");
	}
	
	return count;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int arr[]= {2,3,5,7};
	System.out.println(TC(arr, 0, 10, ""));
	}

}
