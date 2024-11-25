//7  Take 20 integer inputs from user and print the following:
//number of positive numbers
//number of negative numbers
//number of odd numbers
//number of even numbers
//number of 0s.
package com.Assignments;
import java.util.Scanner;

public class Assignment2_7 {
Scanner s=new Scanner(System.in);
	int setSizeArray(int q) {
		System.out.print("Enter array size: ");
		q=s.nextInt();
		return q;
	}
	void setArrayValues(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print("Enter array values: ");
			a[i]=s.nextInt();
		}
	}
	
	void displayArrayValues(int a[]) {
		for (int x:a) {
			System.out.print(" "+x);
		}
	}
	
	void numberOfPositiveNum(int a[]) {
		int count=0;
		for(int x:a) {
		if(x>0) { 
			count+=1;
		}
	}
	System.out.println("\nNumber of positive integers: "+count);
    }
	
	void numberOfOddEvenZero(int a[]) {
		int countEven=0;
		int countOdd=0;
		int zeros=0;
		for(int x:a) {
			if(x==0) {zeros+=1;}
			if(x%2==0) { 
				countEven+=1;
			}
			else {countOdd+=1;}
	}
	System.out.println("Number of even integers: "+countEven);
	System.out.println("Number of odd integers: "+countOdd);
	System.out.println("Number of zeros: "+zeros);
    }
	
	void numberOfNegativeNum(int a[]) {
		int count=0;
		for(int x:a) {
		if(x<0) { 
			count+=1;
		}
	}
	System.out.println("Number of negative integers: "+count);
    }
	
	public static void main(String[] args) {
		Assignment2_7 p=new Assignment2_7();
		int q=0;
		int k=p.setSizeArray(q);
		int array[]=new int[k];
		p.setArrayValues(array);
		p.displayArrayValues(array);
		p.numberOfPositiveNum(array);
		p.numberOfNegativeNum(array);
		p.numberOfOddEvenZero(array);
	}
}

