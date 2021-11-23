package components;

import java.util.ArrayList;
import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TO multiply n numbers.
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		ArrayList<Integer> aobj=new ArrayList<Integer>();//Array list for storing N numbers.
		for(int i=1;i<=num;i++) {
			System.out.println("Enter the number: ");
			int numbers=obj.nextInt();
			aobj.add(numbers);
		}
		int multiple=1;
        for(int j=0;j<aobj.size();j++) {
        	multiple=multiple*aobj.get(j);//Multiplying N numbers already stored in Arraylist.
        }
        System.out.println(multiple);

	}

}
