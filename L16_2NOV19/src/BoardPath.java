
public class BoardPath {
 public static int Staircase(int n)
 {
		if(n==1|n==0)
		{return 1;}
	else if (n==2)
		{return 2;}
	else if (n==3)
	{return (Staircase(n-1)+ Staircase(n-2)+ Staircase(n-3));}
	else if (n==4)
	{return (Staircase(n-1)+ Staircase(n-2)+ Staircase(n-3)+Staircase(n-4));}
	else if (n==5)
	{return (Staircase(n-1)+ Staircase(n-2)+ Staircase(n-3)+Staircase(n-4)+Staircase(n-5));}
	
		return (Staircase(n-1)+ Staircase(n-2)+ Staircase(n-3)+Staircase(n-4)+Staircase(n-5)+Staircase(n-6)); 
		
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Staircase(50));
	}

}
