package ifpb.factorys.classes;

import ifpb.factorys.interfaces.IAbstractFactory;
import ifpb.factorys.interfaces.IAuthorsFactory;
import ifpb.factorys.interfaces.IKeyWorsFactory;
import ifpb.repositorys.classes.RepositoryAuthors;
import ifpb.repositorys.classes.RepositoryKeyWords;
import ifpb.repositorys.interfaces.IRepositoryAuthors;
import ifpb.repositorys.interfaces.IRepositoryKeyWords;

public class FactoryMemory implements IAbstractFactory {
    @Override
    public IAuthorsFactory createAuthorsFactory() {
        return new AuthorsFactory();
    }

    @Override
    public IKeyWorsFactory createKeyWordsFactory() {
        return new KeyWordsFactory();
    }

    @Override
    public IRepositoryKeyWords createRespositoryKeyWords() {
        return new RepositoryKeyWords();
    }

    @Override
    public IRepositoryAuthors createRepositoryAuthors() {
        return new RepositoryAuthors();
    }
}
