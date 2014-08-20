package composit;

public class TeamMember implements Employee {
	private String name;

	public TeamMember(String name) {
		super();
		this.name = name;
	}

	@Override
	public void getName() {
		System.out.println("name is " + name);
	}

	@Override
	public void getMember() {
		System.out.println("there is no member for teammember");
	}

	@Override
	public void punch() {
		System.out.println("team member punch at 8:00");
	}

}
