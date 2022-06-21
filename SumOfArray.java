public class SumOfArray{
	public static void main(String args[]){
		int[] a = new int[] {1,2,3,4,6,9,8,2};
		int sum = 0;
		for(int i=0;i<a.length;i++){
			sum = sum + a[i];
		}
		System.out.println("The sum of the given array is : "sum);
	}
}