import java.util.Stack;

public class NextLeft {

	public static Stack<Integer> stack = new Stack<Integer>();

	public static void nextGreaterRight(int[] arr) {
		
		for(int i=0;i<arr.length;i++)
		{	if(stack.size()==0)
		{
			stack.push(arr[i]);
			continue;
		}
		
		
			
			while(stack.size()!=0&&arr[i]>stack.peek())
		{
			System.out.println(stack.pop()+"->"+arr[i]);
			
			
		}
			stack.push(arr[i]);
		}
		while(stack.size()!=0)
			System.out.println(stack.pop()+"->"+-1);
	}

public static void nextGreaterLeft(int[] arr) {
		
		for(int i=arr.length-1;i>=0;i--)
		{	if(stack.size()==0)
		{
			stack.push(arr[i]);
			continue;
		}
		
		
			
			while(stack.size()!=0&&arr[i]>stack.peek())
		{
			System.out.println(stack.pop()+"->"+arr[i]);
			
			
		}
			stack.push(arr[i]);
		}
		while(stack.size()!=0)
			System.out.println(stack.pop()+"->"+-1);
	}
public static void nextSmallerLeft(int[] arr) {
	
	for(int i=arr.length-1;i>=0;i--)
	{	if(stack.size()==0)
	{
		stack.push(arr[i]);
		continue;
	}
	
	
		
		while(stack.size()!=0&&arr[i]<stack.peek())
	{
		System.out.println(stack.pop()+"->"+arr[i]);
		
		
	}
		stack.push(arr[i]);
	}
	while(stack.size()!=0)
		System.out.println(stack.pop()+"->"+-1);
}
public static void nextSmallerRight(int[] arr) {
	
	for(int i=0;i<arr.length;i++)
	{	//if(stack.size()==0)
//	{
//		stack.push(arr[i]);
//		continue;
//	}
//	
	
		
		while(stack.size()!=0&&arr[i]<stack.peek())
	{
		System.out.println(stack.pop()+"->"+arr[i]);
		
		
	}
		stack.push(arr[i]);
	}
	while(stack.size()!=0)
		System.out.println(stack.pop()+"->"+-1);
}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		nextGreaterRight(new int[] { 4, 5, 2, 25 });
		//nextGreaterLeft(new int[] { 4, 5, 2, 25 });
		//nextSmallerLeft(new int[] { 4, 5, 2, 25 });
		//nextSmallerRight(new int[] { 4, 5, 2, 25 });
	}


}
