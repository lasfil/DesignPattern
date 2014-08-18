package observer;

public class Song implements Comparable<Song> {
	private String name;

	public Song(String name, int position) {
		super();
		this.name = name;
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int position;

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	@Override
	public int compareTo(Song o) {

		return new Integer(position).compareTo(new Integer(o.getPosition()));
	}
}
