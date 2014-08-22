package command;

import static org.junit.Assert.*;

import org.junit.Test;

public class CanvasTest {

	@Test
	public void test() {
		Canvas c = new Canvas();
		Brush brush = new Brush();
		Command wc = new WriteCommand(c);
		Command lc = new LineCommand(c);
		Command pc = new PictureCommand(c);
		brush.addCmd(wc).addCmd(lc).addCmd(wc).addCmd(pc).addCmd(pc).addCmd(lc).addCmd(wc).addCmd(pc);
		brush.draw();
		c.display();
		brush.undo();
		brush.undo();
		brush.undo();
		c.display();
		
	}

}
