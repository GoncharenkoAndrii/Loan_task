package UnUsed.Person;

public class Client implements Person {
    private String name;
    private int moneyOnAccount;


    public String getName() {

        return this.name;
    }

    public int getMoneyOnAccount() {
        return this.moneyOnAccount;
    }
    // constructor for person
    // includes name and money on account as parameters
    // we postulate, that money on account are the money client may spend
    public Client(String name, int money){
        this.moneyOnAccount = money ;
        this.name = name ;
    }

    public boolean equals(Person other) {
        boolean flag = false;
        if (other instanceof Client) {
            if ((this.getName() == other.getName()) && (this.getMoneyOnAccount() == ((Client) other).getMoneyOnAccount())) {
                flag = true ;
                return flag ;
            }
        }
        return flag;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", moneyOnAccount=" + moneyOnAccount +
                '}';
    }
}
