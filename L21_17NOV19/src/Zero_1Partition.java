
public class Zero_1Partition {

	public static void zero_1(int arr[],int low	,int high)

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
				itr++;
			
			}
			
		}
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr[]= {0,1,0,1,1,0,0,1};
zero_1(arr, 0, arr.length-1);	 
 for(int i=0;i<arr.length;i++)
	 {
		 System.out.print(arr[i]);
	 }
	}

}
