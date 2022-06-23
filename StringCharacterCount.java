public class StringCharacterCount{
	public static void main(String args[]){
		String name = "Adarsh Singh";
		int count = 0;
		for(int i=0;i<name.length();i++){
			if(name.charAt(i)!=' '){
				count++;
			}
		}
		System.out.println("The Length of the string is: "+count);
	}
}