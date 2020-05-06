
public class Knights_fill {

	public static boolean isValid(int x,int y,boolean[][] isdone){
	      if(x>=0 && y>=0 && x<isdone.length && y<isdone[0].length && !isdone[x][y]) return true;
	      return false;
	    }
	
	public static boolean KnightsFill(int sr,int sc,int count,int boxsize,boolean[][] isdone ,int[][] ans){
        isdone[sr][sc]=true;
		ans[sr][sc]=count;
	if(count==boxsize-1){
       for(int[] ar:ans)
       {
    	   for(int ele:ar) {
           System.out.print(ele+" ");       
    	   }
    	   
        System.out.println();
      }
       
       return true;
      }

      int[][] dir={{2,1},{1,2},{-1,2},{-2,1},{-2,-1},{-1,-2},{1,-2},{2,-1}};
      
  
      boolean res=false; 
      
      isdone[sr][sc]=true;
      for(int d=0;d<dir.length&&!res;d++){
          int x=sr+dir[d][0];
          int y=sc+dir[d][1];
           
      if(isValid(x,y,isdone)){
          res=res|KnightsFill(x,y,count+1,boxsize,isdone,ans);
          
          }  
        }
      

      isdone[sr][sc]=false;
      //ans[sr][sc]=0;

      return res;


  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(KnightsFill(0,0,0,64,new boolean[8][8],new int[8][8]));
	}

}
