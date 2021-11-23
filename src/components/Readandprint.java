package components;
import java.util.Scanner;
import java.util.ArrayList;

public class Readandprint {

	public static void main(String[] args) {
		// For store user  5 string inputs
		ArrayList <String> alistobj=new ArrayList <String>();
		Scanner scannerobj=new Scanner(System.in);
		for(int i=0;i<=4;i++) {
			System.out.println("Enter the username: ");
			String name=scannerobj.nextLine();
			alistobj.add(name);
			System.out.println("The user is : "+name);
		}//For display stored inputs in list
		for(int j=0;j<alistobj.size();j++) {
			System.out.println(alistobj.get(j));
		}
	}
}
