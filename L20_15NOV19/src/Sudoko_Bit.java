
public class Sudoko_Bit {

	
    public static boolean isValidSudoku(int[][] board,int i,int j,int num){

           //col
           for(int idx=0;idx<board.length;idx++){
              if(board[idx][j]==num){
                  return false;
              }
           }


        // row
           for(int idx=0;idx<board.length;idx++){
            if(board[i][idx]==num){
                return false;
            }
         }

         //mat
         int r=(i/3)*3;
         int c=(j/3)*3;
         for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                if(board[r+row][c+col]==num) return false;
            }
         }


        return  true;
    }

    public static boolean sudoku(int[][] board,int vidx){
        if(vidx==board.length*board[0].length){
          for(int[] ar:board){
              for(int ele:ar){
                System.out.print(ele+" ");
              }
              System.out.println();            
          }
          System.out.println();
             return true;
         }
 
          int r=vidx/9;
          int c=vidx%9;
          boolean res=false;

          if(board[r][c]!=0){
        	  board[r][c]=num;
        	  row[r]|=mask;
        	  mat[r/3][j/3]
             res=res|| sudoku(board,vidx+1);
          }else{
             for(int num=1;num<=9;num++){
                   if(isValidSudoku(board,r,c,num)){
                       board[r][c]=num;
                       res=res ||  sudoku(board,vidx+1);
                       board[r][c]=0;
                   }
               }
    }

    return res;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[][] board = {{3, 0, 6, 5, 0, 8, 4, 0, 0},
                           {0, 0, 0, 0, 0, 0, 0, 0, 0},
                           {0, 8, 7, 0, 0, 0, 0, 3, 1},
                           {0, 0, 3, 0, 1, 0, 0, 8, 0},
             			   {9, 0, 0, 8, 6, 3, 0, 0, 5},
             			   {0, 5, 0, 0, 9, 0, 6, 0, 0},
             			   {1, 3, 0, 0, 0, 0, 2, 5, 0},
             			   {0, 0, 0, 0, 0, 0, 0, 7, 4},
             			   {0, 0, 5, 2, 0, 6, 3, 0, 0}};
          
         System.out.println(sudoku(board,0));

	}

}
