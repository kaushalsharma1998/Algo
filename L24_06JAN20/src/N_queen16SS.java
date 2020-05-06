
public class N_queen16SS {

	

		public static int nQueenSubseqC(int boxes,int tnq,int qloc,int qpsf,String ans)
		{
			if (qpsf==tnq||boxes==qloc)
			{
				if(qpsf==tnq)
				{
					System.out.println(ans+" ");
					return 1;
				}return 0;	
			
			}	
			int count=0;
			
				int qi=qloc/4;
				int qj=qloc%4;
			
			count+=nQueenSubseqC(boxes, tnq, qloc+1, qpsf+1, ans+"("+qi+","+qj+")");
			count+=nQueenSubseqC(boxes, tnq, qloc+1, qpsf, ans);
			return count;
		}
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println(nQueenSubseqC(16, 4, 0, 0,""));
		}

	}

