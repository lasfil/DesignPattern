package decorator;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComputerTest {

	@Test
	public void test() {
		Computer apple = new Apple();
		apple.funcList();
		
		DellDecorator dell= new DellDecorator(apple);
		dell.funcList();
		
		IBMDecorator ibm = new IBMDecorator(dell);
		ibm.funcList();
	}

}
