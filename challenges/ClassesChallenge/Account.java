public class Account {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void depositFunds(double depositAmount) {
        if (depositAmount < 0) {
            System.out.println("Invalid amount.");
            return;
        }
        this.accountBalance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " has been successfully deposited. " +
                "New balance is $" + this.accountBalance);
    }

    public void withdrawFunds(double withdrawalAmount) {
        if (this.accountBalance - withdrawalAmount < 0) {
            System.out.println("Insufficient funds! You only have $" + this.accountBalance);
            return;
        }
        this.accountBalance -= withdrawalAmount;
        System.out.println("Withdrawal of $" + withdrawalAmount +
                " processed, Remaining balance is $" + this.accountBalance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
