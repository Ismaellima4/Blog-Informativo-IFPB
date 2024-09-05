package ifpb.entitybasic.exceptions;


/*
 * Lança a excessão se a descrição possuir menos que 15 caracters ou mais que 255.
 */
public class InvalidDescriptionInformationException extends Exception {
    public InvalidDescriptionInformationException() {
        super("The description must be between 15 and 255 characters long.");
    }
}