import java.util.Scanner;
public class Simple_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        double result;
        result = 0;
        String str;
        char operator;
        while (true) {
            System.out.println("Enter the first number, O to end: ");
            num1 = sc.nextInt();
            if (num1 == 0) {
                break;
            }
            System.out.println("Enter the operator you are going to use(+, -, / or *");
            str = sc.next();
            operator = str.charAt(0);
            System.out.println("Enter the second number: ");
            num2 = sc.nextInt();
            switch (operator) {
                case '+' -> result = num1 + num2;
                case '-' -> result = num1 - num2;
                case '*' -> result = num1 * num2;
                case '/' -> {
                    if (num2 != 0) {
                        result = (double)num1 / num2;
                    } else {
                        result = (double)num2 / num1;
                    }
                }
                default -> System.out.println("Invalid input");
            }
            System.out.printf("The result of %d %s %d is %1.4f\n", num1, operator, num2, result);
        }
        System.out.println("You ended the program by pressing 0");
    }
}
