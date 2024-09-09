package ifpb.repositorys.classes;

import ifpb.collections.interfaces.IAuthors;
import ifpb.entitybasic.ID;
import ifpb.entitybasic.interfaces.IAuthor;
import ifpb.entitybasic.interfaces.IID;
import ifpb.factorys.classes.AuthorsFactory;
import ifpb.factorys.classes.FactoryAuthor;
import ifpb.factorys.interfaces.IFactoryAuthor;
import ifpb.repositorys.interfaces.IAuthorsRepository;

public class AuthorsRepository implements IAuthorsRepository {
    private IAuthors authors = new AuthorsFactory().create();

    @Override
    public void add(String matricula, String name) {
        IFactoryAuthor factoryAuthor = new FactoryAuthor();
        this.authors.add(factoryAuthor.create(matricula, name));

    }

    @Override
    public int remove(String matricula) {
        IID<String> id = new ID<>(matricula);
        return this.authors.remove(id);
    }

    @Override
    public IAuthor get(String matricula) {
        IID<String> id = new ID<>(matricula);
        return this.authors.get(id);
    }

    @Override
    public IAuthor[] get() {
        return this.authors.get();
    }

    @Override
    public int update(String id, String name) {
        IFactoryAuthor factoryAuthor = new FactoryAuthor();
        return this.authors.update(factoryAuthor.create(id, name));
    }
}
