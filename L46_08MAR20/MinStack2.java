import java.util.Stack;

public class MinStack2 {
	Stack<Integer> st = new Stack<Integer>();
	Stack<Integer> minst = new Stack<Integer>();
	int min = Integer.MAX_VALUE;

	public void push(int x) {
		st.push(x);
		minst.push(Math.min(min, x));
		min=minst.peek();
	}

	public int top() {
		return st.peek();
	}

	public void pop() {
		if (st.size() == 0)
			return;
		st.pop();
		minst.pop();
		if (minst.size() != 0)
			min = minst.peek();
	}

	public int min() {
		return minst.peek();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MinStack2 st=new MinStack2();
st.push(1);
st.push(2);
st.push(-1);
System.out.println(st.st+" "+st.minst);

	}
	
}
