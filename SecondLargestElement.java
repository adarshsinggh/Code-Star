public class SecondLargestElement{
	public static void main(String args[]){
		int[] a = new int[] {9,3,4,8,2};
		int temp = 0;
			
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
				  temp = a[i];
			 	  a[i] = a[j];
				  a[j] = temp;
				}
			}		
		}
		System.out.println(a[a.length-2]);
	}
}