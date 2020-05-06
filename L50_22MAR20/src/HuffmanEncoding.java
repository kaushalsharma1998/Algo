import java.util.HashMap;
import java.util.PriorityQueue;

public class HuffmanEncoding {

	public static class Node implements Comparable<Node> {
		public String data;
		public int freq;
		public Node left = null;
		public Node right = null;

		public Node(String data, int freq, Node left, Node right) {
			super();
			this.data = data;
			this.freq = freq;
			this.left = left;
			this.right = right;
		}

		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return this.freq - o.freq;
		}

	}

	public static HashMap<String, String> encode = new HashMap<String, String>();
	public static HashMap<String, String> decode = new HashMap<String, String>();
	public static PriorityQueue<Node> pq = new PriorityQueue<HuffmanEncoding.Node>();

	public static void tree(String str) {

		pq.add(new Node("a", 60, null, null));
		pq.add(new Node("b", 8, null, null));
		pq.add(new Node("c", 13, null, null));
		pq.add(new Node("d", 12, null, null));
		pq.add(new Node("e", 10, null, null));
		pq.add(new Node("f", 26, null, null));
		pq.add(new Node("g", 3, null, null));
		pq.add(new Node("h", 10, null, null));
		pq.add(new Node("i", 12, null, null));
		pq.add(new Node("x", 1, null, null));
		pq.add(new Node("z", 1, null, null));
		while (pq.size() != 1) {
			Node rn1 = pq.remove();
			Node rn2 = pq.remove();
			Node merge = new Node(rn1.data + rn2.data + "", rn1.freq + rn2.freq, rn1, rn2);
			pq.add(merge);
		}
		Node root = pq.peek();
		traverse(root, "");

	}

	public static void traverse(Node node, String ans) {
		if (node.right == null && node.left == null) {
			encode.put(node.data, ans);
			decode.put(ans, node.data);
			return;
		}
		traverse(node.left, ans + 0 + "");

		traverse(node.right, ans + 1 + "");

	}
	public static String encoder(String str)
	{ StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			String ch=str.charAt(i)+"";
			sb.append(encode.get(ch));
		}
		return sb.toString();
	}
	public static void decoder(String str)
	{ StringBuilder sb=new StringBuilder();
//		StringBuilder s = null;
		int i=0;
        for(int j=1;j<=str.length();j++){
            String s=str.substring(i,j);
            if(encode.containsValue(s)){
                sb.append(decode.get(s));
                i=j;
            }
        }
		
		
		//		for(int i=0;i<str.length();i++)
//		{
//			s.append(str.charAt(i));
//			if(decode.containsValue(s))
//			sb.append(decode.get(s));
//		}
		System.out.println(sb);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	tree("");
	System.out.println(encoder("abc"));
decoder(encoder("abc"));
	}

}
