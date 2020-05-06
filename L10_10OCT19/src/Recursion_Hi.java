
public class Recursion_Hi {

public static String removeHi(String str)
{ 
	if (str.length()==0)
		{ return "";
	
	
	}
	
	if(str.length()>1&&str.substring(0,2).contentEquals("hi"))
	{return removeHi(str.substring(2));}
	
	else {
	 char ch=str.charAt(0);
	 return ch+removeHi(str.substring(1));
	 
}}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("hhiih");
		System.out.println(removeHi(s));
		
	}
	

}
