// Bhushan Kolhe -- TCS Xplore learning


//Demo od static value
// Problems statement : 
/*
Concept - Static Members Difficulty Level 2

Create a class Employee with below attributes:

id - int

name - String

designation - String

ssnNo - int

age - int

salary - double

idCounter - int which is a static field and initialize to 0

Make all the attributes private.Create corresponding getters and setters.

Create a constructor which takes all parameters except the static
 member and the attribute id in the above sequence.
The constructor should set the value of attributes as parameter values inside the 
constructor.Increment the value of the static member by 1 inside the constructor and 
assign to the attribute id

Test from the main method by creating  5 objects of the Employee class and print the idCounter value after creation of each object

Refer below sample main method and test the output:

public class EmployeeDemo {
public static void main(String args[]){
Employee employee1= new Employee("jirhehb","siarpha",35,70,776.0);
System.out.println("Value of idCounter : " + Employee.getIdCounter());
Employee employee2= new Employee("ycrdzsi","voivkqr",32,87,484.0);
System.out.println("Value of idCounter : " + Employee.getIdCounter());
Employee employee3= new Employee("txdxrzv","azpjbbb",4,63,369.0);
System.out.println("Value of idCounter : " + Employee.getIdCounter());
Employee employee4= new Employee("pefjukm","mctpbqe",36,0,951.0);
System.out.println("Value of idCounter : " + Employee.getIdCounter());
Employee employee5= new Employee("shbrzke","lpcnymz",51,86,181.0);
System.out.println("Value of idCounter : " + Employee.getIdCounter());
}
}

Output
Value of idCounter : 1
Value of idCounter : 2
Value of idCounter : 3
Value of idCounter : 4
Value of idCounter : 5

*/


import java.io.*;
import java.util.*;
class Main{
    
    public static void main(String args[]){

        Employee e1 = new Employee("BK","SK",1);
        System.out.println(e1.getid());
        Employee e2 = new Employee("KK","KK",2);
        System.out.println(e2.getid());
       // System.out.print(e1.getval());
    }
    
}

class Employee{
    
    private String name;
    private String product;
    private int val;
   private static int id=0;
    
    public Employee(String name, String product, int val){
        this.name = name;
        this.product = product;
        this.val = val;
    
    }
    
     int getid(){
        return id++;      // why it is declare as ststic --> because we need incremented value everytime
    }
    
    
    //This are some methods which are used to set and return values
    //Setters and getters  
    //this keyword is very important here please attention
    void setname(String name){
        this.name = name;
    }
    
    void setproduct(String product){
        this.product = product;
    }
    
    void setval(int val){
        this.val = val;
    }
    
    String getname(){
        return this.name;
    }
    
    String getproduct(){
        return this.product;
    }
    
    int getval(){
        return this.val;
    }
    
}
