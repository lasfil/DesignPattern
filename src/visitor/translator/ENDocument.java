package visitor.translator;

public class ENDocument implements Document{

	@Override
	public void accept(Translator t) {
		t.translate(this);
		
	}

}
