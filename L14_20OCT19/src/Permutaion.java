import java.util.ArrayList;

public class Permutaion {
 public static ArrayList<String> permutationAll(String str)
 {
	 if(str.length()==0)
	 {
		 ArrayList<String>base=new ArrayList<String>();
		 base.add("");
		 return base;
	 }
	 char ch=str.charAt(0);
	 int i=0;
	 String p = null;
	 ArrayList<String>myAns=new ArrayList<String>();
     ArrayList<String>recAns=permutationAll(str.substring(1));
     for(String s:recAns)
     { for (i=0; i<=s.length();i++)
     { p =(s.substring(0,i)+ ch+ s.substring((i)));
     myAns.add(p);
     }}
 return myAns;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(permutationAll("abc"));
	}

}
