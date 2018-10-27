class print_overload {

void print() {
  System.out.println("overload through null argument");
}

void print(int a) {
System.out.println("overload by passing integer value : " + a);
}

void print(float b) {
System.out.println("overload by passing float value : " + b);
}

}

public class a5q3 {

  public static void main(String args[]) {
     print_overload obj1 = new print_overload();
    int a = 5;
   float b = 3F;
   
    obj1.print();
   obj1.print(a);
   obj1.print(b);

}
}