package ifpb.collections;

import ifpb.collections.interfaces.IAuthors;
import ifpb.entitybasic.ID;
import ifpb.entitybasic.interfaces.IAuthor;
import ifpb.entitybasic.interfaces.IID;

import java.util.ArrayList;

public class Authors implements IAuthors {
    private ArrayList<IAuthor> authors = new ArrayList<IAuthor>();


    @Override
    public void add(IAuthor author) {
        authors.add(author);
    }

    @Override
    public void remove(String matricula) {
        IID id = new ID(matricula);
        this.authors.remove(get(id));
    }

    @Override
    public IAuthor get(IID id) {
        for (IAuthor author : this.authors){
            if(author.compareKeys(id)) return author;
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
