
public class Max_heightMazeBox {
public static int maxHeight(int sr,int sc,int er,int ec)
 {
	
  int maxhei=0;
  if (sc+1<=ec)
  { 
	  maxhei=Math.max(maxhei,maxHeight(sr, sc, er, ec));
  }
return maxhei;
 
 }


public static void main(String args[])
{}
}

