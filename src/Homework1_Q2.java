import java.text.NumberFormat;
import java.util.Locale;

public class Homework1_Q2 {
    public static void main(String[] args){
        /*
           JL Air Freight has decided to purchase or lease an Airbus A320 for a 20-year-long service period.
           It costs $3,300,000.00/year to lease and purchasing an Airbus A320 costs $22,000,000.50. Assume 14% annual interest.
           The program below determines which option is most economical.
        */
        //Note: Do not modify the following line of code
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);

        // ToDo: Part A - Declare the variables used (e.g. companyName) in the block comment below (add declarations between the following two single-comment dashed lines)
        //------------------------------------------------------


        //------------------------------------------------------

        // ToDo: Remove the block comment below when you are ready to test the variables you have declared.
        //Note: nothing should be changed within the following block comment.

            String companyName = "JL Air Freight";
            double purchasePrice = 22000000.50;
            double leasingCost = 3300000.00;
            double i = 0.14;
            int numYears = 20;
            boolean buyAircraft = false;
            double maxPurchaseCost = leasingCost*((1-Math.pow(1+i,-numYears))/i);
            if (purchasePrice <= maxPurchaseCost){
                buyAircraft = true;
            }
            System.out.println("Max. purchase cost for 20-year period: " + currencyFormatter.format(maxPurchaseCost));
            System.out.println("Good investment? " + buyAircraft);

        //ToDo: Part B - What if the project continues for 25 years? (Note: this section contains syntax errors that you must fix)


            buyAircraft = false; // Resets buyAircraft variable for new scenario
            numYears += 5; //Adds 5 years to numYears variable
            maxPurchaseCost = leasingCost*(1-Math.pow(1+i,-numYears))/i; //calculates the maximum acceptable purchase cost for an aircraft

        //Note: Nothing needs to be changed in the next 5 lines
            if (purchasePrice <= maxPurchaseCost){
                buyAircraft = true;
            }
            System.out.println("Max. purchase cost for 25-year period: " + currencyFormatter.format(maxPurchaseCost));
            System.out.println("Good investment? " + buyAircraft);





    }

}