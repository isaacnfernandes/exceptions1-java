package model.exceptions;

public class DomainException  extends Exception{
	//Declaração de uma class serializable
	private static final long serialVersionUID = 1L;
	
	//Essa ação permite instanciar a exceção personalizada passando
	//uma msg pra ela. A msg fica armazenada dentro da exceção.
	public DomainException(String msg) {
		super(msg);
	}

}
