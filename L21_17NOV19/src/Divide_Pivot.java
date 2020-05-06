
public class Divide_Pivot {
	public static void DividePivot(int arr[],int pivot)

	{ int temp=0;
	 int itr=0;
	 int ptr=0;
		while(itr!=arr.length)
		{ 
			if(arr[itr]<=pivot)
			{ temp = arr[itr];
				arr[itr]=arr[ptr];
				arr[ptr]= temp;
			
				
				ptr++;
			}
			itr++;
		 System.out.println(ptr+" "+ itr);
		}
		
	}

	public static void DividePivot012(int arr[],int pivot)

	{ int temp=0;
	 int itr=0;
	 int ptr=0;
		while(itr!=arr.length)
		{ 
			if(arr[itr]==0)
			{ temp = arr[itr];
				arr[itr]=arr[ptr];
				arr[ptr]= temp;
			
				
				ptr++;
			}
			
			if(arr[itr]==2)
			{ 
				temp = arr[itr];
			//	arr[itr]=arr[ptr2];
			//	arr[ptr2]= temp;
			
				
				//ptr2--;
				
			}
				itr++;
		 System.out.println(ptr+" "+ itr);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int arr[]= {10,20,11,13,14,9,8,1};
		DividePivot(arr,12);
		System.out.println();
		 for(int i=0;i<arr.length;i++)
			 {
				 System.out.print(arr[i]+" ");
			 }
			}

	}


