
public class TargetPSS {
	public static int TPSS(int arr[],int vidx,int target,String ans )
	{
		if (target==0||vidx>=arr.length)
		{
			if(target==0)
			{ System.out.print(ans+" ");
				return 1;
			}
			return 0;
		}
		int count =0;
		if (target-arr[vidx]>=0)
		{
			count+=TPSS(arr, 0, target-arr[vidx], ans+arr[vidx]+"");
		}
		count+=TPSS(arr, vidx+1, target, ans);
	return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,5,7};
 System.out.println(TPSS(arr, 0, 10, ""));
	}

}
