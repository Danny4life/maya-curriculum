package Sriza.unitTesting.classActivity2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testGetBalance() {
        BankAccount account = new BankAccount(100);
        assertEquals(100, account.getBalance(), "Initial balance should be 100");
    }



    @Test
    void testGetDeposit() {
        BankAccount account = new BankAccount(50);
        account.deposit(50);
        assertEquals(100, account.getBalance(), "After depositing 50, balance should be 100");
    }

    @Test
    void withdraw() {
        BankAccount account = new BankAccount(100);
        account.withdraw(40);
        assertEquals(60, account.getBalance(), "After withdrawing 40, balance should be 60");
    }

    @Test
    void testWithdrawMoreThanBalance() {
        BankAccount account = new BankAccount(30);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(50));
        assertEquals("Insufficient funds", exception.getMessage());
    }

    @Test
    void testDepositNegativeAmount() {
        BankAccount account = new BankAccount(100);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.deposit(-10));
        assertEquals("Deposit amount must be positive", exception.getMessage());
    }

    @Test
    void testWithdrawNegativeAmount() {
        BankAccount account = new BankAccount(100);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(-20));
        assertEquals("Withdrawal amount must be positive", exception.getMessage());
    }

    @Test
    void testInitialNegativeBalance() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new BankAccount(-100));
        assertEquals("Initial balance cannot be negative", exception.getMessage());
    }

    /**
     * Test Case	Description
     * testInitialBalance()	-> Ensures the balance is set correctly at initialization.
     * testDeposit()	-> Checks if deposits add correctly to the balance.
     * testWithdraw()	-> Ensures withdrawals deduct from balance correctly.
     * testWithdrawMoreThanBalance()	-> Verifies withdrawal of more than balance throws an error.
     * testDepositNegativeAmount()	-> Ensures deposits with negative values are not allowed.
     * testWithdrawNegativeAmount()	-> Ensures withdrawals with negative values are not allowed.
     * testInitialNegativeBalance()	-> Checks that an account cannot be created with a negative balance.
     */
}