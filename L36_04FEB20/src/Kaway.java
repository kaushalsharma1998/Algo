import java.util.ArrayList;

public class Kaway {

	public static class Node {
		int data;
		Node left = null;
		Node right = null;

		public Node(int data) {
			this.data = data;

		}
	}

	static int idx = 0;

	public static Node constructNode(int arr[]) {
		if (idx == arr.length || arr[idx] == -1) {
			idx++;
			return null;
		}
		Node node = new Node(arr[idx]);
		idx++;

		node.left = constructNode(arr);
		node.right = constructNode(arr);
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
	public static ArrayList<Node> nodeToRootPath(Node node, int data)
	{
		if (node==null)
		{ 
			ArrayList<Node>base=new ArrayList<Node>();
		
			return base; 
		}
		if(node.data==data)
		{
			ArrayList<Node>base=new ArrayList<Node>();
			base.add(node);
			return base;
		}
		ArrayList<Node>left=nodeToRootPath(node.left,data);
		if(left.size()!=0)
		{
			left.add(node);
			return left;
		}
		ArrayList<Node>right=nodeToRootPath(node.right,data);
		if(right.size()!=0)
		{
			right.add(node);
			return right;
		}
		return new ArrayList<Node>();
		
	}
	public static  void kDown(Node node,Node pnode, int level)
	{
		if(node==null||node==pnode)
			return;
		if(level==0)
		{	 	System.out.print(node.data+" ");
			return;
		}
		kDown(node.left,pnode, level-1);
		kDown(node.right, pnode,level-1);
	}
	
	public static void kAway01(Node node,int data,int k)
	{ 	Node pnode=null;
		ArrayList<Node>list=nodeToRootPath(node, data);
		for(int i=0;i<list.size();i++)
		{
			kDown(list.get(i), pnode, k-i);
			pnode=list.get(i);
		}
	}
	public static int kAway02(Node node,int data,int k )
	{
		if(node==null)
			return -1;
		if(node.data==data)
		{ kDown(node, null, k);
			return 1;
		}
	 int ld=kAway02(node.left, data, k);
	 if(ld!=-1)
	 {
		 kDown(node, node.left, k-ld);
		 return ld+1;
	 }
	 int rd=kAway02(node.right, data, k);
	 if(rd!=-1)
	 {
		 kDown(node, node.right,k-rd);
		 return rd+1;
	 }
	 return -1;
	}
	public static void main(String args[]) {
		int[] arr = { 10, 20, 30, 40, -1, -1, 50, -1, -1, 60, -1, 70, -1, -1, 80, 90, 100, 120, -1, -1, 130, -1, -1,
				110, -1, -1, 140, -1, -1 };

		Node root = constructNode(arr);
		// System.out.println(root);
		display(root);
		kAway01(root, 110, 3);
		System.out.println();
		kAway02(root, 110, 3);
		
		
		
	}
}
