import RemoveBst.Node;

public class PreInPo {

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
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 int arr[]={10, 20, 30,40,50,60,70,80,90,100};
			
			 Node root=createTree(arr,0,arr.length-1);
				
			 display(root);
			// System.out.println(find(100,root));
			// System.out.println(inorder(root));
			 
			
		}

}
