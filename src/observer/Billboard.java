package observer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Observable;

public class Billboard extends Observable{
	private List<Song> board= new ArrayList<Song>();
	
	public List<Song> getBoard() {
		return board;
	}

	public void setBoard(List<Song> board) {
		this.board = board;
	}


	public void review() {
		Collections.sort(board);
		this.setChanged();
		this.notifyObservers();
		//this.notifyObservers(Calendar.getInstance());
		
	}
}
