import java.util.*;
class ReverseString {
 String s1="";
  String reverse(String s) {
  for(int i=s.length()-1;i>=0;i--) {
	  s1=s1+s.charAt(i);
  }
  return s1;
  }
}
public class a8q1 {
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  String s=sc.next();
  ReverseString r=new ReverseString();
  String s2=r.reverse(s);
  System.out.println(s2);
	}

}