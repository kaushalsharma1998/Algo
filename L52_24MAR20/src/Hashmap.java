import java.util.LinkedList;

public class Hashmap< K,V, E> {

	public  class Node {
		K key;
		V value;

		public Node(K key, V value) {
			this.key = key;
			this.value = value;
		}
		@Override
		public String toString()
		{
			StringBuilder sb=new StringBuilder();
			sb.append(key+"="+value);
			return sb.toString();
		}
	}

		public   static int size=0;
		@SuppressWarnings("unchecked")
		private  LinkedList<Node>[] buckets = new LinkedList[10];
		
		public Hashmap()
		{
			reassign();
			
		}
		public   void reassign()
		{
			for(int i=0;i<buckets.length;i++)
			{
				buckets[i]=new LinkedList<Node>();
			}
			size=0;
		}
		
		public  int myhashcode(K key) {
			

			return key.hashCode();

		}
		
		

	public  int  mygroup(K key) {
		
	return Math.abs(myhashcode(key))%buckets.length;
		 
		
	}
	public  V  get(K key) {
		int code=mygroup(key);
		LinkedList<Node>group=buckets[code];
		Node  rn=foundingroup(group,key);
		return rn==null?null:rn.value;
		
	}
	public  Node remove(K key)
	{	int code=mygroup(key);
		LinkedList<Node>group=buckets[code];
		Node rn=foundingroup(group, key);
	    group.remove(group.getFirst());
	    return rn;
	}
	public  void put(K key, V value)
	{
		int code=mygroup(key);
		LinkedList<Node>group=buckets[code];
		Node rn=foundingroup(group, key);
		if(rn==null)
		{group.add(new Node(key, value));
		 size++;
		}
		else
			rn.value=value;
		
		double lambda=group.size()*1%buckets.length;
		if(lambda>=.3)
			rehash();
		
	}
	@SuppressWarnings("unchecked")
	public   void rehash(){
        LinkedList<Node>[] oldBuckets=buckets;
        buckets=new LinkedList[oldBuckets.length*2];
        reassign();
        
        for(int i=0;i<oldBuckets.length;i++){
            if(oldBuckets[i].size()>0){
                LinkedList<Node> group=oldBuckets[i];
                int size=group.size();

                while(size-->0){
                 Node tnode=group.removeFirst();
                 put(tnode.key,tnode.value);
                }
                 
            }

        }
    }
	
	
	public  boolean containsKey(K key) {
		int code=mygroup(key);
		LinkedList<Node>group=buckets[code];
		Node  rn=foundingroup(group,key);
		return rn==null?false:true;
		
	}

	public  Node foundingroup(LinkedList<Node> group, K key) {
		Node rn=null;
		
		int size=group.size();
//		 for(int i=0;i<group.size();i++)
//		 {
//			 if(group.get(i).key==key)
//			 {
//				 rn=group.get(i);                           
//				 break;
//			 }
//			 
//		 }
				while(size-->0)
		{ Node temp=group.getFirst();
		 if(temp.key==key)
		 {	rn=temp;
			 break;
		 }
			group.addLast(group.removeFirst());
		}
			
				return rn;

	}
	public  V getordefault (K key,  V value, V defaul)
	{
		int code=mygroup(key);
		LinkedList<Node>group=buckets[code];
		Node rn=foundingroup(group, key);
		
		return rn==null?defaul:rn.value;
			
		 
	}
	public  void putifabsent(K key,V value)
	{
	 	int code=mygroup(key);
	 	LinkedList<Node>group=buckets[code];
	 	Node rn=foundingroup(group, key);
	 	if(rn==null)
	 		put(key, value);
	 	else 
	 		return;
	}
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
}
