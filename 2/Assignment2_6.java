//6 wap to ask password from user and check if it is 123 then print  
//"allowed access"  else  give 3 total attempt to enter password .
//after 3 attempt print card blocked 

package com.Assignments;
import java.util.Scanner;

public class Assignment2_6 {
	Scanner s=new Scanner(System.in);
	static int pin=123;
	void checkPin() {
		int count=3;
		int flag=0;
		while(count>0) {
			System.out.print("enter 3 digits pin: ");
			int p1=s.nextInt();
		if(p1==pin) {
			System.out.println("Allowed access.");
			flag=0;
			break;
		}
		else {
			count=count-1;
			flag=1;
			System.out.println("Invalid pin.Try gain.Number of remaining chances: "+(count));	
		}
		}
		if(flag==1) {System.out.println("3 wrong attempts, so card is blocked.");}
		
	}
	public static void main(String[] args) {
		Assignment2_6 a26=new Assignment2_6();
		a26.checkPin();
	}

}
