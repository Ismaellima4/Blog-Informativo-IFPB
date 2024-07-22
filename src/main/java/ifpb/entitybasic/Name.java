package ifpb.entitybasic;

import ifpb.entitybasic.exceptions.InvalidNameException;
import ifpb.entitybasic.interfaces.IName;

public class Name implements IName {
    private String name;

    public Name(String name) {
        this.name = validateName(name);
    }

    @Override
    public void changeName(String newName) {
        this.name = validateName(newName);
    }

    private String validateName(String name){
        if (name == null || name.isEmpty()){
            throw new InvalidNameException();
        }
        return name;
    }
}
