import java.util.*;

public class a4q5 {

public static void main(String[] args){
System.out.println("Enter any 10 numbers ");
Scanner scan=new Scanner(System.in);

int arr[]={0,0,0,0,0,0,0,0,0,0};

int i;
for(i=0;i<10;i++)
arr[i]=scan.nextInt();

for(i=1;i<10;i++) {
int e=arr[i];
int j=i-1;
while(j>=0 && arr[j]>e)
{
arr[j+1]=arr[j];
j=j-1;
}
arr[j+1]=e;
}
i=0;
for(i=1;i<10;i++) {
int e=arr[i];
int j=i-1;

while(j>=0 && arr[j]>e)
{
arr[j+1]=arr[j];
j=j-1;
}
arr[j+1]=e;
}

int temp=0;

for(i=0;i<7;i=i+2) {
temp=arr[i+1];
arr[i+1]=arr[i];
arr[i]=temp;
}

for(i=0;i<10;i++) {
System.out.print(" "+arr[i]);
}

}

}
