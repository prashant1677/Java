// Filename should be same as class name

// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//         System.out.println("Hello Prashant");
//     }
// }

class Pen{
    String brand, color, type;

    Pen(){
        System.out.println("Pen default Constructor called");   //default constructor
    }

    public void write() {
        System.out.println("Hey I am writing.");
    }

    public void color() {
        System.out.println(this.color);
    }
}

class Student{
    int rollNo;
    String name;

    public void printInfo(){
        System.out.println(this.rollNo);
        System.out.println(this.name);
    }

    Student(int rollNo, String name){
        System.out.println("Student parameterized Constructor called");       //parameterized constructor
        this.rollNo=rollNo;
        this.name=name;
    }

    Student(Student s2){
        System.out.println("Student copy Constructor called");
        this.rollNo=s2.rollNo;
        this.name = s2.name;
    }
    
}

public class OOPS {
    public static void main(String args[]){
        Pen pen1 = new Pen();
        pen1.brand = "Cello";
        pen1.color = "Blue";
        pen1.type = "Gel";
        pen1.write();
        pen1.color();

        System.out.println("-----------");

        Student prashant = new Student(101,"Prashant");
        prashant.printInfo();

        Student pratyush = new Student(prashant);
        pratyush.printInfo();
    }
}
