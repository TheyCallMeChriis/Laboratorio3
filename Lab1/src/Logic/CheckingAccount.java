package Logic;

import Domain.Client;

public class CheckingAccount extends Account {

    private float interests;

    public CheckingAccount(float interests, String accountNumber, double balance, Client client) {
        super(accountNumber, balance, client);
        this.interests = interests;
    }

    public float getInterests() {
        return interests;
    }

    public void setInterests(float interests) {
        this.interests = interests;
    }

    @Override
    public void deposit(double amount) {
        super.setBalance(interestCalculation() + amount);
    }

    @Override
    public void withdraw(double amount) {
        super.setBalance(interestCalculation() - amount);
    }

    public double interestCalculation() {
        double interestTotal = (super.getBalance() * this.getInterests()) / 12.0;
        return interestTotal;
    }

    @Override
    public String toString() {
        String result = "\nACCOUNT TYPE: CHECKING ACCOUNT"
                + "\nInterest Rate: " + this.getInterests() + "%"
                + "\nCurrent Balance: " + super.getBalance()
                + "\nInterest Earned: " + this.interestCalculation()
                + "\nTotal Balance: " + (super.getBalance() + this.interestCalculation());

        return super.toString() + result;
    }
}
