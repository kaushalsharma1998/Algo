import java.util.Stack;

public class IsBalanced {
	public static boolean isBalanced(String str) {
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
				st.push(str.charAt(i));

			} else {
				if (st.size() == 0)
					return false;
				if (str.charAt(i) == ')' && st.peek() != '(')
					return false;
				if (str.charAt(i) == ']' && st.peek() != '[')
					return false;
				if (str.charAt(i) == '}' && st.peek() != '{')
					return false;
				st.pop();
			}
		}

		return st.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isBalanced("())"));
	}

}
