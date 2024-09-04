package bank2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountTest {
    private Account account;

    @BeforeEach
    public void setUp() {
        account = new Account(100,"tolu","lope","correctPin");
        account.createAccount("correctPin");
    }

    @Test
    public void newAccountBalance() {
        assertEquals(0, account.getBalance("correctPin"));
    }

    @Test
    public void depositTwoThousandNaira() {
        account.deposit(2000);
        assertEquals(2000, account.getBalance("correctPin"));
    }

    @Test
    public void depositMinus5kToCheckBalOf2k() {
        account.deposit(2000);
        assertEquals(2000, account.getBalance("correctPin"));
        account.deposit(-5000);
        assertEquals(2000, account.getBalance("correctPin"));
    }

    @Test
    public void withdraw10KToCheckBalOf2k() {
        account.deposit(2000);
        assertEquals(2000, account.getBalance("correctPin"));
        account.withdraw(10000,"correctPin");
        assertEquals(2000, account.getBalance("correctPin"));
    }
    @Test
    public void withdraw1kToGetBalOf1k() {
        account.deposit(2000);
        assertEquals(2000, account.getBalance("correctPin"));
        account.withdraw(1000,"correctPin");
        assertEquals(1000, account.getBalance("correctPin"));
    }
    @Test
    public void withdraw2kToGetBalOf2k() {
        account.deposit(2000);
        assertEquals(2000, account.getBalance("correctPin"));
        account.withdraw(2000,"correctPin");
        assertEquals(0, account.getBalance("correctPin"));
    }
    @Test
    public void deposit20kToGetMyBalance() {
        account.deposit(20000);
        assertEquals(20000, account.getBalance("correctPin"));
    }
    @Test
    public void deposit12kAndSeeWhatMyBalanceRemains(){
        account.deposit(12000);
        assertEquals(12000, account.getBalance("correctPin"));
        account.withdraw(6000,"correctPin");
        assertEquals(6000, account.getBalance("correctPin"));
    }
    @Test
    public void testToWithdrawToWithPin(){
        account.deposit(2000);
        assertEquals(2000, account.getBalance("correctPin"));
        account.withdraw(1000, "correctPin");
        assertEquals(1000, account.getBalance("correctPin"));

    }
    @Test
    public void testToWithdrawToWithWrongPin(){
        account.deposit(2000);
        assertEquals(2000, account.getBalance("correctPin"));
        account.withdraw(1000, "wrongPin");
        assertEquals(2000, account.getBalance("correctPin"));

    }
    @Test
    public void testToChangePin(){
        account.deposit(20_000);
        assertEquals(20_000, account.getBalance("correctPin"));
        account.withdraw(10_000, "correctPin");
        assertEquals(10_000, account.getBalance("correctPin"));
        account.changePin("correctPin", "newPin");
        account.withdraw(5_000, "correctPin");
        assertEquals(10_000, account.getBalance("correctPin"));
        account.withdraw(5_000, "newPin");
        assertEquals(5_000, account.getBalance("correctPin"));
    }

}


