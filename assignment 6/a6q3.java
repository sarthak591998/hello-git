class final FinalOne {
public int x;

void display() {
System.out.println("class function that cannot be extended");
}
}

class another extends FinalOne {

void another_display() {
 FinalOne obj = new FinalOne();
 obj.x = 10;
  System.out.println(obj.x);
}
}

public class a6q3 {
public static void main(String args[]) {
another a = new another();
a.another_display();
}
}