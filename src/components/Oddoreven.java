package components;
import java.util.Scanner;
public class Oddoreven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int number=obj.nextInt();
		if(number%2==0) {
			System.out.println("Not weird");
		}
		else if(number%2!=0) {
			System.out.println("Weird");
		}

	}

}
