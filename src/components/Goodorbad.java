package components;

import java.util.Scanner;

public class Goodorbad {

	public static void main(String[] args) {
		// TO check the given number is completely divisible by 2.
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=obj.nextInt();
		obj.close();
		if(num%2==0) {
			System.out.println("GOOD");
		}
		else {
			System.out.println("BAD");
		}

	}

}
