 public class Subsequence_void {

	public static void  SubsequenceVoid(String str, String ans)

	{ 
		if(str.length()==0)
	
		{
			System.out.println(ans);
			return;
	}
	char ch= str.charAt(0);
	
	String req=str.substring(1);
	
	SubsequenceVoid(req, ans+ch);
    
	SubsequenceVoid(req, ans);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated meth od stub
		SubsequenceVoid("abc","");
	}

}
