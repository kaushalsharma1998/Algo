
public class Nqueen_16basic {

	public static int nQueenBasic( boolean boxes[][],int tnq,int qloc,int qpsf,String ans)
	{
		
			if(qpsf==tnq) {
			System.out.println(ans+" ");
			
			return 1;
			}
			
		
		int count=0;
		for(int i=qloc;i<boxes.length*boxes.length;i++)
		{

			int qi=i/4;
			int qj=i%4;
		
		count+=nQueenBasic(boxes, tnq, i+1, qpsf+1, ans+"("+qi+","+qj+")");
			//count += nQueenBasic(boxes,tnq,qloc+1,qpsf, ans);
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nQueenBasic( new  boolean [4][4], 4, 0, 0,""));
	}
}
