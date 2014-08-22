package visitor.translator;

public interface Translator {
	void translate(ENDocument edoc);
	void translate(DEDocument edoc);
	void translate(CNDocument edoc);
	void translate(JPDocument edoc);

}
