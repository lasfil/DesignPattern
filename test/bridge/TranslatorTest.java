package bridge;

import static org.junit.Assert.*;

import org.junit.Test;

public class TranslatorTest {

	@Test
	public void test() {
		Translator t1 = new PhoneTranslator(new CEDictionary(),new EFDictionary());
		Translator t2 = new PCTranslator(new CEDictionary(),new EJDictionary());
		t1.translate();
		t2.translate();
	}

}
