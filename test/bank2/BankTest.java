package bank2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    private Bank bank;

    @BeforeEach
    public void setUp() {
        bank = new Bank();
    }
    @Test
    public void testToCreateAnAccount() {
        bank.createAccount("david","ojo","correctPin");
        assertEquals(1,bank.getCountOfAccounts());
    }
    @Test
    public void testToCreate2Accounts() {
        bank.createAccount("david","ojo","correctPin");
        bank.createAccount("tolu","lope","newPin");
        assertEquals(2,bank.getCountOfAccounts());
    }
    @Test
    public void testToDepositInTheAccount() {
        bank.createAccount("david","ojo","correctPin");
        bank.deposit(1, 5000);
        assertEquals(5000,bank.checkBalance(1));
    }
    @Test
    public void testToDepositTwiceInTheAccount() {
        bank.createAccount("david","ojo","correctPin");
        bank.deposit(1, 5000);
        bank.deposit(1, 5000);
        assertEquals(10_000,bank.checkBalance(1));
    }
    @Test
    public void testToDeposit5K_Withdraw2k_InTheAccount() {
        bank.createAccount("david","ojo","correctPin");
        bank.deposit(1, 5000);
        assertEquals(5_000,bank.checkBalance(1));
        bank.withdraw(1,2000,"correctPin");
        assertEquals(3_000,bank.checkBalance(1));
    }
    @Test
    public void testToDeposit5K_Withdraw5k_InTheAccount() {
        bank.createAccount("david","ojo","correctPin");
        bank.deposit(1, 5000);
        assertEquals(5_000,bank.checkBalance(1));
        bank.withdraw(1,5000,"correctPin");
        assertEquals(0,bank.checkBalance(1));
    }
    @Test
    public void testToCheckBalance(){
        bank.createAccount("david","ojo","correctPin");
        bank.deposit(1, 5000);
        assertEquals(5000,bank.checkBalance(1));
    }
    @Test
    public void testToTransferToAnotherAccount(){
        bank.createAccount("david","ojo","correctPin");
        bank.createAccount("tolu","lope","newPin");
        bank.deposit(1, 12_000);
        assertEquals(12_000,bank.checkBalance(1));
        bank.transfer(1,2,5000,"correctPin");
        assertEquals(7000,bank.checkBalance(1));
        assertEquals(5000,bank.checkBalance(2));
    }
    @Test
    public void testToUpdatePin(){
        bank.createAccount("david","ojo","correctPin");
        bank.deposit(1, 5000);
        assertEquals(5000,bank.checkBalance(1));
        bank.checkPin(1,"correctPin","newPin");
        bank.withdraw(1,2000,"correctPin");
        assertEquals(5000,bank.checkBalance(1));
        bank.withdraw(1,2000,"newPin");
        assertEquals(3000,bank.checkBalance(1));
    }
    @Test
    public void testToRemoveAccount(){
        bank.createAccount("david","ojo","correctPin");
        assertEquals(0,bank.checkBalance(1));
        bank.closeAccount(1,"correctPin");
        assertEquals(true,bank.closedAccount(1));
    }
}
