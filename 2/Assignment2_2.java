//2 WAP to define two array a and b of size 5  .Add both array elements and store them to third array .
package com.Assignments;

import java.io.InputStream;

public class Assignment2_2 {
	int c[]=new int[5];
	void sumOfArrays(int d[],int e[]) {
		
		for(int i=0;i<d.length;i++) {
			c[i]=d[i]+e[i];
		}
		for(int x:c) {
		System.out.print(" "+ x);}
		
	}

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9,10};
		
		Assignment2_2 a22= new Assignment2_2();
		a22.sumOfArrays(a,b);
	}
}
