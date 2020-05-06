
public class TargetPSUSS {

	public static int TPSUSS(int arr[],int vidx,int map,int target,String ans )
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
		{ if ((map&(1<<(vidx)))==0)
		{
			map|= (1<<(vidx));
			count+=TPSUSS(arr, 0,map, target-arr[vidx], ans+arr[vidx]+"");
			map&= ~(1<<(vidx));
		}
		}
		count+=TPSUSS(arr, vidx+1,map, target, ans);
	return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,5,7};
 System.out.println(TPSUSS(arr, 0,0, 10, ""));
	}

}
