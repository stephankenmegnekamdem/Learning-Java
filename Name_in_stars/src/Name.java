//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Name {
    public static void main (String[] args){
        System.out.println("    ********            ************            ***********");
        System.out.println("  **                         **                 **");
        System.out.println("**                           **                 **");
        System.out.println("  **                         **                 **");
        System.out.println("    ********                 **                 ***********");
        System.out.println("            **               **                 **");
        System.out.println("              **             **                 **");
        System.out.println("            **               **                 **");
        System.out.println("    ********                 **                 ************");
        int die;
        int sum=0;

        for (int i=0 ; i<=1 ; i++) {
            die = (int) (Math.random() * 6 + 1);
            System.out.println("The die gives " + die + " for " + (i+1) + " try");
            sum=sum+die;
        }
        System.out.println("The sum of 2 rolls is " + sum);
int k=8;
        for (int i=0 ; i<=8 ; i++) {
            System.out.println("");

                for (int l=0 ; l<=k ; l++ ) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                    if(j>0) {
                        for (int m = j; m < (j + 1); m++) {
                            System.out.print("*");
                        }
                    }
                    }

                --k;


        }
        
                int height = 9;

                for (int i = 1; i <= height; i++) {
                    // Print spaces
                    for (int j = 1; j <= height - i; j++) {
                        System.out.print(" ");
                    }

                    // Print stars
                    for (int u = 1; u <= (2 * i - 1); u++) {
                        System.out.print("*");
                    }

                    // Move to next line
                    System.out.println();
                }





    }

}