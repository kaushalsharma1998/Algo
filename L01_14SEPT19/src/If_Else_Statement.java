import java.util.Scanner;

public class If_Else_Statement {

	private static Scanner scn;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		scn = new Scanner(System.in);
		System.out.print("Enter a" );
		a=scn.nextInt();
		System.out.println();
		System.out.print("Enter b" );
		b=scn.nextInt();
		System.out.println();
		System.out.print("Enter c" );
		c=scn.nextInt();
		
		if((a>b)&&(a>c))
			
		{
			System.out.println("Largest is "+a);
		}
		
		else if((b>a)&&(b>c))
		{
			System.out.println("Largest is "+b);
		}
		else {		System.out.println("Largest is "+c);

	}
	}
	
	

}
