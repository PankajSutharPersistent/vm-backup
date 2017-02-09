

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.psl.account.Account;
import com.psl.account.InsufficientBalanceException;
import com.psl.account.NegativeAmountException;


public class AccountTest {
	private Account account;
	
	@Before
	public void init()
	{
		account=new Account(123456, "Pankaj", "Saving");
		
		
	}
	
	@Test
	public void testAcoountDeposit() throws NegativeAmountException
	{
		account.deposit(100L);
		
	}
	
	
	@Test(expected=NegativeAmountException.class)
	public void testDeposit() throws NegativeAmountException
	{
		account.deposit(100L);
	}
	
	
	@Test
	public void accountWithdrawal() throws InsufficientBalanceException
	{
		
		account.withdraw(100L);
	}
	
	
	@Test(expected=InsufficientBalanceException.class)
	public void testWithdrawal() throws InsufficientBalanceException
	{
		account.withdraw(1000L);
	}
	
	@Test
	public void testGetBalance()
	{
		long expected=-1;
		long actualresult=(long) account.getBalance();
		Assert.assertEquals(expected, actualresult);
		
		
	}

}
