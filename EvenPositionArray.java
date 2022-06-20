public class EvenPositionArray{
	public static void main(String args[]){
		int[] a = new int[] {1,2,3,4,5,8};
		for(int i=0;i<a.length;i++){
			if(i%2==0){
				System.out.println(a[i]+" On index : "+i);
			}
		}
	}
}