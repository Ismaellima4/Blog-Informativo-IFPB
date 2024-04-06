package ifpb.entitybasic.exceptions;

public class InvalidPasswordException extends Exception{
    public InvalidPasswordException(){
        super("Password validation failed. " +
                "Please ensure your password is at least 8 characters long " +
                "and includes at least one special character, " +
                "one number, and one letter.");
    }
}
