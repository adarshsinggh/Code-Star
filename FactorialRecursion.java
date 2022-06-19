import java.util.Scanner;

public class FactorialRecursion{
	static int fact = 1;
	public static void main(String args[]){
	
		int input;
		Scanner s = new Scanner(System.in);
		input = s.nextInt();	
		int result = checkFactorial(input);
		System.out.println(result);
	}

	static int checkFactorial(int input){
		if(input>0){
			fact = fact*input;

			checkFactorial(input-1);
		}
		return fact;
			
	}
}