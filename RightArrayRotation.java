public class RightArrayRotation{
	public static void main(String args[]){
		int[] a = new int[] {1,2,3,4,5};
		int n = 1;
		int lastPosition = a[a.length-1];
		int j;

		for(j = a.length-1;j>0;j--){
			a[j] = a[j-1];
		}    
			a[0] = lastPosition;
		
			
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+",");
		}		
	}
}
