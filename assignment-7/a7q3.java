import java.util.*;
class Maximum {
String n1,n2;
Maximum(String a,String b) {
n1 = a;
n2 = b;
}
void compare() {
if(Integer.parseInt(n1)>Integer.parseInt(n2)) {
System.out.println("n1 is Bigger");
}
else {
System.out.println("n2 is Bigger");
}
}
}
public class a7q3 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);

String x=s.next();
String y=s.next();

Maximum m = new Maximum(x,y);
m.compare();
}
}