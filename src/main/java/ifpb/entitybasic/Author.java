package ifpb.entitybasic;

import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IAuthor;
import ifpb.entitybasic.interfaces.IID;

import java.util.Arrays;

public class Author implements IAuthor {
    private final String name;
    private IID<String> id;

    public Author(String name, String matricula) throws InvalidNullException {
        this.name = formatName(validate(name));
        this.id = new ID<String>(matricula);
    }

    @Override
    public boolean isEmpty() {
        return this.name.trim().isEmpty();
    }

    @Override
    public boolean compareTo(IAuthor compareData) {
        return false;
    }

    @Override
    public boolean compareKeys(IID id) {
        return this.id.compareTo(id);
    }

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public IID<String> getId(){
        return this.id;
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
