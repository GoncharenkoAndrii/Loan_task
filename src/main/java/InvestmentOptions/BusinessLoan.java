package InvestmentOptions;

public class BusinessLoan implements InvestmentOption {
    private int yearProcent;
    private static final int NUMBER_OF_INTERMEDIATE_PERIODS = 12;
    private int numberOfYears;
    private int paymentSumm;

    public int getYearProcent() {
        return yearProcent;
    }

    public void setYearProcent(int yearProcent) {
        this.yearProcent = yearProcent;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public int getPaymentSumm() {
        return paymentSumm;
    }

    public void setPaymentSumm(int paymentSumm) {
        this.paymentSumm = paymentSumm;
    }

    public BusinessLoan(int paymentSumm, int yearProcent, int numberOfYears) {
        this.yearProcent = yearProcent;
        this.numberOfYears = numberOfYears;
        this.paymentSumm = paymentSumm;
    }

    private int countNumberOfPayments(int numOfYears) {
        return numOfYears * NUMBER_OF_INTERMEDIATE_PERIODS;
    }

    private double countPeriodicInterestRate(int yearPercent) {
        return (yearPercent / 100.0 / NUMBER_OF_INTERMEDIATE_PERIODS);

    }

    private double countDiscountFactor(double periodicInterestRate, int numberOfPayments) {
        double expression1 = ((Math.pow((1 + periodicInterestRate), numberOfPayments)) - 1);
        double expression2 = (periodicInterestRate * Math.pow((1 + periodicInterestRate), numberOfPayments));
        double result = expression1 / expression2;
        return result;
    }

    public double getMonthlyPayment (int initialSumm, int yearPercents, int numOfYears){

        int numOfPay = countNumberOfPayments(numOfYears);

        double periodicInterestRate = countPeriodicInterestRate(yearPercents);

        double discountFactor = countDiscountFactor(periodicInterestRate,numOfPay);


        double result = initialSumm/discountFactor ;

        return result ;
    }

    public double getTotalMoney(int startMoney, int timeInYears, int percent) {
        double res = getMonthlyPayment(startMoney,percent,timeInYears)* countNumberOfPayments(timeInYears) ;
        return  res;
    }
    public double getMoneyAfterSomeMonth(int startMoney, int yearPercents, int timeInYears,int numOfMonth){
        double money = getMonthlyPayment(startMoney,yearPercents,timeInYears)*numOfMonth ;
        return money;
    }
}
