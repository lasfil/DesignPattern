package observer;

import java.util.Calendar;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class NewspaperObserver extends MediaObserver {

	@Override
	public void update(Observable o, Object arg) {
		super.update(o, arg);
		System.out.println("Publish new billboard ");
		Billboard b = (Billboard)o;
		for(Song s: b.getBoard()) {
			System.out.println(s.getName() + " : " + s.getPosition());
		}
	}

}
