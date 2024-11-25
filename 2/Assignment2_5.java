//5 wap to define an array of integer .Take input from user .count and 
//print numbers greater than 100 .
package com.Assignments;
import java.util.Scanner;

public class Assignment2_5 {
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
	void displayArrayValuesGreater100(int a[]) {
		int count=0;
		int flag=0;
		System.out.print("\nElements of array which are greater than 100: ");
	
		for(int x:a) {
		if(x>100) { 
			System.out.println(" "+x);
			count+=1;
			flag=1;
		}
	}
	
	if(flag==0) {System.out.println("Nil");}
	else {System.out.println("Total elements greater than 100: "+count);
	}
}
	
	public static void main(String[] args) {
		Assignment2_5 p=new Assignment2_5();
		int q=0;
		int k=p.setSizeArray(q);
		int array[]=new int[k];
		p.setArrayValues(array);
		p.displayArrayValues(array);
		p.displayArrayValuesGreater100(array);
	}
}
