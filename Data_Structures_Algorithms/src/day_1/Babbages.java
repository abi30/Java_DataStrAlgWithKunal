package day_1;
import java.util.*;
public class Babbages
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);

        double salaryPerHour;
        double hours;
        double tax;
        double earnings;
        double total;
        double totalEarnings=0;

        String again = "Y";
        while (again.equals("Y"))
        {
            System.out.print("Enter salary per hour: ");
            salaryPerHour = input.nextDouble();
            while (salaryPerHour < 0)
            {
                System.out.println("Invalid:  that is not greater than >=0 ");
                System.out.println("Enter a positive number>= 0");
                salaryPerHour =input.nextDouble();
            }
            System.out.print("Enter numbers of  hour worked: ");
            hours = input.nextDouble();
            while (hours >=168)
            {
                 System.out.println("Invalid:  that is not greater than >=168");
                 System.out.println("Enter a positive number>=168");
                hours = input.nextDouble();

            }

            System.out.print("Enter Tax as percentage %: ");
            tax = input.nextDouble();
            while(tax < 0 || tax > 100)
            {
                System.out.println("That is an invalid amount.  Please enter a percentage between 0 and 100");
                System.out.println(" Enter a positive between 0 and 100");
                tax = input.nextDouble();
            }

            total=0;

            //for (int i=1; i <=4; i=i+1)
            //{
                earnings = salaryPerHour * hours;
                earnings  = earnings - ((tax /100.0) *earnings);
                //earnings-=(tax/100.0)*earnings);
                total = total + earnings;
                //total+=earnings;
                totalEarnings+=total;

                System.out.println("You made $" + earnings);
                System.out.println("Your total is $" + totalEarnings);
                System.out.println("Do you want to run again (Y/N): ");

                again =input.next();

            //}

        }
    }

}