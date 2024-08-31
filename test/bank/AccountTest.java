package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {

    private Account account;

    @BeforeEach
    public void setUp(){
        account = new Account("accountNumber","firstName","lastName","pin");
    }


    @Test
    public void newAccount_balanceIsZeroTest(){
        assertEquals(0,account.getBalance("correct pin"));
    }

    @Test
    public void newAccount_depositTest(){
        account.deposit(5000);
        assertEquals(5000,account.getBalance("correct pin"));
    }
    @Test
    public void testToDepositTwice(){
        account.deposit(5000);
        assertEquals(5000,account.getBalance("correct pin"));
        account.deposit(2000);
        assertEquals(7000,account.getBalance("correct pin"));
    }
    @Test
    public void testToDepositNegativeAmount(){
        account.deposit(-5000);
        assertEquals(0,account.getBalance("correct pin"));

    }
    @Test
    public void testToWithDraw2K_From5k(){
        int amount = 5000;
        account.deposit(amount);
        assertEquals(5000,account.getBalance("correct pin"));
        int amountWithdraw = 2000;
        account.withdraw(amountWithdraw,"correct pin");
        assertEquals(3000,account.getBalance("correct pin"));

    }
    @Test
    public void testToWithdrawNegative(){
        account.deposit(5000);
        assertEquals(5000,account.getBalance("correct pin"));
        account.withdraw(-2000,"correct pin");
        assertEquals(5000,account.getBalance("correct pin"));

    }
    @Test
    public void testToWithdrawTheActualAmountInTheAccount(){
        account.deposit(5000);
        assertEquals(5000,account.getBalance("correct pin"));
        account.withdraw(5000,"correct pin");
        assertEquals(0,account.getBalance("correct pin"));
    }

    @Test
    public void testToWithDrawFromAnEmptyBalance(){
        assertEquals(0,account.getBalance("correct pin"));
        account.withdraw(5000,"correct pin");
        assertEquals(0,account.getBalance("correct pin"));
    }
    @Test
    public void testToWithDrawAndTwice(){
        account.deposit(5000);
        assertEquals(5000, account.getBalance("correct pin"));
        account.withdraw(3000,"correct pin");
        assertEquals(2000, account.getBalance("correct pin"));
        account.withdraw(5000,"correct pin");
        assertEquals(2000, account.getBalance("correct pin"));

    }
    @Test
    public void testToWithDrawWithWrongPassword(){
        account.deposit(5000);
        assertEquals(5000, account.getBalance("correct pin"));
        account.withdraw(3000,"wrong pin");
        assertEquals(5000, account.getBalance("correct pin"));
    }


}
