package logic.service.exception;
/** Controla caso en el que no se puede conectar a la base de datos.
 * 
 * @author Eduardo
 *
 */
public class AccessDeniedException extends Exception{
	
	public  final String TITLE_ERROR = "Login Failed";
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1556661269433737711L;

	/*
	 *  1) Herencia de Exception
	 *  2) Generamos constructores a partir de la superclase
	 */


	public AccessDeniedException() {
		super();
	}

	public AccessDeniedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public AccessDeniedException(String message, Throwable cause) {
		super(message, cause);
	}

	public AccessDeniedException(String message) {
		super(message);
	}

	public AccessDeniedException(Throwable cause) {
		super(cause);
	}
	
	
	
	

}
