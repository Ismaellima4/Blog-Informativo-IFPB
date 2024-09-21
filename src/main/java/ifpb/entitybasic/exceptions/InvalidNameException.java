package ifpb.entitybasic.exceptions;
/*
 * Lança excessão se o nome fornecido for inválido.
 */
public class InvalidNameException extends RuntimeException {
    public InvalidNameException() {
        super("Invalid name");
    }
}
