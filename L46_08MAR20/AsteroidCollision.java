import java.util.Stack;

public class AsteroidCollision {
	public static void astCol(int arr[]) {
		Stack<Integer> st = new Stack<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0)
				st.push(arr[i]);
			else {
				while (st.size() != 0 && st.peek() > 0 && st.peek() < -arr[i])
					st.pop();

				if (st.size() != 0 && st.peek() == -arr[i]) {
					st.pop();
				} else if (st.size() == 0 || st.peek() < 0)
					st.push(arr[i]);
			}
		}
		System.out.println(st);
		int ans[] =new int[st.size()];
		int j=1;
		while(st.size()!=0)
		{
			ans[ans.length-j]=st.pop();
			j++;
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		astCol(new int[] { -2, -1, });
	}

}
