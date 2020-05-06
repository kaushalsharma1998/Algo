import java.util.ArrayList;

public class Maze_BoxLRUD {

	
	public static ArrayList<String> MazeboxLRUD(int sr,int sc,int er,int ec, boolean [][] isdone ){
		
		if((sr==er)&&(sc==ec))
		{
			ArrayList<String>base=new ArrayList<>();
 			base.add("");
 			return base;
		}
		
		ArrayList<String>ans=new  ArrayList<>();
		isdone[sr][sc]=true;
		
		if ((sr-1)>=0 && !isdone[sr-1][sc])
		{   ArrayList<String> upward = MazeboxLRUD(sr-1, sc, er, ec, isdone);
	     	for(String s:upward)
	    	ans.add("U"+s);
 			
		}
	
		if ((sc+1)<=ec&&!isdone[sr][sc+1])
		{
			ArrayList<String> right = MazeboxLRUD(sr, sc+1, er, ec, isdone);
			     	for(String s:right)
			    	ans.add("R"+s);
		 			
		}
	
		if ((sr+1)<=er&&!isdone[sr+1][sc])
		{
			ArrayList<String> downward = MazeboxLRUD(sr+1, sc, er, ec, isdone);
			     	for(String s:downward)
			    	ans.add("D"+s);
		 			
		}
	
		if ((sc-1)>=0&&!isdone[sr][sc-1])
		{
			ArrayList<String> left = MazeboxLRUD(sr, sc-1, er, ec, isdone);
			     	for(String s:left)
			    	ans.add("L"+s);
		 			
		}
	
		isdone[sr][sc]=false;
		return ans;
	
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 boolean isdone[][]=new boolean[3][3];
	 System.out.println(MazeboxLRUD(0, 0, 2, 2, isdone));
	}

}
