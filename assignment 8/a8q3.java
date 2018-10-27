import java.util.*;
public class a8q3 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
String str1 = s.next();
String str2 = str1.replaceAll("[aeiouAEIOU]", "");
System.out.println(str2);
}
}