import java.util.*;
class CountWords {
void word(String s) {
int i=0,count=0;
while(i<s.length()) {
if(s.charAt(i)==' ') {
count++;
}
i++;
}
count=count+1;
System.out.println("Total words present in string are: "+count);
}
}
public class a8q5 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
CountWords cw=new CountWords();
cw.word(s);
}
}