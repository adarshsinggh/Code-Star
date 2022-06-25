public class DivideString{
	public static void main(String args[]){
	String input = "zzzzffffdddd";
	int n=3;
	int len = input.length();	
	int temp=0,chars=len/n;

	String[] equalStr = new String[n];

	if(len%n!=0){
		System.out.println("Input cannot be divided into "+n+" equal part");
	}else{
		for(int i=0;i<len;i=i+chars){
			String part = input.substring(i,i+chars);
			equalStr[temp] = part;
			temp++;
		}
		System.out.println(n+" equal parts are");
		for(int i=0;i<equalStr.length;i++){
			System.out.println(equalStr[i]);
		}
	}
	}
}