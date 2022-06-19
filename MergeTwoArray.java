public class MergeTwoArray{
	public static void main(String args[]){
		int[] a = new int[] {10,20,30};
		int[] b = new int[] {40,50,60,70,80,90};
		int aLength = a.length;
		int bLength = b.length;
		int cLength = aLength+bLength;
		int[] c = new int [cLength];

		for(int i=0;i<aLength;i++){
			c[i] = a[i];
		}
		for(int i=0;i<bLength;i++){
			c[aLength+i] = b[i];
		}
		for(int i=0;i<cLength;i++){
			System.out.print(c[i]+",");
		}
	}
}