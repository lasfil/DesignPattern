package observer;

import static org.junit.Assert.*;

import org.junit.Test;

public class BillboardTest {

	@Test
	public void test() {
		Billboard b = new Billboard();
		b.addObserver(new NewspaperObserver());
		b.addObserver(new RadioObserver());
		Song[] songlist = new Song[]{new Song("a",1), new Song("b", 2), new Song("c",3)};
		for(Song s: songlist)
		b.getBoard().add(s);

		b.review();
		
	}

}
