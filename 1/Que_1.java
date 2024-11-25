package assignment_1;
import java.util.Scanner;
//1) Write a function that checks whether a given number is prime. Use a loop to test for factors, 
//and return true or false based on the result.
public class Que_1 {
void prime(int a) {
		int flag=0;
		if(a==0 || a==1 || a<0) {
			flag=0;
		}
		for(int i=2;i<a/2;i++) {
			if(a==2) {
				flag=1;
				break;
			}
			else if(a%i==0) {
				flag=0;
				break;
			}
			
			else {
				flag=1;
		}
	}
		if(flag==0) {
			System.out.println(a+" is not a prime number");
		}
		else if(flag==1){
			System.out.println(a+" is a prime number");
		}
}	

public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter value to be checked as prime: ");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		Que_1 q= new Que_1();
		q.prime(b);
	}

}