
public class Merge_Sort {

	

	public static int[] merge(int arr[],int arr2[])
	{	int j = 0,k = 0,i = 0;
	  	int[] temp=new int[arr.length+arr2.length];
	  	
		while(i<arr.length && j<arr2.length)
		{   
//			if(i<=arr.length&&j<arr2.length)
			
//			{
			if (arr[i]<arr2[j])
				{
					temp[k]=arr[i];
					
					k++;
					i++;
				}
			else
			{ 
				temp[k]=arr2[j];
				j++;
				k++;
					
			}
//			}
			//System.out.print(temp[k-1]+" ");
			
		
		}
		
		while(i<arr.length)
		{
			temp[k]=arr[i];
			k++;
			i++;
		}
		
		while(j<arr2.length)
			{
				temp[k]=arr2[j];
				k++;
				j++;
			}
		return temp;
	}
	public static int[] mergesort(int[] arr,int li,int hi)
	{
		if(li==hi)
		{ int[] base=new int[1];
			base[0]= arr[li];
			return base;
			
		}
		int mid=(li+hi)>>>1;
		int[] left=mergesort(arr, li, mid);
		int[] right=mergesort(arr, mid+1, hi);
		return merge(left, right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,0,1,0};
//		int[] arr2= {1,3,5,7,9};
		int []  mergearr=mergesort(arr,0,arr.length-1);
		
		
		for (int i=0;i<mergearr.length;i++)
			System.out.print(
					mergearr[i]+" ");
	}

}
