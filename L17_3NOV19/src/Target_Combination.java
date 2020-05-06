
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Target_Combination {

	public static int TargetCombination(int arr[], int vidx, int target, String ans) {
		if (target == 0) {
			System.out.print(ans + " ");
			return 1;
		}
		int count = 0;
		for (int i = vidx; i < arr.length; i++) {
			if (target - arr[i] >= 0)
				count += TargetCombination(arr, i, target - arr[i], ans + arr[i] + "");
		}
		return count;
	}

	public static int TargetCombinationSingleUse(int arr[], int vidx, int target, String ans) {
		if (target == 0) {
			System.out.print(ans + " ");
			return 1;
		}
		int count = 0;
		for (int i = vidx; i < arr.length; i++) {
			if (target - arr[i] >= 0)
				count += TargetCombinationSingleUse(arr, i + 1, target - arr[i], ans + arr[i] + "");
		}
		return count;
	}
//
	public static ArrayList<String> TargetCombinationSingleUsePermutation2(int arr[], int vidx, int target,
			String ans) {
		if (target == 0) {
			ArrayList<String> base = new ArrayList<String>();
			base.add(ans);
			return base;
		}
		// int count =0;
		ArrayList<String> recAns = new ArrayList<String>();
		ArrayList<String> myAns = new ArrayList<String>();
		for (int i = vidx; i < arr.length; i++) {
			if (target - arr[i] >= 0) {
				recAns = TargetCombinationSingleUsePermutation2(arr, i + 1, target - arr[i], ans + arr[i] + "");
				for (String p : recAns) {
					myAns.add(p);
				}
			}
		}

		return myAns;
	}
//
	public static int TargetCombinationSingleUsePermutation(int arr[], boolean isdone[], int target, String ans) {
		if (target == 0) {
			System.out.print(ans + " ");
			return 1;
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (target - arr[i] >= 0 && !isdone[i]) {
				isdone[i] = true;
				count += TargetCombinationSingleUsePermutation(arr, isdone, target - arr[i], ans + arr[i] + "");
				isdone[i] = false;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 5, 7 };
	//	 boolean isdone[]=new boolean[4];
		//System.out.println(TargetCombination(arr, 0, 10, ""));
		//System.out.println(TargetCombinationSingleUse(arr, 0, 10, ""));
	//	System.out.println(TargetCombinationSingleUsePermutation(arr, new boolean[4], 10, ""));
	//System.out.println(TargetCombinationSingleUsePermutation2(arr, 0, 10, ""));
	int [] arr2= { 15, 8, 15, 10, 19, 18, 10, 3, 11, 7, 17 };
	Arrays.parallelSort(arr2);
	for(int a:arr2)
		System.out.print(a+" ");

	helper(arr2, 0, 33, new ArrayList<Integer>());
		for(ArrayList<Integer>a:ansinter)
			System.out.println(a);
	}
	 
	public static ArrayList<ArrayList<Integer>>ansinter=new ArrayList<ArrayList<Integer>>();
    public static void helper(int arr[], int vidx, int target,	ArrayList<Integer>ans) {
    
    
    		
    	
	if (target == 0) {
			ArrayList<Integer>temp = new ArrayList<Integer>();
			
			temp.addAll(ans);
			ansinter.add(temp);
			return ;
		}
	
		// int count =0;
			for (int i = vidx+1; i < arr.length; i++) {
				
			if (target - arr[i] >= 0) {  ans.add(arr[i]);	helper(arr, i, target - arr[i],ans ); ans.remove(ans.size()-1);
				
			}
		}

}
}
