import java.util.Stack;

public class MinStack {

	Stack<Long> st = new Stack<Long>();
	long minsf = 0;

	/** initialize your data structure here. */
	
	public void push(int x) {
		long val = x;
		if (st.size() == 0) {
			st.push(val);
			minsf = val;
			
			return;

		}
		if (val > minsf) {
			st.push(val);
		} else {
			st.push(val - minsf + val);
			minsf = val;
		}
	}

	public void pop() {
		if (st.peek() < minsf)
			minsf = 2 * minsf - st.peek();
		st.pop();

	}

	public int top() {
		long  val=st.peek();
		if (st.peek() > minsf)
			return (int) val;
		else
			return (int)minsf;

	}

	public int getMin() {
	        return (int)minsf;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack st=new MinStack();
		st.push(1);
	 
		st.push(-1);
		st.push(2);
		st.pop();
		st.pop();
		System.out.println(st.st+" "+st.minsf);

	}

		
}


