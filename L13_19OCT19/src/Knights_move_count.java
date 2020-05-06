public class Knights_move_count {
	
	public static boolean isValid(int x,int y,boolean[][] isdone){
	      if(x>=0 && y>=0 && x<isdone.length && y<isdone[0].length && !isdone[x][y]) return true;
	      return false;
	    }
	
	public static int KnightsMoveCount(int sr,int sc,int er,int ec,boolean[][] isdone){
        if(sr==er && sc==ec){
         
         
         return 1;
        }

        int[][] dir={{2,1},{1,2},{-1,2},{-2,1},{-2,-1},{-1,-2},{1,-2},{2,-1}};
        
    
        int count=0;
        
        isdone[sr][sc]=true;
        for(int d=0;d<dir.length;d++){
            int x=sr+dir[d][0];
            int y=sc+dir[d][1];
             
        if(isValid(x,y,isdone)){
            count+=KnightsMoveCount(x,y,er,ec,isdone);
            
            }  
          }
        

        isdone[sr][sc]=false;

        return count;


    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(KnightsMoveCount(0,0,4,4,new boolean[5][5]));
	}

}
