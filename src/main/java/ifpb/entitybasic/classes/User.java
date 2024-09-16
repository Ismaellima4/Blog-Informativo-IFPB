package ifpb.entitybasic.classes;

import ifpb.entitybasic.interfaces.IEmail;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitybasic.interfaces.IName;
import ifpb.entitybasic.interfaces.IUser;

public class User implements IUser {

    private IName name;
    private IEmail email;
    private IID<String> username;

    public User(IID<String> username, IName name, IEmail email) {
        this.name = name;
        this.email = email;
        this.username = username;
    }

    @Override
    public void changeName(String name) {
        this.name.changeName(name);
    }

    @Override
    public void changeEmail(String email) {
        this.email.changeEmail(email);
    }
    @Override
    public String getUsername() {
        return username.getId();
    }
}
