import java.util.Scanner;

public class CheckPallindrome{
	public static void main(String args[]){
		
		int input,temp,rem,rev=0;
		Scanner s = new Scanner(System.in);
		input = s.nextInt();
		temp = input;
		while(temp>0){
			rem = temp%10;
			rev = rev * 10 + rem;
			temp = temp/10;
		}
		if(rev==input){
			System.out.println(input+" is a Pallindrome");
		}else{
			System.out.println(input+" is not Pallindrome");
		}

	}
}