package ifpb.collections;

import ifpb.collections.interfaces.IAuthors;
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
    public int remove(IID matricula) {
        IAuthor author = get(matricula);
        if (author != null) {
            this.authors.remove(author);
            return 1;
        }
        return 0;
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
    public int update(IAuthor author) {
        int value = this.remove(author.getId());
        if (value == 0){
            return 0;
        }
        this.add(author);
        return 1;
    }
}
