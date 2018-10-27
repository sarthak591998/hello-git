import java.util.*;
class Occurence {
void run(String s1,String s2) {
if(s1.contains(s2)==true) {
System.out.println("String2 contains in String1");
}
else {
System.out.println("String2 doesn't contain in String1");
}
}
}
public class a8q4 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
String s1=s.nextLine();
String s2=s.nextLine();
Occurence o=new Occurence();
o.run(s1,s2);
}
}