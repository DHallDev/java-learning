# Create A Bank Account

## Problem Summary:
Create a new class for a Bank Account. We needs fields for the account characteristics like:
* account number
* account balance
* customer name
* email
* phone number

And the customer needs to be able to deposit and withdrawal funds from the account

## Rules & Constraints:
* **Can't Allow Account To Go Negative**: User should not be able to withdraw more funds then they have available in their account.
* **Encapsulation**: Just like a real account, nobody but the user should be able access/change the data in the fields.
* **Provide Information**: The user should know if the transaction was successful, and if it wasn't why not.

### Pseudocode (Instructions)
````java
CLASS Account
PRIVATE accountNumber;
PRIVATE accountBalance;
PRIVATE customerName;
PRIVATE email;
PRIVATE phoneNumber;

METHOD despositFunds(despositAmount)
    IF despositAmount less than 0
        PRINT "Invalid Amount"
        RETURN
    ADD depsoitAmount to accountBalance
    PRINT "Deposit of $" + depsitAmount + " has been successfully deposited. New balance is " + accountBalance

METHOD withdrawFunds(withdrawAmount)
    IF accountBalance - withdrawAmount is less than 0
        PRINT "Insufficient Funds! You only have $" + accountBalance
    SUBTRACT withdrawAmount from accountBalance
    PRINT "Withdrawal of $" + withdrawAmount + " successful. Remaining balance is " + accountBalance

CREATE GETTERS for accountNumber, accountBalance, customerName, email, and phoneNumber
CREATE SETTERS for accountNumber, accountBalance, customerName, email, and phoneNumber