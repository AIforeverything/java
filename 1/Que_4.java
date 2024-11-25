//4Q) Write a function that takes an integer n and prints the multiplication table for that number (from 1 to 10) 
//using a loop.
package assignment_1;
import java.util.Scanner;

public class Que_4 {
	void table_function(int n) {
		for(int i=1;i<11;i++) {
			System.out.println(n+" x "+i+"\t="+ n*i);
		}
	}
	public static void main(String[] args) {
		try {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number for table: ");
		int number=s.nextInt();
		Que_4 Table=new Que_4();
		Table.table_function(number);
		}
		catch(Exception e) {
			System.out.println("error is occures: "+e);
		}
	}

}
