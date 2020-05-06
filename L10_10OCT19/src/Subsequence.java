import java.util.ArrayList;

public class Subsequence {

	 public static ArrayList<String> Subseq(String str)
	
	{  if (str.length()==0)
		{
		   ArrayList<String> base =new ArrayList<String>();
		   base.add("");
		   return base;
		   
				   
		}
	char ch=str.charAt(0);
	String res=str.substring(1);
	ArrayList<String>recAns=Subseq(res);
	ArrayList<String>myAns=new ArrayList<String>();
	myAns.addAll(recAns);
	for ( String s:recAns)
		myAns.add(ch+s);
		
	
		
	
	return myAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("ABCD");
		
		
  ArrayList<String> ans =new ArrayList<String>();
  ans=Subseq(s);
  System.out.println(ans);
	}

}
