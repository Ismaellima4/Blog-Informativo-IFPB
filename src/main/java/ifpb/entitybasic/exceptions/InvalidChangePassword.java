package ifpb.entitybasic.exceptions;

public class InvalidChangePassword extends Exception {
    public InvalidChangePassword() {
        super("The new password cannot be the same as the previous password.");
    }
}
