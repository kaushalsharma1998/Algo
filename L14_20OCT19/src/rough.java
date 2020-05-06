
public class rough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="abc";
String ans="";
		 for(int i=0;i<str.length();i++)
		 {  
			  char ch=str.charAt(i);
		 	//if(map[ch-'a']==false)
		 	{
			 //map[ch-'a']=true;
		 		String req=str.substring(0,i)+str.substring(i+1);
		 		ans=ans+ch;
		 		System.out.println(req+"   "+ ans);
		 		
		 		
		 		//count+=PermutationVoid(req, ans+ch);
		 	}
	}

}
}
