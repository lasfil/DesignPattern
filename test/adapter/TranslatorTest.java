package adapter;
import org.junit.*;
public class TranslatorTest {
@Test
public void test() {
	Translator t = new CJTranslator();
	System.out.println(t.translate());
	Translator t1 = new CETranslator();
	System.out.println(t1.translate());
}
}
