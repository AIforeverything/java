package assignment_1;
import java.util.Scanner;
import java.lang.Math;
//Q 3   Create a function that takes an integer and returns the sum of its digits.
//Use a loop to extract each digit and perform  the sum.  
public class Que_3 {
	void sumOfDigitsOfInteger(int x) {
		int sum=0;
		while(x>0) {
			int digit=x%10;
			System.out.println("The digit of the number: "+digit);
			sum=sum+digit;
			x=x/10;
		}
		while(x<0 && x>-2147483648) {
			int digit=Math.abs(x%10);
			System.out.println("The digit of the number: "+digit);
			sum=sum+digit;
			x=x/10;
		}
		System.out.println("The sum of digits of the number: "+sum);
	}
	
public static void main(String[] args) {
		try {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the inter number whose sum of digits to be found out: ");
		int integer_input=s.nextInt();
		Que_3 integer=new Que_3();
		integer.sumOfDigitsOfInteger(integer_input);
		}
		catch(Exception e) {System.out.println("Error occured: "+e);}
	}
}
