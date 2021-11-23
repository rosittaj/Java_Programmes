package components;
import java.util.Scanner;

public class Doubletoprint {

	public static void main(String[] args) {
		// TO print double value with the prefix of double
		Scanner sobj=new Scanner(System.in);
		String s=sobj.nextLine();
		sobj.close();
		int num=0;
		if(num==0) {
			double d=Double.parseDouble(s);  
			System.out.println("Double"+" "+d);
		}
		else {
			System.out.println("Sorry");
		}


	}

}
