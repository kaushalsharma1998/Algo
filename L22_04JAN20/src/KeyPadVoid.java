
public class KeyPadVoid {
	public static void KeypadVoid(String str,String words[],String ans)
	{
		if(str.length()==0)
			{
				System.out.print(ans+" ");
				return ;
				
			}
	
		int indx1= str.charAt(0)-'0';
	
	String newp=words[indx1];
	for(int i=0;i<newp.length();i++)
	{ 
		KeypadVoid(str.substring(1), words, ans+newp.charAt(i));
	    
		
	}
	
	if(str.length()>1)
	{	
		int indx2=indx1*10 +(str.charAt(1)-'0');
		if (indx2>9&&indx2<12)
		{
		String newp2=words[indx2];
		for(int i=0;i<newp2.length();i++)
			{ 
				KeypadVoid(str.substring(2), words, ans+newp2.charAt(i));
	    
		
			}
	}
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words[]={".","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz","@#"};
		
		 KeypadVoid("10773",words,"");
	}

}
