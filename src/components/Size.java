package components;
import java.util.Scanner;
public class Size {

	public static void main(String[] args) {
		// TO check the size of a item on the basis of cm.
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter your size: ");
		int size=sobj.nextInt();
		if(size >=1 && size <=30) {
			System.out.println("Small");
		}
		else if(size >=31 && size <=60) {
			System.out.println("Medium");
		}
		else if(size >=61 && size <=100) {
			System.out.println("Large");
		}
		else {
			System.out.println("Not mentioned");
		}
	}

}
