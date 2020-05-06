
public class Trie {

	public class Node{
		int wordend=0;
		Node[] childs;
		
		//String wordend= "";
		public Node() {
			// TODO Auto-generated constructor stub
		this.childs=new Node[26];
	//	this.wordend="";
		this.wordend=0;
		
		}
	}
	Node root=null;
	public void insert(String word) {
        Node curr=root;
        for(int i=0;i<word.length();i++)
        {
        	  char ch=word.charAt(i);
        	if(curr.childs[ch-'a']==null)
        	{
        		curr.childs[ch-'a']=new Node();
        		
        	}
        	curr=curr.childs[ch-'a'];
        }
        curr.wordend++;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
    	 Node curr=root;
         for(int i=0;i<word.length();i++)
         {
         	  char ch=word.charAt(i);
         	  int idx=ch-'a';
         	  curr=curr.childs[idx];
         	  if(curr==null)return false;
         }
         return curr.wordend>0;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String word) {
    	Node curr=root;
        for(int i=0;i<word.length();i++)
        {
        	  char ch=word.charAt(i);
        	  int idx=ch-'a';
        	  curr=curr.childs[idx];
        	  if(curr==null)return false;
        }	
    return true;
    }
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
