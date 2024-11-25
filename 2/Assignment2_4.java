//4 wap to ask 7 names from user in string array and search for particular name in given array using for loop
package com.Assignments;
import java.util.Scanner;

public class Assignment2_4 {
	Scanner s=new Scanner(System.in);
	
	void setData(String n[]) {
		for(int i=0;i<n.length;i++) {
			System.out.print("Enter name: ");
			n[i]=s.next();
		}
	}
	void getData(String n[]) {
		for(String x:n) {
			System.out.println("name: "+x);
		}
	}
	void searchArray(String n[]) {
		System.out.println("enter name to be searched: ");
		String nm=s.next();
		int flag=0;
		for(String x:n) {
			if(nm==x) {
				flag=1;
			}
			else {flag=0;}
		}	
		if(flag==1) {System.out.println("Name is found in the given list of names.");}
		else {System.out.println("Name is found in the given list of names.");}
	}
	public static void main(String[] args) {
		String name[]=new String[7];
		Assignment2_4 a24=new Assignment2_4();
		a24.setData(name);
		a24.getData(name);
		a24.searchArray(name);
	}

}
