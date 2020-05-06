
public class NqueenO {
	static boolean isSafeToPlace(boolean boxes[][],int x,int y)
	{ int dir[][]={ {0,-1},
					{-1,0},
					{-1,-1},
					{-1,1}
					};
		for (int i=0;i<dir.length;i++)
		{ for (int rad=1;rad<=4;rad++)
		{
			int x1=x+(rad*dir[i][0]);
			int y1=y+(rad*dir[i][1]);
		if(x1<0||y1<0||x1>3||y1>3)
		{
			break;
			
		}
		if (boxes[x1][y1])
		{
			return false;
		}
		
		}
			
		
		}
		return true;
	}

	public static int nQueen(boolean boxes[][],int tnq,int qloc,int qpsf,String ans)
	{
		if(tnq==qpsf)
		{
			System.out.println(ans);
			return 1;
		}
		int count=0;
		for(int i=qloc;i<boxes.length*boxes.length;i++)
		{
				int qi=i/4;
				int qj=i%4;
			
				if(isSafeToPlace(boxes,qi,qj))
						
			{   
				boxes[qi][qj]=true;
				count+=nQueen(boxes, tnq, i+1, qpsf+1, ans+"("+qi+","+qj+")");
				boxes[qi][qj]=false;
			}
				
			}
			
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(nQueen( new  boolean [4][4], 4, 0, 0,""));
	}

}
