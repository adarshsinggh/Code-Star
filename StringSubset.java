public class StringSubset{
	public static void main(String args[]){
	String input = "java";
	int len = input.length();
	int temp=0;
	String arr[] = new String[len*(len+1)/2];
	for(int i=0;i<len;i++){
		for(int j=i;j<len;j++){
			arr[temp] = input.substring(i,j+1);
			temp++;
		}
	}

	System.out.println("Subsets are : ");
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	}
	}
}