
public class Permutation_Void {
	public static int PermutationVoid(String str, String ans)
	{
		if (str.length()==0)
		{
			System.out.print(ans+" ");
			return 1;
			
		}
			int maping=0,count=0;
		 	for(int i=0;i<str.length();i++)
			 {  
				  char ch=str.charAt(i);
			 	if((maping&(1<<(ch-'a')))==0)
			 	{
				 (maping)|= (1<<(ch-'a'));
			 		String req=str.substring(0,i)+str.substring(i+1);
			 	count+=PermutationVoid(req, ans+ch);
			 	}
			 }
		
		
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println(PermutationVoid("aba", ""));
	}

}
