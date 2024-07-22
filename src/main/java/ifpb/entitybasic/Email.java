package ifpb.entitybasic;

import ifpb.entitybasic.exceptions.InvalidEmailException;
import ifpb.entitybasic.interfaces.IEmail;

public class Email implements IEmail {
    private String email;

    public Email(String email){
        this.email = validateEmail(email);
    }

    @Override
    public void changeEmail(String newEmail) {
        this.email = validateEmail(newEmail);
    }

    private String validateEmail(String email){
        if (email == null || email.isEmpty()){
            throw new InvalidEmailException();
        }
        return email;
    }
}
