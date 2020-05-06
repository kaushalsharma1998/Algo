
public class MatrixBox {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4, 5 },
		        	    { 6, 7, 8, 9, 10},
		        	    { 20, 30, 40, 50, 60 },
		        	    { 70, 80, 90, 100, 110 },
		        	    { 120, 130, 140, 150, 160 } };
		
		
		int rmin=0;
		int rmax=arr.length-1;
		int cmin=0;
		int cmax=arr.length-1;
		int noe=arr.length*arr.length;
		while(noe>0)
		{
			for (int j=cmin;j<=cmax&&noe>0;j++)
			{
				System.out.print(" "+arr[cmin][j]);
				noe--;
			}
			rmin++;
			for(int i=rmin;i<=rmax&&noe>0;i++)
			{
				System.out.print(" "+arr[i][cmax]);
				noe--;
				
			}
			cmax--;
			for( int j=cmax;j>=cmin;j--)
			{
				System.out.print(" "+arr[rmax][j]);
				noe--;
			}
			rmax--;
			for(int i=rmax;i>=rmin&&noe>0;i--)
			{
				System.out.print(" "+arr[i][cmin]);
				noe--;
			}
			cmin++;
			
		}
		
		
	
	
	
	
	}
	
	
	

}
