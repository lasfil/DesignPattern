package command;

public class WriteCommand implements Command {
	private Canvas canvas;

	public WriteCommand(Canvas canvas) {
		super();
		this.canvas = canvas;
	}

	@Override
	public void execute() {
		canvas.getContent().append("W");

	}

	@Override
	public void undo() {

		canvas.getContent().setLength(canvas.getContent().length()-1);

	}

}
