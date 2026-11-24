import java.util.Scanner;

public class BaseConversion2 {
        public static int temp;
        public static int bindigit;
        public static int var;
        private static long A[];
        private static int N;

        static void base2tobase10(long []A, int N, long num2){
            int c=0;
            int j = N-1;
            int num10=0;
            while (j>=0){
                num10=num10+(int)(A[j]*(int)Math.pow(2, c));
                c++;
                j--;
            }
            System.out.println(num2+" is "+num10+" base10");

        }
        static void base2tobase8(long []A, int N, long num2){
            int  c=-1;
            var = 0;
            bindigit = N-1;
            int num8=0;
            temp=0;
            while (bindigit>=0){
                temp=temp+(int)(A[bindigit]*(int)Math.pow(2, var));
                bindigit--;
                var++;
                if (var %3==0){
                    var =0;
                    temp=temp*(int)Math.pow(10, ++c);
                    num8=num8+temp;
                    temp=0;
                }
            }
            if (temp!=0){
                temp=temp*(int)Math.pow(10, ++c);
                num8=num8+temp;
            }
            System.out.println(+num2+" is "+num8+" base8");
        }

        static void base2tobase16(long []A, int N, long num2){
            int   hexadigit;
            var = 0;
            bindigit = N-1;
            hexadigit=1+(N/4);
            if((N%4)==0) {
                hexadigit = N / 4;
            }

            String hexanum[]= new String[hexadigit] ;
            int  c=-1;
            temp=0;
            while (bindigit >=0){
                temp=temp+(int)(A[bindigit]*(int)Math.pow(2, var));
                var++;
                if (var %4==0){
                    var =0;
                    hexadigit--;
                    if(temp<=9) {
                        hexanum[hexadigit] = String.valueOf(temp);
                    }
                    else{
                        if(temp==10){
                            hexanum[hexadigit] = "A";
                        }
                        if(temp==11){
                            hexanum[hexadigit] = "B";
                        }
                        if(temp==12){
                            hexanum[hexadigit] = "C";
                        }
                        if(temp==13){
                            hexanum[hexadigit] = "D";
                        }
                        if(temp==14){
                            hexanum[hexadigit] = "E";
                        }
                        if(temp==15){
                            hexanum[hexadigit] = "F";
                        }

                    }
                    temp=0;
                }
                bindigit--;
            }
            if (temp!=0){
                hexadigit--;
                hexanum[hexadigit] = String.valueOf(temp);
            }

            System.out.print(num2+" is  ");
            for (int i=0; i<hexanum.length; i++){
                System.out.print(hexanum[i]);
            }
            System.out.println(" base 16");
        }


        static void base10tobase2( int num10){
            long num2;
            int c=0;
            num2=0;
            temp=0;
            int tempnum10=num10;
            while(tempnum10>0){
                temp=((tempnum10%2)*(int)Math.pow(10, c));
                num2=num2+temp;
                tempnum10=tempnum10/2;
                c++;
            }
            System.out.println(num10+" is "+num2+" base2");

        }


        static void base10tobase3(int num10){
            long num3;
            int c=0;
            num3=0;
            temp=0;
            int tempnum10=num10;
            while(tempnum10>0){
                temp=((tempnum10%3)*(int)Math.pow(10, c));
                num3=num3+temp;
                tempnum10=tempnum10/3;
                c++;
            }
            System.out.println(num10+" is "+num3+" base3");


        }
        static void base3tobase10(long []A, int N, long num3){
            int i=0;
            int j = N-1;
            int num10=0;
            while (j>=0){
                num10=num10+(int)(A[j]*(int)Math.pow(3, i));
                i++;
                j--;
            }
            System.out.println(num3+" is "+num10+" base10");

        }

        static void base10tobase4(int num10){
            long num4;
            int c=0;
            num4 =0;
            temp=0;
            int tempnum10=num10;
            while(tempnum10>0){
                temp=((tempnum10%4)*(int)Math.pow(10, c));
                num4 = num4 +temp;
                tempnum10=tempnum10/4;
                c++;
            }
            System.out.println(num10+" is "+ num4 +" base4");


        }
        static void base4tobase10(long []A, int N, long num4){
            int i=0;
            int j = N-1;
            int num10=0;
            while (j>=0){
                num10=num10+(int)(A[j]*(int)Math.pow(4, i));
                i++;
                j--;
            }
            System.out.println(num4+" is "+num10+" base10");

        }



        static void base10tobase5(int num10){
            long num5;
            int c=0;
            num5 =0;
            temp=0;
            int tempnum10=num10;
            while(tempnum10>0){
                temp=((tempnum10%5)*(int)Math.pow(10, c));
                num5 = num5 +temp;
                tempnum10=tempnum10/5;
                c++;
            }
            System.out.println(num10+" is "+ num5 +" base5");


        }
        static void base5tobase10(long []A, int N, long num5){
            int i=0;
            int j = N-1;
            int num10=0;
            while (j>=0){
                num10=num10+(int)(A[j]*(int)Math.pow(5, i));
                i++;
                j--;
            }
            System.out.println(num5+" is "+num10+" base10");

        }

        static void base10tobase6(int num10){
            long num6;
            int c=0;
            num6 =0;
            temp=0;
            int tempnum10=num10;
            while(tempnum10>0){
                temp=((tempnum10%6)*(int)Math.pow(10, c));
                num6 = num6 +temp;
                tempnum10=tempnum10/6;
                c++;
            }
            System.out.println(num10+" is "+ num6 +" base6");


        }
        static void base6tobase10(long []A, int N, long num6){
            int i=0;
            int j = N-1;
            int num10=0;
            while (j>=0){
                num10=num10+(int)(A[j]*(int)Math.pow(6, i));
                i++;
                j--;
            }
            System.out.println(num6+" is "+num10+" base10");

        }

        static void base10tobase7(int num10){
            long num7;
            int c=0;
            num7 =0;
            temp=0;
            int tempnum10=num10;
            while(tempnum10>0){
                temp=((tempnum10%7)*(int)Math.pow(10, c));
                num7 = num7 +temp;
                tempnum10=tempnum10/7;
                c++;
            }
            System.out.println(num10+" is "+ num7 +" base7");


        }
        static void base7tobase10(long []A, int N, long num7){
            int i=0;
            int j = N-1;
            int num10=0;
            while (j>=0){
                num10=num10+(int)(A[j]*(int)Math.pow(7, i));
                i++;
                j--;
            }
            System.out.println(num7+" is "+num10+" base10");

        }

        static void base10tobase8(int num10){
            long num8;
            int c=0;
            num8 =0;
            temp=0;
            int tempnum10=num10;
            while(tempnum10>0){
                temp=((tempnum10%8)*(int)Math.pow(10, c));
                num8 = num8 +temp;
                tempnum10=tempnum10/8;
                c++;
            }
            System.out.println(num10+" is "+ num8 +" base8");


        }
        static void base8tobase10(long []A, int N, long num8){
            int i=0;
            int j = N-1;
            int num10=0;
            while (j>=0){
                num10=num10+(int)(A[j]*(int)Math.pow(8, i));
                i++;
                j--;
            }
            System.out.println(num8+" is "+num10+" base10");

        }


        static void base10tobase9(int num10){
            long num9;
            int c=0;
            num9 =0;
            temp=0;
            int tempnum10=num10;
            while(tempnum10>0){
                temp=((tempnum10%9)*(int)Math.pow(10, c));
                num9 = num9 +temp;
                tempnum10=tempnum10/9;
                c++;
            }
            System.out.println(num10+" is "+ num9 +" base3");


        }
        static void base9tobase10(long []A, int N, long num9){
            int i=0;
            int j = N-1;
            int num10=0;
            while (j>=0){
                num10=num10+(int)(A[j]*(int)Math.pow(9, i));
                i++;
                j--;
            }
            System.out.println(num9 +" is "+num10+" base10");

        }
        static void base10tobase16(int num10){
            int hexadigit=0;
            temp=num10;
            while(temp!=0){
                hexadigit++;
                temp=temp/16;
            }

            String num16[]= new String[hexadigit] ;
            temp=hexadigit-1;
            int tempnum10=num10;
            while(tempnum10>0){
                if(tempnum10%16<10) {
                    num16[temp] = String.valueOf(tempnum10 % 16);
                }
                if((tempnum10%16)==10){
                    num16[temp] = "A";
                }
                if((tempnum10%16)==11){
                    num16[temp] = "B";
                }
                if((tempnum10%16)==12){
                    num16[temp] = "C";
                }
                if((tempnum10%16)==13){
                    num16[temp] = "D";
                }
                if((tempnum10%16)==14){
                    num16[temp] = "E";
                }
                if((tempnum10%16)==15){
                    num16[temp] = "F";
                }
                tempnum10=tempnum10/16;
                temp--;

            }

            System.out.print(num10+" is  ");
            for (int i=0; i<hexadigit; i++){
                System.out.print(num16[i]);
            }
            System.out.println(" base 16");



        }
        static void base16tobase10(){
            Scanner sc = new Scanner(System.in);
            String num16=sc.nextLine();
            int hexadigit= num16.length();
            String []A16= new  String[hexadigit];
            for(var=0;var<hexadigit;var++){
                A16[var]=String.valueOf(num16.charAt(var));
            }
            int num10=0;
            temp=hexadigit-1;
            var=0;
            int c=0;

            while(temp!=-1){

                if(A16[temp].equals("A")){
                    var=10;
                }
                if(A16[temp].equals("B")){
                    var=11;
                }
                if(A16[temp].equals("C")){
                    var=12;
                }
                if(A16[temp].equals("D")){
                    var=13;
                }
                if(A16[temp].equals("E")){
                    var=14;
                }
                if(A16[temp].equals("F")){
                    var=15;
                }

                boolean isNumeric = A16[temp].matches("\\d+");

                if (isNumeric) {
                    var = Integer.parseInt(A16[temp]);
                }
                num10=num10+(var*(int)Math.pow(16, c));
                temp--;
                c++;
            }
            System.out.println(num16 +" is "+num10+" base10");

        }


        public static void main(String[] args) {
            System.out.println("               Base Conversion program        ");
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("Note: available conversions are  ");
            System.out.println("initial base: 2 final base: 10 or vice versa(initial base: 10 and final base: 2");
            System.out.println("initial base: 2 final base: 8");
            System.out.println("initial base: 2 final base: 16");
            System.out.println("initial base: 10 final base: 3 or vice versa");
            System.out.println("initial base: 10 final base: 4 or vice versa");
            System.out.println("initial base: 10 final base: 5 or vice versa");
            System.out.println("initial base: 10 final base: 6 or vice versa");
            System.out.println("initial base: 10 final base: 7 or vice versa");
            System.out.println("initial base: 10 final base: 8 or vice versa");
            System.out.println("initial base: 10 final base: 9 or vice versa");
            Scanner input = new Scanner(System.in);
            int baseinitial;
            int basefinal;
            int condition;
            outerloop: do {
                //Part1 getting a base2 number
                System.out.println("Enter the initial base and final base");
                baseinitial = input.nextInt();
                basefinal = input.nextInt();
                while(!((baseinitial==2&&basefinal==10)||(baseinitial==10&&basefinal==2)||
                        (baseinitial==2&&basefinal==8)||(baseinitial==2&&basefinal==16)||
                        (baseinitial==10&&basefinal==3)||(baseinitial==3&&basefinal==10)||
                        (baseinitial==10&&basefinal==4)||(baseinitial==4&&basefinal==10)||
                        (baseinitial==10&&basefinal==5)||(baseinitial==5&&basefinal==10)||
                        (baseinitial==10&&basefinal==6)||(baseinitial==6&&basefinal==10)||
                        (baseinitial==10&&basefinal==7)||(baseinitial==7&&basefinal==10)||
                        (baseinitial==10&&basefinal==8)||(baseinitial==8&&basefinal==10)||
                        (baseinitial==10&&basefinal==9)||(baseinitial==9&&basefinal==10)||
                        (baseinitial==10&&basefinal==16)||(baseinitial==16&&basefinal==10))){
                    System.out.println("Invalid input");
                    System.out.println("Try again to enter initial and final bases or press 0 to stop");
                    baseinitial = input.nextInt();
                    basefinal = input.nextInt();
                    if(baseinitial==0||basefinal==0){
                        break outerloop;
                    }

                }

                System.out.println("Enter the base " + baseinitial + " number");
                if (baseinitial != 10) {

                    if(baseinitial!=16) {

                        long num = input.nextLong();
                        //end of part1

                        //Part 2 finding the number of digits
                        long temp;
                        temp = num;
                        N = 0;
                        while (temp != 0) {
                            temp = temp / 10;
                            N++;
                        }
                        //end of part2

                        //Part3 Declaring an array to contain all digits and filling the array with the digits
                        A = new long[N];
                        temp = num;
                        int i = N - 1;
                        while (i >= 0) {
                            A[i] = temp % 10;
                            temp = temp / 10;
                            i--;
                        }

                        //end of part3
                        if (baseinitial == 2) {
                            if (basefinal == 10) {
                                //Part4 Conversion to base 10
                                base2tobase10(A, N, num);
                                //end of part4
                            }
                            if (basefinal == 8) {
                                //Part5 conversion to base 8
                                base2tobase8(A, N, num);
                            }
                            if (basefinal == 16) {
                                base2tobase16(A, N, num);
                            }
                        }
                        if (baseinitial == 3) {
                            if (basefinal == 10) {
                                base3tobase10(A, N, num);
                            }
                        }
                        if (baseinitial == 4) {
                            if (basefinal == 10) {
                                base4tobase10(A, N, num);
                            }
                        }
                        if (baseinitial == 5) {
                            if (basefinal == 10) {
                                base5tobase10(A, N, num);
                            }
                        }
                        if (baseinitial == 6) {
                            if (basefinal == 10) {
                                base6tobase10(A, N, num);
                            }
                        }
                        if (baseinitial == 7) {
                            if (basefinal == 10) {
                                base7tobase10(A, N, num);
                            }
                        }
                        if (baseinitial == 8) {
                            if (basefinal == 10) {
                                base8tobase10(A, N, num);
                            }
                        }
                        if (baseinitial == 9) {
                            if (basefinal == 10) {
                                base9tobase10(A, N, num);
                            }
                        }
                    }
                    if (baseinitial == 16) {

                        base16tobase10();

                    }






                }



                if (baseinitial == 10) {

                    int num10 = input.nextInt();
                    if (basefinal == 2) {
                        base10tobase2(num10);
                    }
                    if (basefinal == 3) {
                        base10tobase3(num10);
                    }
                    if (basefinal == 4) {
                        base10tobase4(num10);
                    }
                    if (basefinal == 5) {
                        base10tobase5(num10);
                    }
                    if (basefinal == 6) {
                        base10tobase6(num10);
                    }
                    if (basefinal == 7) {
                        base10tobase7(num10);
                    }
                    if (basefinal == 8) {
                        base10tobase8(num10);
                    }
                    if (basefinal == 9) {
                        base10tobase9(num10);
                    }
                    if (basefinal == 16) {
                        base10tobase16(num10);
                    }


                }
                System.out.println("Do you want to continue, 0 if not");
                condition=input.nextInt();
            }while(condition!=0);
        }

    }
    //end of part 5





