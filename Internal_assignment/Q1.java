import java.util.Scanner;
class Rectangle{
    void rectangle_inputs(int size){
        Scanner sc=new Scanner(System.in);
        int rect[][]=new int[size][size];
	    int area[]=new int[size];
	    for(int i=0;i<size;i++) {
		System.out.print("enter length of rectangles-"+(i+1)+": ");
		int length= sc.nextInt();
		System.out.print("enter breadth of rectangles-"+(i+1)+": ");
		int breadth= sc.nextInt();
		rect[i][0]=length;
		rect[i][1]=breadth;
		area[i]=length*breadth;
	}
	for(int i=0;i<size;i++) {
			System.out.println("Area of rectangle-"+ (i+1)+" :"+area[i]);
		}
	int max=0;
	int index=0;
	for(int i=0;i<size;i++) {
		if(max<area[i]) {
			max=area[i];
			index=i+1;
	}
	}
	System.out.println("Out of all rectangles, Rectangle "+index+ " has the maximum area= "+max);
}
}
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number of rectangles: ");
        int size= sc.nextInt();
        Rectangle r1=new Rectangle();
        r1.rectangle_inputs(size);
    }
}
