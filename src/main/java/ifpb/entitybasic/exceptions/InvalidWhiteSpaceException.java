package ifpb.entitybasic.exceptions;

/**
 * Exceção lançada quando um espaço em branco inválido é detectado em uma entrada.
 */

public class InvalidWhiteSpaceException extends Exception {
    public InvalidWhiteSpaceException() {
        super("Invalid White Space");
    }

}