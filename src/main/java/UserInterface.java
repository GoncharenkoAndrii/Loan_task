import DateParsing.DateParser;
import InvestmentOptions.BusinessLoan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInterface {
    public static void main(String[] args) {
        // CONTRACT INPUT BLOCK
        System.out.println("Input the initial sum You want to loan  : ");
        int summ = Integer.parseInt(getString());
        if (summ <= 0){
            System.out.println("Incorrect input");
            return;
        }
        System.out.println("Input the duration of contract in years : ");
        int years = Integer.parseInt(getString());
        if (years <= 0){
            System.out.println("Incorrect input");
            return;
        }
        System.out.println("Input the interest rate (INTEGER)  : ");
        int percent = Integer.parseInt(getString());
        if (percent <= 0){
            System.out.println("Incorrect input");
            return;
        }
        // THE END OF CONTRACT INPUT BLOCK

        // dates input block
        DateParser dateParser = new DateParser();
        String[] dates = dateParser.inputDates();
        int monthCount = dateParser.outputTheDifferenceBetweenDates(dates);

        // the end of dates input block


        // LOGIC BLOCK
        BusinessLoan businessLoan = new BusinessLoan(summ, percent, years);


        System.out.println("-----");
        System.out.println("The monthly income according to Your contract is -" + businessLoan.getMonthlyPayment(businessLoan.getPaymentSumm(),
                businessLoan.getYearProcent(),
                businessLoan.getNumberOfYears()));
        System.out.println("-----");
        System.out.println("Total money You will get at the contract expiration - " + businessLoan.getTotalMoney(businessLoan.getPaymentSumm(),businessLoan.getNumberOfYears(),businessLoan.getYearProcent()));
        System.out.println("-----");
        System.out.println("The money You will get between Agreement  date : " + dates[0] +
                " and Calculation date : " + dates[1] +
                " is -" + businessLoan.getMoneyAfterSomeMonth(businessLoan.getPaymentSumm(),businessLoan.getYearProcent(),businessLoan.getNumberOfYears(),monthCount));
        System.out.println("-----");
        // THE END OF LOGIC BLOCK
    }



    public static String getString(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String maybe = "";
        try {

            maybe = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return maybe ;
    }
}
