
public class Target_Permutation {

	public static int TargetPermutation(int arr[], int target, String ans) {
		if (target == 0) {
			System.out.print(ans + " ");
			return 1;
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (target - arr[i] >= 0)
				count += TargetPermutation(arr, target - arr[i], ans + arr[i] + "");
		}
		return count;
	}

	public static int UsingEquiSet(int arr[], int vidx, int set1, int target, String ans1) {
		if (vidx >= arr.length||(set1 == target))
		{ if (set1 == target)
		{
			System.out.println(ans1);
			return 1;

		}

			return 0;
		}
				
		int count = 0;
		if (set1 + arr[vidx] <= target)
		{	count += UsingEquiSet(arr, vidx+1, set1 + arr[vidx], target, ans1 + arr[vidx] + "");
		
		count += UsingEquiSet(arr, vidx+1, set1, target, ans1);
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 5, 7 };
//	System.out.println(TargetPermutation(arr, 10, ""));
		System.out.println(UsingEquiSet(arr, 0, 0, 10, ""));

	}

}
