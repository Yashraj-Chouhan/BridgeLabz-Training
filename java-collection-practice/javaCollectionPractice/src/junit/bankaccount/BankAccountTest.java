package junit.bankaccount;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    void testDepositIncreasesBalance() {
        BankAccount account = new BankAccount();

        account.deposit(500);

        assertEquals(500, account.getBalance());
    }

    @Test
    void testWithdrawDecreasesBalance() {
        BankAccount account = new BankAccount();
        account.deposit(1000);

        account.withdraw(400);

        assertEquals(600, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount();
        account.deposit(300);

        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(500);
        });
    }

    @Test
    void testMultipleTransactions() {
        BankAccount account = new BankAccount();

        account.deposit(1000);
        account.withdraw(200);
        account.deposit(300);

        assertEquals(1100, account.getBalance());
    }
}
