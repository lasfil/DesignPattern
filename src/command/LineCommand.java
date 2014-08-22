package command;

public class LineCommand implements Command {
	private Canvas canvas;

	public LineCommand(Canvas canvas) {
		super();
		this.canvas = canvas;
	}

	@Override
	public void execute() {
		canvas.getContent().append("L");

	}

	@Override
	public void undo() {

		canvas.getContent().setLength(canvas.getContent().length()-1);
	}

}
