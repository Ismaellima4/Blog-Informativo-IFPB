package ifpb.entitybasic.exceptions;

public class InvalidNullException extends Throwable {
    public InvalidNullException() {
        System.out.println("Valor não pode ser nulo");
    }
}
