import java.util.Scanner;
public class ReadingInputTillZero {
    static void multiplicationTable(int num){
        for(int i = 1 ; i <= 10; i++){
            System.out.println(i * num);
        }
    }
    static void rightAngleTriangle(int num){
        for(int i = 0; i <= num; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void tree(int num) {
        for (int i = 1; i <= num; i++) {
            for (int s = 0; s < num - i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
     static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;
        while(true){
            num = sc.nextInt();
            if(num == 0){
                break;
            }
            sum += num;
            multiplicationTable(num);
            rightAngleTriangle(num);
            tree(num);
        }

    }

}