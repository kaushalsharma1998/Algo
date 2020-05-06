import java.util.ArrayList;
import java.util.HashMap;

public class Hashmap1 {
	public static  void hashmapoperation01(String str)
	{ 
		 HashMap<Character, ArrayList<Integer>>map=new HashMap<Character, ArrayList<Integer>>();
		 for(int i=0;i<str.length();i++)
		 {
			map.putIfAbsent(str.charAt(i),new ArrayList<Integer>());
			map.get(str.charAt(i)).add(i);
		 }
	for(Character ch:map.keySet())
	{
		System.out.println(ch+"->"+map.get(ch));
	}
		
	}
	public static  void hashmapoperation02(String str)
	{
		
	}
	
	public static  void hashmapoperation03(String str)
	{
		HashMap<Character, Integer>map=new HashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			Character ch= str.charAt(i);
			
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
	
		for(Character ch:map.keySet())
		{
			System.out.println(ch+"->"+map.get(ch));
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 hashmapoperation01("kaushal");
	}

}
