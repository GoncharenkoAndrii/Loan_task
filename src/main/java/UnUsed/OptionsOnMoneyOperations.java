package UnUsed;

public enum OptionsOnMoneyOperations {
    PUTTOBANK(1.5, 10),
    LENDTOBUSINESS(5, 20);

    private final double percent ; // percent to calculate profits
    private final int periodOfTime ; // period You want to conclude a contract for
    // initialize the general form of an operation
    // it includes percent and period of a contract as parameters
    OptionsOnMoneyOperations(double percent,int periodOfTime){
        this.percent = percent ;
        this.periodOfTime = periodOfTime ;
    }
    double calculateProfits(double percent, int timeInYears){
        return 0;
    }
    double getMoney (int startMoney, double percent){
        return 0 ;
    }

}
