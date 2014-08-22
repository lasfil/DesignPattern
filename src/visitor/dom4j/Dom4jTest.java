package visitor.dom4j;

import java.io.File;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.VisitorSupport;
import org.dom4j.io.SAXReader;

public class Dom4jTest {

	public static void main(String[] args) throws Exception {

		SAXReader saxReader = new SAXReader();
		File file = new File(System.getProperty("user.dir")
				+ "/src/visitor/dom4j/test.xml");
		try {
			Document doc = saxReader.read(file);
			doc.accept(new MyVisitor());
		} catch (DocumentException de) {
			de.printStackTrace();
		}

	}

}
