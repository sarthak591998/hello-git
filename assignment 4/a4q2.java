import java.util.*;
class Complex {
int real;
int imag;

Complex(int x,int y) {
real = x;
imag = y;
}

public void display() {
System.out.print("answer is : ");
System.out.println(real + "+" +imag + "i");
}
}

public class a4q2 {
public static void main(String args[]) {

int a,b;
Scanner scan=new Scanner(System.in);

 System.out.println("Enter the real and imaginary values");
 a=scan.nextInt();
 b=scan.nextInt();
 Complex c1 = new Complex(a,b);
   c1.display();
}
}