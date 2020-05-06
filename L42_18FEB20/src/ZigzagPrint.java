import java.util.ArrayList;
import java.util.Stack;



public class ZigzagPrint {
	public static class Node {
		int data;
		ArrayList<Node> children = new ArrayList<>();

		public Node(int data) {
			this.data = data;

		}
	}

	public static Node create_tree(int[] arr) {
		Stack<Node> stack = new Stack<>();
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != -1) {
				stack.add(new Node(arr[i]));
			} else

			{
				Node popped = stack.pop();
				stack.peek().children.add(popped);
			}
		}

		return stack.pop();

	}

	public static void display(Node node) {
		System.out.print(node.data + "-->");
		for (Node child : node.children) {
			System.out.print(child.data + ",");
		}
		System.out.println();
		for (Node child2 : node.children) {
			display(child2);

		}
	}
	public static void zigzagPrint(Node node,int level)
	{ Stack<Node>stack1=new Stack<ZigzagPrint.Node>();
	  Stack<Node>stack2=new Stack<ZigzagPrint.Node>();
	int level=0;
	if(level%2==0)
		for(i=0;i<node.children.size();i++)
		{
			stack
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
