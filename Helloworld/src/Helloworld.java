import java.util.Scanner;
public class Helloworld {
//num representations
    // math functions
//enums
    enum cardinalPoints {North, South, East, West};
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the cardinal point");
        cardinalPoints choosen= cardinalPoints.valueOf(input.next());
       int n= (choosen.ordinal()+1);
        System.out.println("The cardinal point for number " + n + " is : " + choosen );
        cardinalPoints Africa;
        Africa = cardinalPoints.South;
        System.out.println("Hello and welcome!");
        System.out.println("Our hemisphere is " + Africa + " " + (Africa.ordinal()+1));

        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);
        }
        System.out.print("The value of the length of ");
        System.out.print("the string \"Hello World\" is : ");
        System.out.println("Hello World".length());
        System.out.print("choose the index of a letter");

        int N = input.nextInt();
        System.out.print("The character at index ");
        System.out.print(N);
        System.out.print(" of the string \"Hello World\" ");
        System.out.print("is ");
        System.out.println("Hello World".charAt(N-1));

// output formatting
        double principal;
        double rate;
        double interest;
        System.out.print("Enter the principal amount :");
        principal = input.nextDouble();
        System.out.println("Enter the rate :");
        rate = input.nextDouble();
        interest=principal*rate;
        principal=principal+interest;
        System.out.printf("The updated principal amount is %1.2f" ,principal);
        System.out.printf("$ and the interest yielded is %1.2f",interest);
        System.out.println("$ for rate " +rate ) ;
    }






}