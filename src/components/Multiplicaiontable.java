package components;
import java.util.Scanner;
public class Multiplicaiontable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Which multiplication table you want");
		int number=obj.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(number +"*"+i+"="+number*i);
		}

	}

}
