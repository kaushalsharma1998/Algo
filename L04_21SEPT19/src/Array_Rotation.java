

public class Array_Rotation {

		public static void Rotate_Array_bw_index(int arr[],int r)
	
	{
		int temp[]=new int[arr.length];
		int k=0;
		for (int i=r;i<arr.length;i++)
		{
			temp[k]=arr[i];
			k++;
		}
		
		for ( int  i=0;i<r;i++)
		{
			temp[i]=arr[i];
			
		}
		for (int j=0;j<temp.length;j++)
		{
			System.out.print(" "+temp[j]);
		
		}
			
	
	
	}
	
	 public static void rev(int arr[],int si,int ei)
	 {
		 while (si<=ei)
		 {swap(arr,si,ei);
		 si++;
		 ei--;}
	 }
	 private static void swap(int arr[],int i, int j) {
		int temp;
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	public static void  rotation2 (int arr[],int r)
	 {
		 rev(arr,0,r-1);
		 rev(arr,r,arr.length-1);
		 rev(arr,0,arr.length-1);
		 
		 for(int a:arr)
				System.out.print(a);
				
	 }
	public static int gcd(int a ,int b)
	{
		if(b==0)
		return a;
		else return gcd(a,a%b);
	}

	public static void juggling (int arr[],int r)
	{ System.out.println(gcd(r, arr.length));
     System.out.println(gcd(2, 7)); 
	System.out.println(arr.length);
     
   		 for (int j=0;j<gcd(r,arr.length);j++)
		 {
			  int temp=arr[j];
			 arr[j]=arr[j+r];
			 arr[r+j]=temp;
		 }
	}
	
	
	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5,6,7};
		
		
		//rotation2(arr, 1);
//		for(int a:arr)
		System.out.println();
//		
		juggling(arr, 2);
		for(int a:arr)
			System.out.print(a);
//			

	}
}
	
			
	
	
		
	


