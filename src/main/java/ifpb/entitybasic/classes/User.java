package ifpb.entitybasic.classes;

import ifpb.entitybasic.interfaces.IEmail;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitybasic.interfaces.IName;
import ifpb.entitybasic.interfaces.IUser;

public class User implements IUser {

    private IName name;
    private IEmail email;
    private IID<String> username;
    private String password;

    public User(IID<String> username, IName name, IEmail email, String password) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
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
    public IID getUsername() {
        return username;
    }

    @Override
    public void changePassword(String newPassword) {
        this.password = newPassword;
    }

    @Override
    public boolean verifyPassword(String password) {
        return this.password.equals(password);
    }

    @Override
    public boolean compareId(IID id) {
        return username.compareTo(id);
    }
}
