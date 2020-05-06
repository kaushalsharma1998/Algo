import java.util.NoSuchElementException;

public class LinkdList {

	private  static class Node{
		int data=0;
		Node next=null;
	Node(int data)
	{
		this.data=data;
	}
	@Override
	public String toString() {
		return this.data+"";
	}
	}
	private Node head=null;
	private Node tail=null;
	private int nodeCount=0;
	 
	public int size(){
        return this.nodeCount;
    }

    public boolean isEmpty(){
        return this.nodeCount==0;
    }

    public Node getNodeAt(int idx){
        if(idx<0 || idx>=this.nodeCount){
            throw new NullPointerException();
        }

        Node curr=this.head;
        while(idx-->0){
            curr=curr.next;
        }        
         
        return curr;
    }
    

    // Add.==================================================

    private void addFirstNode(Node node){
          if(this.nodeCount==0){
              this.tail=node;
          }

          node.next=this.head;
          this.head=node;
          this.nodeCount++;
    }

    public void addFirst(int data){
        Node node=new Node(data);
        addFirstNode(node);
    }

    
    private void addLastNode(Node node){
        if(this.nodeCount==0){
            this.head=node;
            this.tail=node;
        }else {
            this.tail.next=node;
            this.tail=node;
        }
        
        this.nodeCount++;
    }

    public void addLast(int data){
       Node node=new Node(data);
       addLastNode(node);
    }

    private void addAtNode(Node node,int idx){
    	 Node prev=getNodeAt(idx-1);
    	 Node forward=prev.next;
    	 prev.next=node;
    	 node.next=forward;
    	 this.nodeCount++;

    }

    public void addAt(int data,int idx){
    	if(idx<0)
    		throw  new NullPointerException();
    	
    	addAtNode(new Node(data), idx);
    }

    //get.=================================================

    public int getFirst(){
        if(this.nodeCount==0) throw new NoSuchElementException();
        return this.head.data;
    }

    
    public int getLast(){
        if(this.nodeCount==0) throw new NoSuchElementException();
        return this.tail.data;
    }

    
    public int getAt(int idx){
        return getNodeAt(idx).data; 
    }

    //remove==================================================

    private Node removeFirstNode(){
        Node rn=this.head;

        if(this.nodeCount==1){
           this.head=null;
           this.tail=null;
       }else{
           this.head=this.head.next;
       }

       rn.next=null;
       this.nodeCount--;
       return rn;
    }

    public int removeFirst(){
        if(this.nodeCount==0) throw new NoSuchElementException();
        return removeFirstNode().data;
    }

    
    private Node removeLastNode(){
        Node rn=this.tail;

        if(this.nodeCount==1){
           this.head=null;
           this.tail=null;
       }else{
         Node secondLast=getNodeAt(this.nodeCount-2);
         this.tail=secondLast;
         tail.next=null;      
       }

       rn.next=null;
       this.nodeCount--;
       return rn;
    }

    public int removeLast(){
        if(this.nodeCount==0) throw new NoSuchElementException();
        return removeLastNode().data;
    }

    private Node  removeAtNode(int idx){
    	Node prev=getNodeAt(idx-1);
    	
    	
        Node forw=prev.next.next;
        
        Node rn=prev.next;
        
        rn.next=null;
        prev.next=forw;

        return rn;
    	
    	
    
    			
     }
 
     public int removeAt(int idx){
         if(this.nodeCount==0) throw new NoSuchElementException();
         if(idx<0)
        	 throw new NullPointerException();
         return removeAtNode(idx).data;
     }

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
