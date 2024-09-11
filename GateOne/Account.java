package GateOne;

class Account {
    String firstName;
    String lastName;
    String pin;
    int accountNumber;
    double balance;

    public Account(String firstName, String lastName, String pin, int accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public boolean isPin(String pin) {
        return this.pin.equals(pin);
    }

    public void changePin(String newPin) {
        this.pin = newPin;
    }
    public String toString() {
        return String.format("Account Number: %d, Name: %s %s, Balance: %.2f",
                accountNumber, firstName, lastName, balance);
    }


}