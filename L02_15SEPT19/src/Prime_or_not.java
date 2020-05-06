
public class Prime_or_not {
 public static void main(String args[])
 { int n=14;
  int flag=0;
 for (int i=2; i*i<=n;i++)
 {
	 if(n%i==0)
	 {
		flag=1;
		break;
	 }
	 
 }
 
 System.out.println(flag);
	if(flag==1) {
		System.out.print("Not Prime");
		
	} 
	 
	else 
		System.out.print("PRIME");
 }
}
