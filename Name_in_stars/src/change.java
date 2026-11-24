import java.util.Scanner;
public class change {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int penny, nickel, dime, quarter, dollars;
        double change;
        System.out.println("Enter how much money you have");
        System.out.println("First Pennies");
        penny = sc.nextInt();
        System.out.println("now Nickels");
        nickel = sc.nextInt();
        System.out.println("now Dimes");
        dime= sc.nextInt();
        System.out.println("now Quarters");
        quarter = sc.nextInt();
        System.out.println("now Dollars");
        dollars = sc.nextInt();
        change = dollars + (0.01*penny) + (0.05*nickel) + (0.1*dime) + (0.25*quarter) ;
        System.out.println("So You have :");
        System.out.println(penny + " \t Pennies,\t");
        System.out.println(nickel + " \t Nickels,\t");
        System.out.println(dime + " \t Dimes,\t");
        System.out.println(quarter + " \t Quarters,\t");
        System.out.println(dollars + " \t Dollars.");
        System.out.printf( "This makes %.2f$ \n ", change);

    }
}
