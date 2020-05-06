
public class Remove_Hi_Void {
	 public static void RemoveHiVoid(String str, String ans)
	{
		if(str.length()==0)
			
		{
			System.out.println(ans);
			return;
	}
		if(str.length()>1&&str.charAt(0)=='h'&&str.charAt(1)=='i')
		{
			RemoveHiVoid(str.substring(2), ans);
			
		}
		else {
			RemoveHiVoid(str.substring(1), ans+str.charAt(0));
			
		}
			
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveHiVoid("hihihhhi", "");
	}

}
