/**
 * Class: DaysOfAMonth
 * @author: Dr. Wei Jin, ITEC, GGC
 * Created spring,2023
 *
 * The program will display # days of a month given the year and month number.
 */

import java.util.Scanner;

public class DaysOfAMonth
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = in.nextInt();

        System.out.print("Enter the month: ");
        int month = in.nextInt();

        if (month < 8 && month % 2 != 0 || month >= 8 && month % 2 == 0){
            System.out.println(month + "/" + year + " has 31 days.");
        }
        // (year / 4) % 100 == 0 ||
        else if (month == 2) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                System.out.println(month + "/" + year + " has 29 days.");
            }
            else {
                System.out.println(month + "/" + year + " has 28 days.");
            }
        }
        else {
            System.out.println(month + "/" + year + " has 30 days.");
        }


        in.close();
    }
}