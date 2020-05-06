import java.util.ArrayList;

public class hV_MazeBox {

	public static ArrayList<String> hv_mazeBox(int sr,int sc,int er,int ec)
	{ 
	    
		if(sr==er&&sc==ec)
		{
			ArrayList<String>base =new ArrayList<String>();
			base.add("");
			return base;
		}
		ArrayList<String>ans =new ArrayList<String>();
		
		if(sc+1<=ec)  
		{	ArrayList<String> horizontal = hv_mazeBox(sr, sc+1, er, ec);
	   // System.out.println(horizontal);
for(String s:horizontal)
	    	ans.add("H"+s);
	
		}
		if(sr+1<=er)  
		{	ArrayList<String>vertical = hv_mazeBox(sr+1, sc, er, ec);
	   //  System.out.println(vertical);
		for(String s:vertical)
	    	ans.add("V"+s);
//	System.out.print(ans);
		}
//		if(sr+1<=er&&sc+1<=ec)  
//		{	ArrayList<String>diagonal= hv_mazeBox(sr+1, sc+1, er, ec);
//	    
//		for(String s:diagonal)
//	    	ans.add("D"+s);
//	
//		}
		return ans;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<String>ans=new ArrayList<String>();
	ans=hv_mazeBox(0, 0,2, 2);
	System.out.println(ans);
	}

}
