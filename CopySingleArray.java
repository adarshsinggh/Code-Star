public class CopySingleArray{
	public static void main(String args[]){

		int a[] = {1,2,6,8,9,3};
		int len = a.length;
		int b[] = new int[len];
		for(int i = 0;i<a.length;i++){
			b[i] = a[i];
			System.out.print(b[i]+",");
		}
		
	}
}