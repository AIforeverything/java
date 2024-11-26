//Q 1 WAP using parameterized constructor with two parameters id and name. While creating the objects obj1 and obj2
//    passed two arguments so that this constructor gets invoked after creation of obj1 and obj2
package com.Assignments;
import java.util.Scanner;

public class Assignment3_1 {
	int id;
	String name;
	Scanner s=new Scanner(System.in);
	

	Assignment3_1(){
		System.out.println("Enter Id: ");
		int i=s.nextInt();
		System.out.println("Enter name: ");
		String n=s.next();
		System.out.println("Id is: "+i+" and name is "+n);
	}
	Assignment3_1(int i,String n){
		System.out.println("Id is: "+i+" and name is "+n);
	}
	
	public static void main(String[] args) {
		Assignment3_1 a31=new Assignment3_1(20,"sudhakar"); //Parameterized constructor
		Assignment3_1 a31_2=new Assignment3_1();//Non-Parameterized constructor
	}

}
