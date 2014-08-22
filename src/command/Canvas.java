package command;

public class Canvas {
	//private Brush b;
	StringBuffer content=new StringBuffer();
	
	
	public StringBuffer getContent() {
		return content;
	}

	public void display() {
		System.out.println(content.toString());
	}

}
