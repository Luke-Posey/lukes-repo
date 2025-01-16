public abstract class bankAccount {

    private int money;

    public void deposit(int amount) {
        if (amount > 1000) {
            System.out.println("You can't deposit more than 1000");
            System.out.print(getBalance());
        }
        else{
            money += amount;
            System.out.print(getBalance());
        }

    }

    public void withdraw(int amount) {

    }

    public int getBalance() {
        return money;
    }

    public void setBalance(int newBalance) {

    }
}
