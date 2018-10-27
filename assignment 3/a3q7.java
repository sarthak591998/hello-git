import java.util.Scanner;
class a3q7 {
public static boolean fun(int[] arr, int i) {
for(int x : arr) {
if(i == x) {
return true;
}
}
return false;
}
public static void main(String args[]) {
int[] arr = { 1,4,6,7,8,9,10 };
  Scanner o = new Scanner(System.in);
  int n = o.nextInt();
  System.out.println(fun(arr , n));
  }
  }