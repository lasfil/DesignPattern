package visitor.translator;

public class JPDocument implements Document{

	@Override
	public void accept(Translator t) {
		t.translate(this);
		
	}

}
