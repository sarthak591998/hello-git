1)Adding two numbers
 
/*import java.util.Scanner;
 
public class assignment_3
{
   public static void main(String args[])
   {
      int a,b,c;
 
      System.out.println("Enter two integers to calculate their sum");
      Scanner in = new Scanner(System.in);
 
      a = in.nextInt();
      b = in.nextInt();
      c = a + b;
 
      System.out.println("Sum of the integers = " + c);
   }
}

2)To verify its leap year

public class leapyear {

    public static void main(String[] args) {

        int year = 1900;
        boolean leap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                // year is divisible by 400, hence the year is a leap year
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if(leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}

3)Basic '*' pattern 

public class JavaProgram
{
    public static void main(String args[])
    {
        int i, j;
        for(i=0; i<5; i++)
        {
            for(j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

4)Largest of three numbers


import java.util.Scanner;
 
class LargestOfThreeNumbers
{
   public static void main(String args[])
   {
      int a, b, c;
      System.out.println("Enter three integers ");
      Scanner in = new Scanner(System.in);
 
      a = in.nextInt();
      b = in.nextInt();
      c = in.nextInt();
 
      if ( a > b && a > c )
         System.out.println("First number is largest.");
      else if ( b > a && b > c )
         System.out.println("Second number is largest.");
      else if ( c > a && c > b )
         System.out.println("Third number is largest.");
      else   
         System.out.println("Entered numbers are not distinct.");
   }
}

5)To verify pallindrone number


public class PalindromeNum {
 
	public static void main(String[] args)
	{
 
		int lastDigit,sum=0,a;    
		int inputNumber=171;  
 
		a=inputNumber; 
        
		while(a>0)
		{   System.out.println("Input Number "+a);  
			lastDigit=a%10; //getting remainder  
			System.out.println("Last Digit "+lastDigit); 
			System.out.println("Digit "+lastDigit+ " was added to sum "+(sum*10)); 
			sum=(sum*10)+lastDigit;  
			a=a/10;
			
		}    
 
		if(sum==inputNumber)    
			System.out.println("Number is palindrome ");    
		else    
			System.out.println("Number is not palindrome");    
 
	}
 
}


6)To verify prime number


public class Prime {

    public static void main(String[] args) {

        int num = 29;
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}

7)To find reverse of a number

public class ReverseNumber {

    public static void main(String[] args) {

        int num = 1234, reversed = 0;

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}*/

