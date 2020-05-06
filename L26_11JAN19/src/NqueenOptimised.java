
public class NqueenOptimised {
	public static int  NqueenO(int boxes,int row,int qpsf,int tnq,boolean columns[],boolean diagonals[],boolean diagonala[],String ans)
	{ if(row==columns.length|tnq==qpsf)
	 	{ if(tnq==qpsf)
	 	{ System.out.println(ans);
	 	 return 1;
	 	}
	 	return 0;
	 	}
	int count=0;
	
	for(int c=0;c<columns.length;c++)
	{
		if(!columns[c]&&!diagonala[row-c+columns.length-1]&&!diagonals[row+c])
		{	columns[c]=true;
			diagonala[row-c+columns.length-1]=true;
			diagonals[row+c]=true;
			count+=NqueenO(boxes, row+1, qpsf+1, tnq, columns, diagonals, diagonala, ans+"("+row+","+c+")");
			columns[c]=false;
			diagonala[row-c+columns.length-1]=false;
			diagonals[row+c]=false;
		
		}
				
	}
	return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NqueenO(16, 0, 0, 4, new boolean[4], new boolean[7], new boolean[7], "");
	}

}
