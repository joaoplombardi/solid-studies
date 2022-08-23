package br.com.alura.rh.exception;

public class ValidateException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ValidateException(String message) {
		super(message);
	}

}
