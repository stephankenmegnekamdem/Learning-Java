import java.util.Scanner;
public class num_eggs {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int eggs, gross, dozen, left;
    System.out.println("Enter the number of eggs you have:");
    eggs = sc.nextInt();
    gross = eggs/144;
    dozen = (eggs%144)/12;
    left = (eggs%12);
    System.out.println("Lets see what you have got:");
    System.out.println("Gross\t "+gross);
    System.out.println("Dozen\t "+dozen);
    System.out.println("Left\t "+left);
    System.out.printf("This is because: (%d grosses*144)eggs + (%d dozens*12)eggs + (%d leftovers)eggs gives %d\n  ", gross, dozen, left, eggs );
    }
}
