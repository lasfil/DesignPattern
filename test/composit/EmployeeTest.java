package composit;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void test() {
		Employee e1 = new TeamMember("t1");
		Employee e2 = new TeamMember("t2");
		Employee e3 = new TeamMember("t3");
		Employee e4 = new Manager("m1");
		((Manager) e4).add(e1);
		((Manager) e4).add(e2);
		((Manager) e4).add(e3);
		e4.punch();
		e4.getMember();
	}

}
