import java.util.Scanner;
class a3q5 {
public static void main(String args[]) {
int n , rev = 0;

Scanner obj1 = new Scanner(System.in);
n = obj1.nextInt();

while(n != 0)
{
rev = rev * 10;
rev = rev + n%10;
n = n/10;
}
System.out.println(rev);
}
}