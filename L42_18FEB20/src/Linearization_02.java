import java.util.ArrayList;
import java.util.Stack;

public class Linearization_02 {

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

	public static Node linearize(Node node) {
		if (node.children.size() == 0)

			return node;
		Node myTail = linearize(node.children.get(node.children.size() - 1));

		for (int i = node.children.size() - 2; i >= 0; i--) {
			Node tailNode = linearize(node.children.get(i));
			tailNode.children.add((node.children.get(node.children.size() - 1)));
			node.children.remove(node.children.size() - 1);

		}
		return myTail;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 50, 100, -1, 110, -1, -1, 90, -1, -1, 40, -1, -1 };
		Node root = create_tree(arr);
		display(root);
		linearize(root);
		display(root);

	}
}
