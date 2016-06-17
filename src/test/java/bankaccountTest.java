package bankaccount;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import bankaccount.BankAccount;

import org.junit.Test;

public class bankaccountTest {
		private BankAccount account;
		@Test
		public void testDeposit() {
			account.deposit(100);
			assertTrue("Test Deposit", 1100 == account.getBalance());
		}
		@Before
		public void init() {
			account = new BankAccount();
			account.deposit(1000);
		}
		@Test 
		public void testWithdraw() {
			account.withdraw(500);
			assertTrue("Test Withdraw", 500 == account.getBalance());
		}
		@Test(expected=RuntimeException.class)
		public void testNegativeWithdraw() throws Exception{
			account.withdraw(20000);
		}
		@Test(timeout=1000)
		public void timeout() throws Exception{
			Thread.sleep(2000);
			account.deposit(2000);
		}
}
