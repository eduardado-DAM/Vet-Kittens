package logic.service.exception;

/**
 * Excepción general que captura cualquier error en la introducción de datos por el usuario al 
 * dar de alta un nuevo gato en el panel de Alta de gatos
 * @author Eduardo
 *
 */
public class CatDataIntroducedException extends Exception {

	private static final long serialVersionUID = 3923703165286503039L;
	
	public CatDataIntroducedException() {
	}
	
	public CatDataIntroducedException(String message) {
		super(message);
	}
	
	public CatDataIntroducedException(Throwable cause) {
		super(cause);
	}
	
	public CatDataIntroducedException(String message, Throwable cause) {
		super(message,cause);
	}
	
	public CatDataIntroducedException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	

}
