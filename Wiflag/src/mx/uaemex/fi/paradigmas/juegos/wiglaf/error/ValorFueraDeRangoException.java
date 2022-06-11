package mx.uaemex.fi.paradigmas.juegos.wiglaf.error;

public class ValorFueraDeRangoException extends Exception {

	public ValorFueraDeRangoException() {
		super();
	}

	public ValorFueraDeRangoException(String message) {
		super(message);
	}

	public ValorFueraDeRangoException(Throwable cause) {
		super(cause);
	}

	public ValorFueraDeRangoException(String message, Throwable cause) {
		super(message, cause);
	}

	public ValorFueraDeRangoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
