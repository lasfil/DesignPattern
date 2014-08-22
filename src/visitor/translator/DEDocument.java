package visitor.translator;

public class DEDocument implements Document {

	@Override
	public void accept(Translator t) {
		t.translate(this);
		
	}

}
