
public class NqueenSSo {

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
	
	public static int nQueenSubseqC(boolean boxes[][],int tnq,int qloc,int qpsf,String ans)
	{ 
		if (qpsf==tnq||qloc>=16)
		{
		if (qpsf==tnq)
		{
			System.out.println(ans);
			return 1;
		}
		else 
		{	return 0;}
		}
	
	int count =0;
	
	int qi=qloc/4;
	int qj=qloc%4;

	if(isSafeToPlace(boxes,qi,qj))
	{   
	boxes[qi][qj]=true;
	count+=nQueenSubseqC(boxes, tnq, qloc+1, qpsf+1, ans+"("+qi+","+qj+")");
	boxes[qi][qj]=false;
	}
	
	count+=nQueenSubseqC(boxes, tnq, qloc+1, qpsf, ans);
	
	return count;
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nQueenSubseqC(new boolean[4][4], 4, 0, 0,""));
	}

}
