package observer;

import java.util.Calendar;
import java.util.Observable;
import java.util.Observer;

public abstract class MediaObserver implements Observer {
	@Override
	public void update(Observable o, Object arg) {
		if (null != arg) {
			Calendar c = (Calendar) arg;
			System.out.println("Update date: " + c.getTime());
		}
	}

}
