import java.util.Scanner;

public class Homework1_Q3 {
    public static void main (String[] args)
    {

        /*This program prompts the user to enter four variables in order to calculate
        the required percentage increase in sales for the next year to break even on the cost of warehouse inventory.*/

        Scanner scnr = new Scanner(System.in);


        //The four variables to be entered by the user.
        double warehouseSlotFee;
        int annualUnitSales;
        double retailUnitPrice;
        double supplierMargin;

        //The variable used to output the required percentage increase.
        double requiredIncreaseSales;


        //Gathering input for each of the first four variables.
        System.out.print("Enter the Warehouse Slotting Fee: ");
        warehouseSlotFee = scnr.nextDouble();

        System.out.print("Enter the Annual Unit Sales: ");
        annualUnitSales = scnr.nextInt();

        System.out.print("Enter the Retail Unit Price: ");
        retailUnitPrice = scnr.nextDouble();

        System.out.print("Enter the Supplier's Margin as a percent: ");
        supplierMargin = scnr.nextDouble();
        supplierMargin /= 100; //To convert to decimal form to complete calculation.

        scnr.close(); //Closing the Scanner object.


        //The calculation derived from the required formulas to calculate the Required Percentage Increase in Sales.
        requiredIncreaseSales = warehouseSlotFee / (annualUnitSales * retailUnitPrice * supplierMargin);

        requiredIncreaseSales *= 100; //To change from a decimal into a percentage.


        //Printing the output with a blank line above, cutting off the decimal places, and rounding to the nearest percent.
        System.out.printf("\nThe Required Percentage Increase in Sales is %.0f%%.\n", requiredIncreaseSales);

    }
}
