import java.util.ArrayList;

public class Encoding {
	
	 public static ArrayList<String> EncodeAll(String str)
	 {
		 if(str.length()==0)
		 {
			 ArrayList<String>base=new ArrayList<String>();
			 base.add("");
			 return base;
		 }
		 char ch=str.charAt(0);
		 ArrayList<String>myAns=new ArrayList<String>();
		 if (ch=='0')
			 return EncodeAll(str.substring(1));
		 else 
		 {
			 ArrayList<String>recAns= EncodeAll(str.substring(1));
			 for(String s:recAns)
			 {
				 char ch1= (char) ('a'+ch-'1');
				 myAns.add(ch1+s);
			 }
		 }
		 if(str.length()>1)
		 { char ch2=str.charAt(1);
		  int num=(ch-'0')*10+(ch2-'0');
			if(num<27)
			{
				ArrayList<String>recAns= EncodeAll(str.substring(2));
				 for(String s:recAns)
				 {
					 char ch1= (char) ('a'+num-'1');
					 myAns.add(ch1+s);
				 }
			}
		 }
		 return myAns;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(EncodeAll("1010"));
		char ch='1';
		int aa= (int)ch;
		System.out.println(aa);
		char ch2='0';
		System.out.println(ch);
		System.out.println((ch-'0')*10+(ch2-'0'));
	}
}
