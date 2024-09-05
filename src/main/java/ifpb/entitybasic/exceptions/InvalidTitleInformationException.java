package ifpb.entitybasic.exceptions;

/**
 * Exceção lançada quando o título fornecido não atende aos critérios de tamanho.
*/

public class InvalidTitleInformationException extends Exception {
    public InvalidTitleInformationException(){
        super("The title must be between 5 and 60 characters long.");
    }
}