public class LargestElement{
	public static void main(String args[]){
		int[] a = new int[] {1,2,5,8,9};
		int max = a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]>max){
				max = a[i];
			}
		}
		System.out.println(max);
	}
}