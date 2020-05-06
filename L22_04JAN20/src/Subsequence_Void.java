
public class Subsequence_Void {
public static void subsequence(String str,String ans )
{ 
	if (str.length()==0)
		{
		System.out.println(ans);
		
			return ;
		}
	subsequence(str.substring(1), ans);
	subsequence(str.substring(1), ans+str.charAt(0));
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subsequence("abc", "");

	}

}
