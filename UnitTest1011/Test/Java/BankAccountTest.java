import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {
        account = new BankAccount("123ABC");

    }
//test account
//    @Test
//    public void accoundcheck(){
//        assertEquals(accountid,123ABC, );
//    }


    @Test
    public void testDepositPositiveAmount() {
        account.deposit(50);
        assertEquals("Balance should be updated after deposit", 50, account.getBalance(), 0.01);
    }

    //    testDepositeNegativeAmount
//    ammount:-50
//    expect: IllegalArgumentException
    @Test(expected = IllegalArgumentException.class)
    public void testDepositeNegativeAmount() {
        account.deposit(-50);
    }

    //    withdraw pos amount
//    balance=50
//    amount=40
//    expected balance=10
    @Test
    public void withdrawPosAmount() {
        account.deposit(50);
        assertEquals(50, account.getBalance(), 0.01);
        account.withdraw(40);
        assertEquals("balance is", 10, account.getBalance(), 0.1);
    }


//    withdraw neg amount
//    balance=??
//    amount=-40
//    expected illegalArgument..
//    @Test(expected = IllegalArgumentException)
//     public void withdrawNegativeAmount(){
//        account.withdraw();
//
//    }

    @Test
    public void testWithdrawNegativeAmount() {
        IllegalArgumentException thrown =
                assertThrows(IllegalArgumentException.class, () -> {
            //Code under test
            account.withdraw(-500);
        });

        assertEquals("Amount must be positive", thrown.getMessage());
    }
    @Test(expected = IllegalArgumentException.class)
    public void testDepositNegativeAmount() {
        account.withdraw(-100);
    }
//    withdraw amount to big
//    start balance=40
//    amount=100  < 0
//    expected illegalArgument..

    @Test (expected=IllegalArgumentException.class)
      public void withdrawToBigAmount(){
        account.deposit(40);
        account.withdraw(-100);
    }
    @Test
    public void withdrawAssToBigAmount() {

        IllegalArgumentException thrown =
                assertThrows(IllegalArgumentException.class, () -> {
                    account.deposit(40);
                    account.withdraw(100);
                });
        assertEquals("Insufficient funds", thrown.getMessage());
    }

////transfer to other bankaccount
//    zet amount:500
//    check amount
 //   chek toaccount
//     transfer:100
//    check
    @Test
    public void tranferPosAmountOtherAccount(){
        account.deposit(500);
        account.transfer("9999as",100);
        assertEquals("balance is", 10, account.getBalance(), 0.1);
        assertEquals(9999as,100, account.getBalance());


    }



}




    // more test cases
//    IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
//        calculator.divide(a, b);
//    });
//}
