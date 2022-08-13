import java.util.Scanner;

public class MultiArrayInput{
	public static void main(String args[]){
		int[][] arr = new int[3][3];
		Scanner s = new Scanner(System.in);

		for(int row = 0;row < arr.length;row++){
			for(int col = 0;col<arr[row].length;col++){
				arr[row][col] = s.nextInt();
			}
		}
		//output
		//
				System.out.println("The Output Generated :");
		for(int row = 0;row < arr.length;row++){
			for(int col = 0;col<arr[row].length;col++){
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}

	}

}