package composit;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
	private String name;
	private List<Employee> members;

	public Manager(String name) {
		super();
		this.name = name;
		members = new ArrayList<Employee>();
	}

	public void add(Employee member) {
		members.add(member);
	}

	@Override
	public void getName() {
		System.out.println("name is " + name);
	}

	@Override
	public void getMember() {
		for (Employee e : members)
			e.getName();
	}
	
	@Override
	public void punch() {
		System.out.println("manager punch at 6:00");
	}


}
