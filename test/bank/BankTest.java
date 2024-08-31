package bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    @Test
    public void testToCreateAnAccount(){
        Bank bank = new Bank();
        bank.createAccounts("firstName","lastName","1122");
        assertEquals(1,bank.getTotalAccounts());
    }
    @Test
    public void testToCreateMultipleAccounts(){
        Bank bank = new Bank();
        bank.createAccounts("firstName","lastName","1122");
        bank.createAccounts("ayo","mide","1111");
        bank.createAccounts("ayo","ola","1111");
        bank.createAccounts("ayo","tunde","1111");
        assertEquals(4,bank.getTotalAccounts());
    }
    @Test
    public void testToDepositInTheAccount(){
        Bank bank = new Bank();
        bank.createAccounts("ayo","mide","1111");
        bank.deposit("1",5000);
        assertEquals(5000,bank.getBalance("1","1122"));

    }

}
