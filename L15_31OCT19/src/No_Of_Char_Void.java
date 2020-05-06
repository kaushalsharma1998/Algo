
public class No_Of_Char_Void {


	public static void  NoOfCharVoid(String str,String ans, int count)
	{
		if (str.length() == 0)
	    {
	        System.out.println(ans);
	        return;
	    }

	    char ch = str.charAt(0);
	    String roq = str.substring(1);
	    if (roq.length() != 0)
	    {
	        if (ch == roq.charAt(0))
	        	NoOfCharVoid(roq, ans, count + 1);
	        else
	        {
	            if (count > 1)
	            	NoOfCharVoid(roq, ans + ch + count, 1);
	            else
	            	NoOfCharVoid(roq, ans + ch, 1);
	        }
	    }
	    else
	    {
	        if (count > 1)
	        	NoOfCharVoid(roq, ans + ch + count, 1);
	        else
	        	NoOfCharVoid(roq, ans + ch, 1);
	    }
			}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s=new String("aaabbccdef");
		NoOfCharVoid("aaaabbbcddef",  "", 0);
		
	}

}


