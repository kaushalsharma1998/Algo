
public class No_Of_Char {


	public static String no_of_char(String str,int idx, int count)
	{
		if(idx==str.length())
		{	 String ans= str.charAt(idx-1)+ (count>1?count+"":"");
			return ans;
		}
		
	 if(str.charAt(idx-1)==str.charAt(idx))
		 return no_of_char(str, idx+1, count+1);
	 else {
	 
	 String ans=str.charAt(idx-1)+(count>1?count+"":"");
	 return ans+no_of_char(str, idx+1, 1);
	 
	}}
	public static void comprsn(String a)
	{	int i;
		int count =1;
		String ans = "";
		for(i=1;i<a.length();i++)
		{
			if(a.charAt(i-1)==a.charAt(i))
			{
				count++;
			
			}
			else
			{ 
				ans+=a.charAt(i-1)+""+count;
				count=1;
			}
		}
		ans+=a.charAt(i-1)+""+count;
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("aaabcdef");
		//System.out.println(no_of_char(s, 1, 1));
		comprsn(s);
	}

}
