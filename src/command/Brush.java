package command;

import java.util.Stack;

public class Brush {
	Stack<Command> cmds = new Stack<Command>();
	public void draw() {
		for(Command c : cmds) {
			c.execute();
		}
	}
	
	public void undo() {
		Command c = cmds.pop();
		c.undo();
	}
	
	public Brush addCmd(Command c) {
		cmds.push(c);
		return this;
	}

}
