
public class BurstBalloon {

	public static int burstb(int arr[],int si,int ei,int dp[][])
	{
		int l=(si-1==-1)?1:arr[si-1];
		int r=(ei+1==arr.length)?1:arr[ei+1];
	for(int cut=si;cut<=ei;cut++)
	{
		int left=(cut==si)?0:burstb(arr, si, cut-1, dp);
		int right=(cut==ei)?0:burstb(arr, cut+1, ei, dp);
		int cost= 
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
