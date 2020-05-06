
public class Target_Permutation_Single_Use {

	public static int TPSU(int arr[],int map,int target,String ans)
	{
		if (target==0)
		{
			System.out.print(ans+" ");
			return 1;
		}
		int count=0;
		for (int i=0;i<arr.length;i++)
		{ if ((map&(1<<(i)))==0)
			{
			map|= (1<<(i));
			count+=TPSU(arr, map, target-arr[i], ans+arr[i]+"");
			map&= ~(1<<(i));
			}
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,5,7};
		System.out.println(TPSU(arr, 0, 10, ""));
	}

}
