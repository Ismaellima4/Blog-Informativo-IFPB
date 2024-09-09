package ifpb.factorys.classes;

import ifpb.factorys.interfaces.IAbstractFactory;
import ifpb.factorys.interfaces.IAuthorsFactory;
import ifpb.factorys.interfaces.IKeyWorsFactory;
import ifpb.repositorys.classes.AuthorsRepository;
import ifpb.repositorys.classes.KeyWordsRepository;
import ifpb.repositorys.interfaces.IAuthorsRepository;
import ifpb.repositorys.interfaces.IKeyWordsRepository;

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
    public IKeyWordsRepository createRespositoryKeyWords() {
        return new KeyWordsRepository();
    }

    @Override
    public IAuthorsRepository createRepositoryAuthors() {
        return new AuthorsRepository();
    }
}
