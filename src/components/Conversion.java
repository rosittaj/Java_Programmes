package components;

import java.util.Scanner;

public class Conversion {
	public static void main(String[] args) {
		// TO convert int to string.
		Scanner sobj=new Scanner(System.in);
		System.out.println("please enter the number");
		int number=sobj.nextInt();
		if(number>=0) {
			String.valueOf(number);
			System.out.println("The number"+" "+number+" converted to string");
		}
		else {
			System.out.println("The number"+" "+number+"not converted to string");
		}

	}

}
