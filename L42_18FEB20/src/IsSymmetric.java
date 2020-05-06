import java.util.ArrayList;
import java.util.Stack;

public class IsSymmetric {

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

	public static boolean isSymmetric(Node node1, Node node2) {
		if (node1.children.size() != node2.children.size()) {
			return false;
		}
		int i, j;
		for (i = 0, j = node1.children.size() - 1; i <= j; i++, j--) {
			Node child1 = node1.children.get(i);
			Node child2 = node2.children.get(j);
			if(!isSymmetric(child1, child2))
				return false;
			
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 50, 100, -1, 110, -1, -1, 90, -1, -1, 40, 140,-1,150,-1, -1, -1 };
		Node root = create_tree(arr);
		display(root);
		System.out.println(isSymmetric(root, root))
		;
	}

}
