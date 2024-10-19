import java.util.Scanner;
import java.lang.Math;
public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		/*
		int x, y;
		
		
		System.out.println("Enter 2 integer values: ");
		//Taking input integers
		x = obj.nextInt();
		y = obj.nextInt();
		int z =5;
		
		System.out.println("Entered integers are " +x +" "+y);
		
		// max of 2 or 3 numbers in java
		int max = Math.max(x,y);
		System.out.println(max);
		
		*/
		
		//Input a number from user
		int n = obj.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
