
public class Rotate_by_r {
	 public static int  no_Of_Digits(int n)
	 { int i=0;
		 while(n!=0)
		 { n=n/10;
		 i++;
			 }
		 return i;
		 
	 }
	 public static int rotation(int n ,int r)
	 { int div=1;
	   int mul=1;
	   
	   for (int i=1; i<=(no_Of_Digits(n));i++) {
		   if (i<=r)
			   
		   {
			   mul*=10;
			   
		   }
		   else {div*=10;}
		   
		   
	   }
	   System.out.println(div+"  "+mul);
	   int rot_no= (((n%div)*mul)+(n/div));
	   return rot_no;
	  // i= (  (  (n% ( pow (10,d-r) ) ) * (pow (10,r) )) + ( n/( pow (10,d-r) ) ) );
	 }
	 
	 
	 
	 
	
	public static void main(String args[]){
		
		int a=12345;
		int r=2;
		System.out.println(no_Of_Digits(a));
		System.out.println(rotation(a, r));
		System.out.print((((12345%100)*1000)+(12345/100)));
		
	}
	

}
