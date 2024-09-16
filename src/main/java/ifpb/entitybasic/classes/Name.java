package ifpb.entitybasic.classes;

import ifpb.entitybasic.exceptions.InvalidNameException;
import ifpb.entitybasic.interfaces.IName;

import java.util.Arrays;

public class Name implements IName {
    private String name;

    public Name(String name) {
        this.name = validateName(name);
    }

    @Override
    public void changeName(String newName) {
        this.name = validateName(newName);
    }
    @Override
    public String getName() {
        return name;
    }

    private String validateName(String name){
        if (name == null || name.isEmpty()){
            throw new InvalidNameException();
        }
        return formatName(name);
    }

    private String formatName(String name){
        return Arrays.stream(name.split(" ")).map((word -> word.substring(0,1).toUpperCase().concat(word.substring(1).toLowerCase()))).toString();
    }
}
