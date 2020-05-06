
public class Matrix_90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 0, 0, 0, 0, 1 },
				        { 1, 0, 0, 1, 0 },
				        { 0, 0, 0, 0, 0 },
				        { 0, 0, 0, 1, 0 },
				        { 1, 0, 0, 0, 1 } };
//		int i = 0;
//		int j = 0;
//		while (i < 0 || j < 0 || j > 5 || i > 5)
//
//		{
//			if (arr[i][j] == 1) {
//				i++;
//
//				if (arr[i][j] == 1) {
//					j--;
//
//					if (arr[i][j] == 1) {
//						i++;
//
//					}
//					else i++,j++
//
//				}
//
//			}
//
//	
//		}
//		System.out.println(i+" "+j);		
	int r=0;
	int c=0;
		int dir=0;	
	while(true)
	{  dir =  (dir+(arr[r][c])%4);
	
		if (dir==0)
		 {	
			c++;
			if (c==arr[0].length)
			{
				System.out.println(r+" "+(c-1));
				break;
			}
			
		 }
			else if (dir==1)
			{
				r++;
				if (r==arr.length)
				{
			System.out.println((r-1)+" "+(c-1));
				}	
			}
		
			else if (dir==2)
			{
				c--;
				if (c==-1)
				{
					System.out.println(r+" "+(c+1));
				}	
			
			}		 
			else if (dir==3)
			{
				r--;
				if (r==-1)
				{
					System.out.println((r+1)+" "+(c));
				}	
			}
	
	
	}
	
	
	
	
	
	
		
			
	}
	
	}
	

