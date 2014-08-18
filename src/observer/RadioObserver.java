package observer;

import java.util.Observable;
import java.util.Observer;

public class RadioObserver extends MediaObserver {

	@Override
	public void update(Observable o, Object arg) {
		super.update(o, arg);
		Billboard b = (Billboard) o;
		System.out.println("Play new billboard: " + b.getBoard().get(0).getName());
	}

}
