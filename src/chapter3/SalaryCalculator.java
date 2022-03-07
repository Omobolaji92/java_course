package chapter3;

import java.util.Scanner;

/*
IF Statements.
All salespeople get a payment of $1,000 a week.
Salespeople who exceeds 10 sales, get an additional bonus of $250.
 */
public class SalaryCalculator {

    public static void   main(String arg[]){

        //Initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //Get values for the unknown
        System.out.println("How many sales did the employee made this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners
        if(sales > quota) {
            salary = salary + bonus;
        }

        //Output result
        System.out.println("The employee's pay is $" + salary);
    }
}
