import java.util.Scanner;
public class a3q4 {

    public static void main(String[] args) {

        int n,temp,total = 0;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        for( ;num!=0;num /= 10)
        {
            temp = num % 10;
            total = total + temp*temp*temp;
        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}