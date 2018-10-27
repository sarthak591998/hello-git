class SuperClass {
void display() {
System.out.println("Parent class method");
}
}
class SubClass extends SuperClass {
void display(){
System.out.println("Child class method");
}
void printMsg() {
super.display();
}
}

public class a6q1 {
public static void main(String args[]){		
SubClass obj= new SubClass();
obj.printMsg(); 
}
}