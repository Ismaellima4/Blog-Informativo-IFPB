package ifpb.entitybasic.exceptions;

public class InvalidEmailException extends RuntimeException {
    public InvalidEmailException() {
        super("Invalid Email");
    }
}
