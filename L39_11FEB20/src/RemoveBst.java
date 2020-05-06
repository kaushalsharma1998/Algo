
public class RemoveBst {
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

	public static int findMax(Node node)
	{	
		if(node==null)
		{
			return Integer.MIN_VALUE;
		}
		
		return Math.max(node.data, findMax(node.right)) ;
		
	}
	public static int findMin(Node node)
	{	
		if(node==null)
		{
			return Integer.MAX_VALUE;
		}
		
		return Math.min(node.data, findMin(node.left)) ;
		
	}
	public static Node removeNode(Node node,int data)
	{
		if(node==null)
			return null;
		if(node.data==data)
		{
			if(node.left==null||node.right==null)
			{
				return node.left==null?node.right:node.left;
			}
			int maxData=findMax(node.left);
			node.data=maxData;
					
			node.left=removeNode(node.left, maxData);
		}
			else if(data<node.data){
				node.left=removeNode(node.left, data);
			}
			else
				node.right=removeNode(node.right, data);
		
		return node;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[]={10, 20, 30,40,50,60,70,80,90,100};
		
		 Node root=createTree(arr,0,arr.length-1);
			
		 display(root);
		// System.out.println(find(100,root));
		// System.out.println(inorder(root));
		 
		 //System.out.println(removeNode(root,100 ).data);
		 display(root);
	}

}

