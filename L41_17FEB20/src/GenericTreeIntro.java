import java.util.ArrayList;
import java.util.Stack;

public class GenericTreeIntro {
	public static class Node {
		int data;
		ArrayList<Node> children = new ArrayList<GenericTreeIntro.Node>();

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

	public static boolean find(Node node, int data) {
		boolean res = false;
		if (node.data == data)

		{
			return true;
		}

		for (Node child : node.children) {
			res = res || find(child, data);
		}
		return res;
	}

	public static int size(Node node) {
		int sz = 0;

		for (Node child : node.children) {
			sz += size(child);
		}
		return sz + 1;
	}

	public static int maximum(Node node)
	{
		 int maxdata=node.data;
		for (Node child : node.children) {
			maxdata=Math.max(maxdata, maximum(child));
		}	
		return maxdata;
	}
	public static int height(Node node)
	{
		 int ht=-1;
		for (Node child : node.children) {
			ht=Math.max(ht, height(child));
		}	
		return ht+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 50, 100, -1, 110, -1, -1, 90, -1, -1, 40, -1, -1 };
		Node root = create_tree(arr);
		display(root);
		System.out.println(find(root, 60));
		System.out.println(size(root));
		System.out.println(maximum(root));
		System.out.println(height(root));
	}

}
