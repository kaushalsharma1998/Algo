
public class Remove_Duplicate_Void {
 public static void RemoveDuplicateVoid(String str,String ans)
 { if (str.length()==0)
	{ System.out.println(ans); 
	 return ;}
	if (ans.length()>0&&str.charAt(0)==ans.charAt(ans.length()-1))
	{  
		RemoveDuplicateVoid(str.substring(1), ans);
	}
	else
	{
		RemoveDuplicateVoid(str.substring(1), ans+str.charAt(0));
	}
	

	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicateVoid("abbc", "");
			}

}
