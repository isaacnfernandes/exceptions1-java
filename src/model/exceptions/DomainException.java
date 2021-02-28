package model.exceptions;

public class DomainException  extends Exception{
	//Declara��o de uma class serializable
	private static final long serialVersionUID = 1L;
	
	//Essa a��o permite instanciar a exce��o personalizada passando
	//uma msg pra ela. A msg fica armazenada dentro da exce��o.
	public DomainException(String msg) {
		super(msg);
	}

}
