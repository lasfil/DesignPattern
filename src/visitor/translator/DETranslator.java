package visitor.translator;

public class DETranslator implements Translator
{

	@Override
	public void translate(ENDocument edoc) {
		System.out.println("Can't translate English");
		
	}

	@Override
	public void translate(DEDocument edoc) {
		System.out.println(" translate German");
		
	}

	@Override
	public void translate(CNDocument edoc) {
		System.out.println("Can't translate Chinese");
		
	}

	@Override
	public void translate(JPDocument edoc) {
		System.out.println("translate Japanese");
		
	}

}
