package ifpb.classes;

import ifpb.Email;

public class ClassUser implements ifpb.User {
    private ClassName name;
    private ClassEmail email;

    public ClassUser(ClassName name, ClassEmail email) {
        this.name = name;
        this.email = email;
    }

    public ClassName getName() {
        return this.name;
    }

    @Override
    public void setName(ifpb.Name name) {

    }

    public void setName(ClassName name) {
        this.name = name;
    }

    public Email getEmail() {
        return (Email) this.email;
    }

    @Override
    public void setEmail(ifpb.Email email) {

    }

    public void setEmail(ClassEmail email) {
        this.email = email;
    }
}
