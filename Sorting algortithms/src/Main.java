import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println("Press 1  for bubble Sort or 2 for selection sort");
        int choice = scanner.nextInt();
        int temp, c;
        c=0;
        switch (choice) {
            case 1:
                for (int i = 0; i < n-1; i++) {
                    for (int j = 1 ; j < n; j++) {
                        if (A[j] < A[j-1]) {
                            temp=A[j];
                            A[j]=A[j-1];
                            A[j-1]=temp;
                            c=1;
                        }
                    }
                    if (c==0) {
                        break;
                    }
                }
                break;

            case 2:
            int min ;
             for (int i = 0; i < n-1; i++) {
                 min=i;
                 for (int j = i+1; j < n; j++) {
                     if (A[i]>A[j]) {
                         min=j;
                     }
                 }
                 temp=A[i];
                 A[i]=A[min];
                 A[min]=temp;
             }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(A[i]);
        }

    }
}