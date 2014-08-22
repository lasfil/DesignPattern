package visitor;

import static org.junit.Assert.*;

import org.junit.Test;

import visitor.translator.CNDocument;
import visitor.translator.CNTranslator;
import visitor.translator.Document;
import visitor.translator.*;

public class DocumentTest {

	@Test
	public void test() {
		Document cn = new CNDocument();
		Document de = new DEDocument();
		Translator cnT = new CNTranslator();
		cn.accept(cnT);
		de.accept(cnT);
	}

}
