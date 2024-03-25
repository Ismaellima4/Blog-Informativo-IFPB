package ifpb.entitybasic;

import ifpb.entitybasic.interfaces.IAuthor;

import java.util.Arrays;

public class Author implements IAuthor {
    public ID<Integer> id;
    public String name;

    public Author(String name, Integer id){
        this.name = formatName(name);
        this.id = new ID<>(id);
    }
    public String formatName(String name){
        return Arrays.stream(name.split(" ")).map((word -> word.substring(0,1).toUpperCase().concat(word.substring(1).toLowerCase()))).toString();
    }
}
