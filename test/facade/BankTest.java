package facade;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankTest {

	@Test
	public void test() {
		Bank b = new Bank();
		b.all();
	}

}
