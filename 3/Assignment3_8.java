//Q 8  wap to perform addition of two three and fourth integer numbers 
//using functions (use polymorphism)
package com.Assignments;

class Polymor{
	int sum(int a,int b) {return a+b;}
	int sum(int a,int b,int c) {return a+b+c;}
	int sum(int a,int b,int c,int d) {return a+b+c+d;}
}
public class Assignment3_8 {

	public static void main(String[] args) {
		Polymor p=new Polymor();
		System.out.println("Two integers sum: "+p.sum(1, 2));
		System.out.println("Three integers sum: "+p.sum(1, 2,3));
		System.out.println("Four integers sum: "+p.sum(1, 2,3,4));
	}

}
