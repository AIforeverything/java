package assignment_1;
//2) Write a function that takes a student's score as an argument and returns a letter grade based on the following scale:
//90-100: A
//80-89: B
//70-79: C
//60-69: D
//Below 60: F
//Use if-else statements to determine the grade. 
import java.util.Scanner;
public class Que_2 {
void grade(float x) {
	if(x>100 || x<0 ) {System.out.println("Invalid input. Student 's score should be >=0 and <=100.");}
	else if(x>=89 && x<=100) {System.out.println("congratulations! You got grade A");}
	else if(x>=79 && x<89) {System.out.println("congratulations! You got grade B");}
	else if(x>=69 && x<=79) {System.out.println("congratulations! You got grade C");}
	else if(x>=60 && x<69) {System.out.println("congratulations! You got grade D");}
	else {System.out.println("Sorry. You failed in the exam. The Minimum criteria of score is >=60.");}
}	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.print("enter student score: ");
	float student_score=s.nextFloat();
	Que_2 s1=new Que_2();
	s1.grade(student_score);
}
}	

