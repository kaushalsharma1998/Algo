import java.awt.DisplayMode;



public class AVL {
	
	public   static  class Node{
		int data;
		Node left=null;
		Node right=null;
		int balance=0;
		int height=-1;
		public  Node( int data) {
		this.data=data;	
		
		}
	} 
	public static Node ll(Node x) //rightrotation
	{	Node y=x.left;
		Node yRight=y.right;
		y.right=x;
		x.left=yRight;
		
		updateheight(x);
		updateheight(y);
		
		return y;
	}
	public static Node rr(Node x) //leftrotation
	{	Node y=x.right;
		Node yLeft=y.left;
		y.left=x;
		x.right=yLeft;
		updateheight(x);
		updateheight(y);
		
		
		return y;
	}
	
	public static Node rotation(Node  node)
	{ 	
		updateheight(node);
		if(node.balance==2)//ll lr	
		{
			
			if(node.left.balance==1)
			{
				
			 return ll(node);	
			}
			else {
				node.left=rr(node.left);
				return ll(node);
			}
		}
		 else if(node.balance==-2) //rr rl
		 	{	
			 
			 if(node.right.balance==-1)
		
			{
				 return rr(node);
			
			}
			 else {
				 node.right=ll(node.right);
				 return rr(node);
			 }
		 	
		 	}
		
		return node;	
	 
	}
	public static  void updateheight( Node node)
	{
		int lh=-1;
		int rh=-1;
		if(node.left!=null)
		{
			lh=node.left.height;
		}
		if(node.right!=null)
		{
		rh=node.right.height;
		}
		node.height=Math.max(lh, rh)+1;
		node.balance=lh-rh;	
	
		
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
	
	
	public static Node addData(Node node,int data)
	{
		if(node==null)
			{
				return new Node(data);
			}
			
			else if(data<node.data)
			{
				node.left = addData(node.left,data);
			}
			else {
				node.right=addData( node.right,data);
			}
		node=rotation(node);
		
		return node;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Node root=null;
	for(int i=1;i<11;i++)
	{
		root=addData(root,i*10);
	}	
	display(root);
	}
	

}
