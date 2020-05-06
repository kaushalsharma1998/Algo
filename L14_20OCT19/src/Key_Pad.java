import java.util.ArrayList;

public class Key_Pad {
public  static ArrayList<String> KeyPad(String str,String words[])
 {
	 if(str.length()==0)
	 {
		 ArrayList<String>base=new ArrayList<String>();
		 base.add("");
		 return base;
	 }
	 char ch=str.charAt(0);
	 ArrayList<String>myAns=new ArrayList<String>();
	 int n=ch-'0';
	 ArrayList<String>recAns= KeyPad(str.substring(1), words);
	 	
	 String newp = words[n];
	 for(int i=0;i<newp.length();i++)
	 { 
		 for(String s:recAns)
		 {
		 
			 myAns.add(newp.charAt(i)+s);
		 }
	 }
	 return myAns;
	 	 
 }
	
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String words[]={".","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
		
		 System.out.println(KeyPad("773",words));
	 }

}
