
public class Target_Permutation {
	public static int UsingEquiSet(int arr[], int vidx , int target, String ans1) {
		if (vidx >= arr.length|target==0)
		{
			if (target==0)
			{
				System.out.print(ans1+" ");
				return 1;

			}
			return 0;
		}
		
		
		int count = 0;
		//for(int num: arr) {
		if (target-arr[vidx]>=0)
			{	count += UsingEquiSet(arr, vidx, target-arr[vidx], ans1 + arr[vidx] + "");
			
				count += UsingEquiSet(arr,vidx+1 , target, ans1 );
			}
		
		
		
		return count;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr[]= {2,3,5,7};
	System.out.println(UsingEquiSet(arr, 0,  10, ""));
	}

}
