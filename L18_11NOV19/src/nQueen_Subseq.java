
public class nQueen_Subseq {
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
	count+=nQueenSubseqC(boxes, tnq, qloc+1, qpsf+1, ans+"b"+qloc+"q"+qpsf);
	count+=nQueenSubseqC(boxes, tnq, qloc+1, qpsf, ans);
	return count;
}
public static int nQueenSubseqP(int boxes,int tnq,int qloc,int qpsf,String ans,boolean isdone[])
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
	if(!isdone[qloc])
	{
	isdone[qloc]=true;
	count+=nQueenSubseqP(boxes, tnq,0,qpsf+1, ans+"b"+(qloc+1)+"q"+qpsf, isdone);
	isdone[qloc]=false;
	}
	
		count += nQueenSubseqP(boxes, tnq,qloc+1,qpsf, ans, isdone);
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(nQueenSubseqC(5, 3, 0, 0, ""));
System.out.println(nQueenSubseqP(5, 3, 0, 0, "",new boolean[10]));
	}

}
