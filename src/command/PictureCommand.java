package command;

public class PictureCommand implements Command {
	private Canvas canvas;

	public PictureCommand(Canvas canvas) {
		super();
		this.canvas = canvas;
	}

	@Override
	public void execute() {
		canvas.getContent().append("P");

	}

	@Override
	public void undo() {

		canvas.getContent().setLength(canvas.getContent().length()-1);
	}

}
