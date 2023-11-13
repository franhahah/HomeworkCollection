import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {
        account = new BankAccount("123ABC");
    }

    @Test
    public void testDepositPositiveAmount() {
        account.deposit(500);
        assertEquals("Balance should be updated after deposit", 500, account.getBalance(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDepositNegativeAmount() {
        account.deposit(-100);

    }

    @Test(expected = IllegalArgumentException.class)
    public void WithdrawnegativeBallance(){
        account.withdraw (50);
        //this.balance=200.00;
        assertEquals("nn", account.getBalance(), 0.01);

    }


    // more test cases
}
