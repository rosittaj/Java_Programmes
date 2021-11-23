package components;
import java.util.Scanner;
import java.util.ArrayList;
public class Summation {

	public static void main(String[] args) {
		// TO add n numbers.
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		ArrayList<Integer> aobj=new ArrayList<Integer>();
		for(int i=1;i<=num;i++) {
			System.out.println("Enter the number: ");
			int numbers=obj.nextInt();
			aobj.add(numbers);
		}
		int sum=0 ;
        for(int j=0;j<aobj.size();j++) {
        	
        	sum=sum+aobj.get(j);
        }
        System.out.println(sum);
	}

}
