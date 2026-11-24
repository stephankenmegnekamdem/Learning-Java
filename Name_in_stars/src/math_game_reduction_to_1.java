import java.util.Scanner;
public class math_game_reduction_to_1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number that will be reduced to 1");
        int N=sc.nextInt();
        int count=0;
        while(N<=-0){
            System.out.println("Error pls enter a positive number ");
            N=sc.nextInt();
        }
        System.out.print(N+", ");
        while(N!=1){
            if(N%2==0){
              N=N/2;
              System.out.print(N+", ");
              count++;
            }
            else{
                N=(3*N)+1;
                System.out.print(N+", ");
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
