package ifpb.repositories.classes;

import ifpb.collections.interfaces.IAuthors;
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IAuthor;
import ifpb.entitybasic.interfaces.IID;
import ifpb.repositories.interfaces.IRepository;

public class AuthorsRepository implements IRepository<IAuthor> {
    private IAuthors authors;

    public AuthorsRepository(IAuthors instance){
        this.authors = instance;
    }

    @Override
    public void add(IAuthor content) {
        this.authors.add(content);

    }

    @Override
    public int remove(IID id) throws InvalidNullException {
        return this.authors.remove(id);
    }

    @Override
    public IAuthor getById(IID id) throws InvalidNullException {
        return this.authors.get(id);
    }

    @Override
    public IAuthor[] getAll() throws InvalidNullException {
        return this.authors.get();
    }

    @Override
    public int update(IID id,IAuthor content) throws InvalidNullException {
        return this.authors.update(content);
    }
}
