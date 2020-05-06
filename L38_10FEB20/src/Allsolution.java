import java.util.ArrayList;


public class Allsolution {
	public static class Node {
		int data;
		Node left = null;
		Node right = null;

		public Node(int data) {
			this.data = data;

		}
	}

	public static class Allsoln {
		Node pre = null;
		Node succ = null;
		Node prev = null;
		int height = -1;
		int ceil = Integer.MAX_VALUE;
		int floor = Integer.MIN_VALUE;
		boolean find = false;
		int size = 0;
	}

	static int idx = 0;

	public static Node createNode(int arr[]) {
		if (arr[idx] == -1) {
			idx++;
			return null;

		}
		Node node = new Node(arr[idx]);
		idx++;
		node.left = createNode(arr);
		node.right = createNode(arr);
		return node;
	}

	public static void display(Node node) {
		if (node == null)
			return;

		System.out.print((node.left != null ? node.left.data : "."));
		System.out.print(" -> " + node.data + " <- ");
		System.out.println((node.right != null ? node.right.data : "."));

		display(node.left); // display(2*idx+1);
		display(node.right); // display(2*idx+2);

	}

	public static void allsolu(Node node, int data, int level, Allsoln pair) {
		if (node == null)
			return;
		pair.height = Math.max(pair.height, level);
		pair.size++;
		pair.find = pair.find || node.data == data;
		if (node.data > data)
			pair.ceil = Math.min(pair.ceil, node.data);
		if (node.data < data)
			pair.floor = Math.max(pair.floor, node.data);

		allsolu(node.left, data, level + 1, pair);
		if (node.data == data && pair.prev != null)
			pair.pre=pair.prev;
		else if(pair.prev != null && pair.succ == null && pair.prev.data == data)
			pair.succ=node;
			pair.prev = node;
		allsolu(node.right, data, level + 1, pair);
	}
	 public static ArrayList<Integer>myAns=new ArrayList<Integer>();
	public static   void inorder(Node node)
	{
		if(node==null)
		{	
			return ;
		}
		
		
		inorder(node.left);
		
		myAns.add(node.data);
		
		inorder(node.right);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, -1, -1, 50, -1, -1, 60, -1, 70, -1, -1, 80, 90, 100, 120, -1, -1, 130, -1, -1,
				110, -1, -1, 140, -1, -1 };
		Node root = createNode(arr);
		display(root);
		Allsoln pair=new Allsoln();
		allsolu(root,80, 0, pair);
		System.out.println("size "+pair.size+" pre "+pair.pre.data+" succ "+pair.succ.data+"  height "+pair.height+" ceil "+pair.ceil+" floor "+ pair.floor);
		inorder(root);
		System.out.println(myAns);
	}
	//[40, 30, 50, 20, 60, 70, 10, 120, 100, 130, 90, 110, 80, 140]

}
