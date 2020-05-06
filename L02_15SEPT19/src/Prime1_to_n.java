
public class Prime1_to_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int flag = 0;
		for (int i = 2; i <= n; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(i);
			}
			flag = 0;
		}

	}

}
