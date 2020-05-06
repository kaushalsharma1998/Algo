import java.util.ArrayList;

public class Maze_BoxUDLRD1 {
	
	public static boolean isValid(int x,int y,boolean[][] path,boolean[][] isdone){
	      if(x>=0 && y>=0 && x<isdone.length && y<isdone[0].length && !isdone[x][y] && !path[x][y]) return true;
	      return false;
	    }


	    public static ArrayList<String> floodFill_eightCalls(int sr,int sc,int er,int ec,boolean[][] path,boolean[][] isdone){
	        if(sr==er && sc==ec){
	         ArrayList<String> base=new ArrayList<>();
	         base.add("");
	         return base;
	        }

	        int[][] dir={{1,0},{0,1},{-1,0},{0,-1},{1,1},{-1,-1},{-1,1},{1,-1}};
	        String[] dirName={"D","R","U","L","1","3","4","2"};
	    
	        ArrayList<String> myAns=new ArrayList<>();
	        
	        isdone[sr][sc]=true;
	        for(int d=0;d<dir.length;d++){
	            int x=sr+dir[d][0];
	            int y=sc+dir[d][1];
	             
	        if(isValid(x,y,path,isdone)){
	            ArrayList<String> calls=floodFill_eightCalls(x,y,er,ec,path,isdone);
	            for(String s:calls){
	              myAns.add(dirName[d] + s);
	            }  
	          }
	        }

	        isdone[sr][sc]=false;

	        return myAns;


	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] path={{false,false,false},
                {false,false,true},
                {false,false,false},
               };

		System.out.println(floodFill_eightCalls(0,0,2,2,path,new boolean[3][3]));
	}

}
