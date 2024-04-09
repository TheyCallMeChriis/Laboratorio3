package Logic;

import Domain.Client;

public class SavingAccount extends Account {

    private String startDate;
    private int monthsNumber;
    private float interests;

    public SavingAccount(String startDate, int monthsNumber, float interests, String accountNumber, double balance, Client client) {
        super(accountNumber, balance, client);
        this.startDate = startDate;
        this.monthsNumber = monthsNumber;
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

    @Override
    public double interestCalculation() {
        double interestTotal = (this.getInterests() / 100.0 / 12.0)
                * this.getMonthsNumber()
                * super.getBalance();

        return interestTotal;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getMonthsNumber() {
        return monthsNumber;
    }

    public void setMonthsNumber(int monthsNumber) {
        this.monthsNumber = monthsNumber;
    }

    public float getInterests() {
        return interests;
    }

    public void setInterests(float interests) {
        this.interests = interests;
    }

    public String toString() {
        String result = "\nACCOUNT TYPE: SAVING ACCOUNT"
                + "\nSaving Start Date: " + this.getStartDate()
                + "\nMonths: " + this.getMonthsNumber()
                + "\nInterest: " + this.getInterests() + "%"
                + "\nInterest you got: "
                + (this.getMonthsNumber()
                + super.getBalance()
                + this.getInterests()
                / 100)
                + "\nStart Date + Interest Won: " + this.interestCalculation();
        return super.toString() + result;
    }

}
