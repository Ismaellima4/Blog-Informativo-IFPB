package ifpb.factorys.classes;

import ifpb.collections.Authors;
import ifpb.collections.interfaces.IAuthors;
import ifpb.entitybasic.ID;
import ifpb.entitybasic.interfaces.IAuthor;
import ifpb.entitybasic.interfaces.IID;
import ifpb.factorys.interfaces.IAuthorsFactory;
import ifpb.factorys.interfaces.IFactoryAuthor;

public class AuthorsFactory implements IAuthorsFactory {
    private IAuthors authors;
    private static AuthorsFactory instance;
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

    @Override
    public void create() {
        this.authors = new Authors();
    }

    public static AuthorsFactory getInstance() {
        if (instance == null) {
            instance = new AuthorsFactory();
        }
        return instance;
    }
}
