package ifpb.entitybasic;

import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IAuthor;
import ifpb.entitybasic.interfaces.IBasicEntity;

import java.util.Arrays;

public class Author implements IAuthor, IBasicEntity<Author> {
    private final String name;

    public Author(String name) throws InvalidNullException {
        this.name = formatName(validate(name));
        ID id = new ID(name);
    }

    @Override
    public boolean isEmpty() {
        return this.name.trim().isEmpty();
    }

    @Override
    public boolean compareTo(Author compareData) {
        return this.name.equals(compareData.name);
    }

    private String formatName(String name){
        return Arrays.stream(name.split(" ")).map((word -> word.substring(0,1).toUpperCase().concat(word.substring(1).toLowerCase()))).toString();
    }
    private String validate(String name) throws InvalidNullException {
        if(name == null){
            throw new InvalidNullException();
        }
        return name;
    }
}
