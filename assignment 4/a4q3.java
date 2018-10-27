import java.util.*;
public class a4q3 {

public static void main(String[] args){

System.out.println("Enter any 10 numbers ");
Scanner sc=new Scanner(System.in);

int arr[]={0,0,0,0,0,0,0,0,0,0};
int i,temp;
for(i=0;i<10;i++)
   arr[i]=sc.nextInt();

int max=0;

for(i=0;i<10;i++) {
   if(arr[i]>arr[max])
   max=i;

   if(i==9) {
     temp= arr[max];
     arr[max]=arr[0];
     arr[0]=temp;
}
}
  max=1;
   for(i=1;i<10;i++) {
     if(arr[i]>arr[max])
     max=i;
}
System.out.println(" "+arr[max]);

}
}
