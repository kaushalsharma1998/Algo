
public class N_Queen_Basic {

public static int nQueenBasic(int boxes,int tnq,int qloc,int qpsf,String ans)
{
	
		if(qpsf==tnq) {
		System.out.println(ans+" ");
		
		return 1;
		}
		
	
	int count=0;
	for(int i=qloc;i<boxes;i++)
	{
		count+=nQueenBasic(boxes, tnq, i+1, qpsf+1, ans+"b"+i+"q"+qpsf);
		//count += nQueenBasic(boxes,tnq,qloc+1,qpsf, ans);
	}
	return count;
}
public static int nQueenBasicP(int boxes,int tnq,int qpsf,int qloc,String ans, boolean isdone[])
{ 
	
	if(qloc>=boxes)
	{	
		if(qpsf==tnq) {
		System.out.println(ans+" ");
		return 1;
		}
		return 0;
	}
	int count=0;
	
//	for(int i=0;i<=boxes;i++)
	   if(!isdone[qloc+1])
			{
			isdone[qloc+1]=true;
			count+=nQueenBasicP(boxes, tnq,  qpsf+1,qloc+1, ans+"b"+(qloc+1)+"q"+qpsf, isdone);
			isdone[qloc+1]=false;
			}
	   
	   count += nQueenBasicP(boxes, tnq, qpsf ,qloc+1, ans, isdone);
	   
//	}
	
	return count;
}


public static void main(String args[])
{
	System.out.println(nQueenBasic(5, 3, 0, 0, ""));	
 //System.out.println(nQueenBasicP(4, 2,  0,-1, "",new boolean[5]));
}
}
