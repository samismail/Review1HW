/**
 * Class: DSequencePractice
 * @author: Dr. Wei Jin, ITEC, GGC
 * Created spring,2023
 *
 * This program will print various sequences using loops.
 */

public class SequencePractice {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter a positive even integer: ");
        int num = input.nextInt();
        while (num < 0 || num % 2 != 0) {
            System.out.print("The number you entered is not positive or not even. Please reenter: ");
            num = input.nextInt();
        }

                // Use the following where it is appropriate.
                // System.out.print("The number you entered is not positive or not even. Please reenter: ");

        //all integers from 1 up to n
        System.out.println("Sequence 1 to n: ");
        for (int i = 0; i < num; i++){
            System.out.print(i + 1 + " ");
        }


        //all even integers from  2 up to n
        System.out.println('\n' + "Even sequence 2 to n: ");
        for (int i = 0; i < num; i+= 2){
            System.out.print(i + 2 + " ");
        }


        //all integers from n down to 1
        System.out.println('\n' + "Sequence n down to 1: ");
        for (int i = num; i <= num && i > 0; i--){
            System.out.print(i + " ");
        }


        //all even integers from n down to 2
        System.out.println('\n' + "Even sequence n down to 2: ");
        for (int i = num; i <= num && i > 0; i-= 2){
            System.out.print(i + " ");
        }


        //all the integers from -n up to -1
        System.out.println('\n' + "Sequence -n to -1: ");
        for (int i = num; i <= num && i > 0; i--){
            System.out.print((i * -1) + " ");
        }


        //all the even integers from -n up to -2
        System.out.println('\n' + "Even sequence -n to -2: ");
        for (int i = num; i <= num && i > 0; i-= 2){
            System.out.print((i * -1) + " ");
        }

        //all the integers from -1 down to -n
        System.out.println('\n' + "Sequence -1 down to -n: ");
        for (int i = 1; i <= num; i++){
            System.out.print((i * -1) + " ");
        }

        //all the even integers from -2 down to -n
        System.out.println('\n' + "Even sequence -2 down to -n: ");
        for (int i = 2; i <= num; i+= 2){
            System.out.print((i * -1) + " ");
        }



    } //end of main
} //end of class