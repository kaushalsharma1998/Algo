 
public class Send_More_Money {
public static String str1="send";
public static String str2="more";
public static String str3="money";
public static  boolean[] numused=new boolean[10];
public static int[] maping= {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
public static int[] freqmap=new int[26];
//public static String uniqueStr;
public   static String  Freqmap()

{ 
  String str=str1+str2+str3;
  	for (int i=0;i<str.length();i++)
	 freqmap[str.charAt(i)-'a']++;
  	  	String uniqueStr="";
		for (int i=0;i<26;i++)
  	{ 
  		if (freqmap[i]!=0)
  		{ char p= (char) ((i)+'a');
  			uniqueStr=uniqueStr+p;
  		}
		 
  	}
  	  	return uniqueStr;
 
}


public static  int decode(String str)
{ 
	int res = 0;
	for(int i=0;i<str.length();i++)
	{ 
		int num= maping[str.charAt(i)-'a'];
				res=res*10+num;
		
	}
	return res;
}

public static int SendMoreMoney( String str, int idx)
 { 
	 if (idx==str.length())
	 { if (maping[str1.charAt(0)-'a']==0||maping[str2.charAt(0)-'a']==0||maping[str3.charAt(0)-'a']==0)
	 	 { return 0;}
		 int strnum1=decode(str1);
	 	int strnum2=decode(str2);
	 	int strnum3=decode(str3);
	 	if(strnum1+strnum2==strnum3)
		 { System.out.println(strnum1+" + "+strnum2+" = "+strnum3);
			 return 1;
		 }
		 return 0;
	 }
	 char ch=str.charAt(idx);
	 int count=0;
	 for(int i=0;i<10;i++)
	 {
		 if(!numused[i])
		 {
			 numused[i]=true;
			 maping[ch-'a']=i;
			 count+=SendMoreMoney(str, idx+1);
			 numused[i]=false;
			 maping[ch-'a']=-1;
		 }
	 }
	 return count;
	

 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str=Freqmap();
		SendMoreMoney(str, 0);
	}

}
