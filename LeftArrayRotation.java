public class LeftArrayRotation{
	public static void main(String args[]){
		int[] a = new int[] {1,2,3,4,5};
		int n = 1;
		int firstPosition = a[0];
		int j;
		for(j=0;j<a.length-1;j++){
			a[j] = a[j+1];
		}
			a[j] = firstPosition;
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+",");
		}		
	}
}
