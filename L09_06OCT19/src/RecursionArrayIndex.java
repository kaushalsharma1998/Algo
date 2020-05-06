
public class RecursionArrayIndex {
public static int[] allIndex(int[] arr,int vidx,int data,int size)
{
	if(vidx==arr.length)
	{ 	int[] baseArray=new int[size];
	
		return baseArray;
	}
	if(arr[vidx]==data)
		size++;
	int[] recAns=allIndex(arr, vidx+1, data, size);
	if (arr[vidx]==data)
		recAns[size-1]=vidx;
	return recAns;
}
public static void main(String args[])
	{ int[] arr= {4,2,4,6,1,4,6,10};
	 int[]res=new int[10];
		res=allIndex(arr, 0, 4, 0)	;
		for(int c:res)
		System.out.println(c);
	}


}

