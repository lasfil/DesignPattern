package builder;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppleBuilderTest {

	@Test
	public void test() {
		AppleBuilder builder = new IphoneBuilder();
		Manufacturer m = new Manufacturer();
		m.manufact(builder);
		AppleDevice d = builder.getAppleDevice();
		System.out.println(d);
	}

}
