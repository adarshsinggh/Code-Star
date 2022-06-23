public class OddEvenArray{
	public static void main(String args[]){
		int[] a = new int[] {1,2,3,4,5,6};
		
		System.out.println("Even Number : ");		
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				System.out.println(a[i]);
			}	
		}
		
		System.out.println("Odd Number : ");
		for(int i=0;i<a.length;i++){
			if(a[i]%2!=0){
				System.out.println(a[i]);
			}	
		}
	}
}