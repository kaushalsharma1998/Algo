
public class Stair_Case {
	public static int StairCase( int n)
	{  
		if(n==1|n==0)
			{return 1;}
		else if (n==2)
			{return 2;}
	
			
	 return (StairCase(n-1)+ StairCase(n-2)+ StairCase(n-3)); 
	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println(StairCase(2));
	}

}
