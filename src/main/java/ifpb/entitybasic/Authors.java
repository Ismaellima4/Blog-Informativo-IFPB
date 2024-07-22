package ifpb.entitybasic;

import ifpb.entitybasic.interfaces.IAuthor;
import ifpb.entitybasic.interfaces.IAuthors;

import java.util.ArrayList;

public class Authors implements IAuthors {
    private ArrayList<IAuthor> authors = new ArrayList<IAuthor>();


    @Override
    public void add(IAuthor author) {
        authors.add(author);
    }

    @Override
    public void remove(String name) {
        this.authors.remove(get(name));
    }

    @Override
    public IAuthor get(String name) {
        for (IAuthor author : this.authors){
            if(author.compareKeys(name)) return author;
        }
        return null;
    }

    @Override
    public IAuthor[] get() {
        return (IAuthor[]) this.authors.toArray();
    }

    @Override
    public void update(IAuthor author) {
        this.remove(author.getName());
        this.add(author);

    }
}
