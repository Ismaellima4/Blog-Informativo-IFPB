package ifpb.mediator.exceptions;

public class UserNotAuthorized extends Throwable {
    public UserNotAuthorized() {
        super("User not authorized");
    }
}
