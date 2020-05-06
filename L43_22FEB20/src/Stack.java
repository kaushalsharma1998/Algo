import java.util.Arrays;

public class Stack {
	int stack[];
	int top = -1;

	public Stack() {
		this.stack = new int[10];

	}

	public Stack(int arr[]) {

		this.stack = Arrays.copyOf(arr, 2 * arr.length);
		this.top=arr.length-1;
	}

	public int pop() {
		if (this.top == -1)
			return 0;

		return this.stack[this.top--];

	}

	public boolean push(int data) {
		if (this.top + 1 == this.stack.length)
			return false;
		this.stack[++this.top] = data;
		return true;

	}

	public int size() {
		return this.top + 1;
	}

	public int peek() {
		return this.stack[this.top];
	}
	public static void main(String[] args)
	{
		Stack st=new Stack();
		st.push(10);
		//st.pop();
		System.out.println(st.size());
		
	}
}
