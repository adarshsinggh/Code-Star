public class ReverseArray{
	public static void main(String args[]){
		int[] a = new int[] {1,2,3,4};

		for(int i=a.length-1;i>=0;i--){
			System.out.println(a[i]);
		}
	}
}