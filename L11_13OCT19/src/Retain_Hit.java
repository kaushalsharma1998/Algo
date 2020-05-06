
public class Retain_Hit {
	public static String remove_Hi_Hit(String str) {
		if (str.length() == 0) {
			return "";
		}

		if (str.length() > 1 && str.substring(0, 2).equals("hi")) {
			if (str.length() > 2 && str.substring(0, 3).equals("hit"))
				return "hit" + remove_Hi_Hit(str.substring(3));
			else
				return remove_Hi_Hit(str.substring(2));
		} 
		
		{
			char ch = str.charAt(0);
			return ch + remove_Hi_Hit(str.substring(1));
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("hitahiahihit");
		System.out.println(remove_Hi_Hit(s));

	}

}
