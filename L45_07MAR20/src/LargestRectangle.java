import java.util.Stack;

public class LargestRectangle {
	
	
	public  static void largest02(int arr[])
	{	Stack<Integer>st=new Stack<Integer>();
		st.push(-1);
		int maxArea=0;int width=0;
		for(int i=0;i<arr.length;i++)
		{
			while(st.peek()!=-1&&arr[i]<=arr[st.peek()]	)
			{
			  int height=arr[st.pop()]	;
			  width=i-st.peek()-1;
			  maxArea=Math.max(maxArea, width*height);
			}
			st.push(i);
		}
		while(st.peek()!=-1	)
		{
		  int height=arr[st.pop()]	;
		  width=arr.length-st.peek()-1;
		  maxArea=Math.max(maxArea, width*height);
		}
	System.out.println(maxArea);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
largest02(new int[] {1});
	}

}
