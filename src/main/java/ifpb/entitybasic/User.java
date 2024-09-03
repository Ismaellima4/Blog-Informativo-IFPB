package ifpb.entitybasic;

import ifpb.entitybasic.interfaces.IUser;

public class User implements IUser {

    private Name name;
    private Email email;

    public User(Name name, Email email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public void changeName(String name) {
        this.name.changeName(name);
    }

    @Override
    public void changeEmail(String email) {
        this.email.changeEmail(email);
    }
}
