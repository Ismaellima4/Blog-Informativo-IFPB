package ifpb.collections.classes;

import ifpb.collections.interfaces.IAuthors;
import ifpb.entitybasic.exceptions.InvalidNullException;
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
    public int remove(IID matricula) throws InvalidNullException {
        IAuthor author = get(matricula);
        if (author != null) {
            this.authors.remove(author);
            return 1;
        }
        return 0;
    }

    @Override
    public IAuthor get(IID id) throws InvalidNullException {
        for (IAuthor author : this.authors){
            if(author.compareKeys(id)) return author;
        }
        throw new InvalidNullException();
    }

    @Override
    public IAuthor[] get() throws InvalidNullException {
        if (authors.isEmpty()) throw new InvalidNullException();
        IAuthor[] authorArray = new IAuthor[this.authors.size()];
        for (int i = 0; i < authorArray.length; i++) {
            authorArray[i] = this.authors.get(i);
        }
        return authorArray;
    }

    @Override
    public int update(IAuthor author) throws InvalidNullException {
        int value = this.remove(author.getId());
        if (value == 0){
            return 0;
        }
        this.add(author);
        return 1;
    }

    @Override
    public int getSize() {
        return this.authors.size();
    }
}
