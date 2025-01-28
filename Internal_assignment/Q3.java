/*Q 3 Write a Java class Car with the following attributes: make, model, year, and color. 
Implement a constructor that initializes these attributes when an object of the Car 
class is created. Write a main method to create an instance of Car and display its attributes.
Enhance the Car class from the previous question by adding a parameterized constructor that 
takes values for make, model, year, and color as arguments.
 Demonstrate the use of this constructor in the main method*/
class Car{
    String make; String model; int year; String color;
    Car(){
        this.make=make;
        this.model=model;
        this.year=year;
        this.color=color;
    }

    Car(String make,String model,int year,String color){
        this.make=make;
        this.model=model;
        this.year=year;
        this.color=color;
    }
    void display(Car c){
        System.out.println("car make: "+c.make+" ,model: "+c.model+ ", year:  "+year+" and color: "+c.color);
    }
}
public class Q3 {
    public static void main(String[] args) {
        String make="tata"; String model="tiago"; int year=2012; String color="white";
        Car c1=new Car();
        c1.make=make;
        c1.model=model;
        c1.year=year;
        c1.color=color;
        c1.display(c1);

        Car c2=new Car("maruti","swift",2015,"red");
        c2.display(c2);
    }
}
