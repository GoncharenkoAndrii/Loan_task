package InvestmentOptions;

public class Bank implements InvestmentOption{
    private String name ;
    private double percent;


    public double getTotalMoney(int clientMoney, int timeInYears, int percent) {
        
        double totalMoney = clientMoney*Math.pow(1+percent/100,timeInYears);
        return totalMoney;
    }

    public Bank(String name, double percent) {
        this.name = name;

        this.percent = percent;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }



    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +

                ", percent=" + percent +
                '}';
    }
}
