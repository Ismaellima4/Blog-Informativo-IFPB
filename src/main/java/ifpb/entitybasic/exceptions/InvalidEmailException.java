package ifpb.entitybasic.exceptions;

/*
 * Lança excessão se o e-mail fornecido for inválido.
 */

public class InvalidEmailException extends RuntimeException {
    public InvalidEmailException() {
        super("Invalid Email");
    }
}