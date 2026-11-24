//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, temp, temp1, temp2, rem, gcd;
        /*a is first number
        * b is the second number
        * temp is a temporal variable for swapping a and b in case a is smaller than b
        * temp1 is to temporarily store the value of a so that it is not lost in manipulation
        * temp2 is to temporarily store the value of b so that it is not lost in computation
        * rem is to store the remainder
        * gcd is to store the value of the greatest common divisor */
        System.out.print("Enter the 2 numbers(*just positive integers*) of which you wish to find the gcd: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        /* this segment is to verify invalid input of a number equal to or smaller than 0*/
    while(a<=0 || b<=0){
            System.out.println("Invalid input");
            System.out.print("Enter the 2 numbers again(*just positive numbers*): ");
            a = scanner.nextInt();
            b = scanner.nextInt();
        }
      /*swapping in case a is smaller than b to facilitate computation*/
        if (b > a) {
            temp=a;
            a=b;
            b=temp;
        }
        /*if a and b are the same then the gcd is the number entered*/
        else if (a==b){
            gcd=a;
        }
       temp1=a;
       temp2=b;
       /*a do while loop to do the computation to find the gcd of the 2 numbers */
       do {rem=temp1%temp2;
           temp1=temp2;
           temp2=rem;
       }
       while (rem > 0);
       gcd=temp1;
       System.out.println("The Greatest common divisor of  " +a+ " and " +b+ " is " +gcd);

    }
}