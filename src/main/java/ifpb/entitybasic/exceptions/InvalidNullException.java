package ifpb.entitybasic.exceptions;

/*
 * Exceção lançada quando o valor fornecido é nulo 
 */

public class InvalidNullException extends Throwable {
    public InvalidNullException() {
        System.out.println("Valeu can't be null.");
    }
}