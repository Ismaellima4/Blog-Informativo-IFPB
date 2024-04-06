package ifpb.entitybasic.exceptions;

public class InvalidDescriptionInformationException extends Exception {
    public InvalidDescriptionInformationException() {
        super("The description must be between 15 and 255 characters long.");
    }
}
