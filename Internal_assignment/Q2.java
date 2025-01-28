/*Q 2 Create a class named Student with the following attributes:
1)      name (String): to store the name of the student.
2)      id (int): to store the student ID.
3)      grade (double): to store the grade of the student.
Implement a constructor to initialize these attributes.
 
è In the main method, create an array named studentArray that can hold up to 10 Student objects.
è Initialize the studentArray array with different Student objects. You can use fictional student data for this.
è Write a method named displayStudents that takes the studentArray array as a parameter and displays the details of each student in the array.
è Write a method named sortStudents that takes the studentArray array as a parameter and sorts the array based on the grades of the students
in ascending order. You can use any sorting algorithm of your choice (e.g., bubble sort )*/
import java.util.Scanner;
class Student{
    String name="s1";
    int id=0;
    double grade=0.0;
    Student(String name,int id,double grade){
        this.name=name;
        this.id=id;
        this.grade=grade;
    }
    public static void display(Student s[]){
        for(int i=0;i<10;i++){
            System.out.println("name: "+s[i].name+ " id: "+s[i].id+" grade: "+s[i].grade);
        }
    }
}

public class Q2{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String name="a";int id=0;double grade=0.0;
    Student[] s=new Student[10];
    
    for(int i=0;i<10;i++){
        System.out.println("enter student-"+(i+1) + " name: ");
        System.out.println("enter student- "+(i+1) + " id: ");
        System.out.println("enter student grade- "+(i+1) + ": ");
        s[i]= new Student(sc.next(),sc.nextInt(),sc.nextDouble());
    }
    System.out.println("Before sorting: "); 
    for(int i=0;i<10;i++){
        System.out.println("name: "+s[i].name+ " id: "+s[i].id+" grade: "+s[i].grade);
    }
    for (int i = 0; i < s.length - 1; i++) {
        for (int j = 0; j < s.length - 1 - i; j++) {
            if (s[j].grade > s[j + 1].grade) {
                // Swap the students if they are in the wrong order
                Student temp = s[j];
                s[j] = s[j + 1];
                s[j + 1] = temp;
            }
        }
    }
    System.out.println("After sorting: "); 
    for(int i=0;i<10;i++){
        System.out.println("name: "+s[i].name+ " id: "+s[i].id+" grade: "+s[i].grade);
    }
}
}
