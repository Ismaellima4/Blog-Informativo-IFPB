package ifpb.entitybasic.exceptions;
/*
 * Exceção lançada quando o valor fornecido é nulo
 */
public class InvalidNullException extends Throwable {
    public InvalidNullException() {
        System.out.println("Valor não pode ser nulo");
    }
}
