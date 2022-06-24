import java.util.Arrays;

public class Anagram{
	public static void main(String args[]){
		String input1 = "Gram";
		String input2 = "Marg";
		
		input1 = input1.toLowerCase();
		input2 = input2.toLowerCase();
		
		if(input1.length()!=input2.length()){
			System.out.println("Not Anagram");
		}else{
			char[] string1 = input1.toCharArray();
			char[] string2 = input2.toCharArray();

			Arrays.sort(string1);
			Arrays.sort(string2);

			if(Arrays.equals(string1,string2)==true){
				System.out.println("Strings are Anagram");
			}else{
                		System.out.println("Strings are Anagram");
			}
		}
	}
}
