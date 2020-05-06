import java.util.ArrayList;

public class BST_Intro {
	public   static  class Node{
		int data;
		Node left=null;
		Node right=null;
		
		public  Node( int data) {
		this.data=data;	
		
		}
	}
	public static Node  createTree(int[] arr,int si,int ei)
	{
		if(si>ei)
			return null;
		int mid=(si+ei)>>>1;
		Node node=new Node(arr[mid]);
		node.left=createTree(arr, si,mid-1);
		node.right=createTree(arr, mid+1,ei );
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

	public static boolean find(int data,Node node)
	{	
		if(node==null)
		{
			return false;
		}
		if(node.data==data)
		{
			return true;
		}
		else if(data<node.data)
		{
			return find(data, node.left);
		}
		else {
			return find(data, node.right);
		}
	
	}
//	public static boolean addData(int data,Node node)
//	{	
//		if(node==null)
//		{
//			return new Node(data);
//		}
//		
//		else if(data<node.data)
//		{
//			node.left = addData(data, node.left);
//		}
//		else {
//			node.right=(data, node.right);
//		}
//	return node;
//	}

	
	public static ArrayList<Integer>inorder(Node node)
	{
		if(node==null)
		{	ArrayList<Integer>base=new ArrayList<Integer>();
			//base.add(null);
			return base;
		}
		ArrayList<Integer>myAns=new ArrayList<Integer>();
		
		ArrayList<Integer>leftAns=inorder(node.left);
		myAns.addAll(leftAns);
		myAns.add(node.data);
		ArrayList<Integer>rightAns=inorder(node.right);
		myAns.addAll(rightAns);
		return myAns;
	}
	public static class Allsoln{
		Node pre=null;
		Node succ=null;
		Node prev=null;
		int ceil=Integer.MAX_VALUE;
		int floor=Integer.MIN_VALUE;
		int size;
	}
	
	public static void allsol(Node node,int data,int level,Allsoln pair)
	{ 
		if(node==null)
			return;
			pair.size++;
		allsol(node.left,data ,level+1, pair);
		
		allsol(node.right,data ,level+1, pair);
	}
	
	
	public static  int lca(Node node ,int data1,int data2)
	{
		if(data1<node.data&&data2<node.data)
		{
			return lca(node.left,data1,data2);
			
		}
		else if(data1>node.data&&data2>node.data)
			return lca(node.right,data1,data2);
		else return node.data;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[]={10, 20, 30,40,50,60,70,80,90,100};
		
		 Node root=createTree(arr,0,arr.length-1);
			
		 display(root);
		// System.out.println(find(100,root));
		 System.out.println(inorder(root));
		//System.out.println(lca(root, 200, 1));
		 //System.out.println();
	}

}
