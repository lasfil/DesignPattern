package visitor.translator;

public class CNDocument implements Document{

	@Override
	public void accept(Translator t) {
		t.translate(this);
		
	}

}
