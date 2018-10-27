import java.util.*;
class Substring {
  int i=0;
  void run(String s1) {
  while( i<s1.length()) {
System.out.println(s1.charAt(i));
i++;
}
for(i=0;i<s1.length();i++)
for(int j=0;j<s1.length();j++) {
System.out.print(s1.charAt(i));
System.out.println(s1.charAt(j));
}
}
void full(String s1) {
System.out.println(s1.substring(0,s1.length()));
}
}
public class a8q2 {
public static void main(String[] args) {
  Substring s=new Substring();
 String s1="xyz";
  s.run(s1);
s.full(s1);
}
}