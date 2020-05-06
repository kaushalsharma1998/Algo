
public class Maze_Path_MultiMove {
 public static void MazepathMultimove(int sr,int sc,int er,int ec,String ans)
 {
	 if (sr==er&&sc==ec)
		 {
		 System.out.print(ans+" ");
		 return;
		 }
	 for(int i=1; i<=er;i++)
	 { if (sr + i <= er)
		 MazepathMultimove(sr + i, sc, er, ec, ans + "V"+i);
	   
	    if (sc + i <= ec)
	    	MazepathMultimove(sr, sc + i, er, ec, ans + "H"+i);
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MazepathMultimove(0, 0, 2, 2, "");
 
	}

}
