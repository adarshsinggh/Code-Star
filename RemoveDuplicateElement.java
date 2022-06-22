public class RemoveDuplicateElement{
	public static void main(String args[]){
		int[] a = new int[] {10,20,20,30,30,40,50,50};
		int j=0;

		for(int i=0;i<a.length-1;i++){
			if(a[i]!=a[i+1]){
				a[j++] = a[i];
			}
		}
			a[j++] = a[a.length-1];

		for(int i=0;i<j;i++){
			System.out.print(a[i]+",");
		}
		
	}
}