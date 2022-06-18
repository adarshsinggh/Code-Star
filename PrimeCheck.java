import java.util.Scanner;

public class PrimeCheck{
	public static void main(String args[]){
		int temp = 0;
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		if(input == 1){
		System.out.println(input+" is not a prime number");
		}
		else{
			for(int i = 2;i<=input-1;i++){
			if(input % i == 0){
				
				temp = +1;
			}
		}
		if(temp>0){
			System.out.println(input+" is not a prime number");
		}else{
			System.out.println(input+" is a prime number");
		}
		}
	}
}