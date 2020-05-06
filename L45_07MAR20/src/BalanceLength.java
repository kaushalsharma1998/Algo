import java.util.Stack;

public class BalanceLength {
	public static int balance(String str)
	{	int maxLeng = 0;
		Stack<Integer>st=new Stack<Integer>();
		st.push(-1);
		for(int i=0;i<str.length();i++)
		{
			
			if(st.peek() != -1 && str.charAt(i)== ')' && str.charAt(st.peek()) == '(')
			{
	            st.pop();
	            

	            int width = i - st.peek();
	             
	            maxLeng = Math.max(maxLeng, width);
			}
			
			else
		       st.push(i);
		}
		
	return maxLeng;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(balance("))(())"));
	}

}
