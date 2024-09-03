package ifpb.entitybasic.exceptions;

public class InvalidTitleInformationException extends Exception {
    public InvalidTitleInformationException(){
        super("The title must be between 5 and 60 characters long.");
    }
}
