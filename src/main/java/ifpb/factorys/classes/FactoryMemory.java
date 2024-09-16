package ifpb.factorys.classes;

import ifpb.entitybasic.interfaces.IAuthor;
import ifpb.factorys.interfaces.IAbstractFactory;
import ifpb.factorys.interfaces.IAuthorsFactory;
import ifpb.factorys.interfaces.IKeyWorsFactory;
import ifpb.repositories.classes.AuthorsRepository;
import ifpb.repositories.classes.KeyWordsRepository;
import ifpb.repositories.interfaces.IKeyWordsRepository;
import ifpb.repositories.interfaces.IRepository;

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
        IKeyWorsFactory factory = createKeyWordsFactory();
        return new KeyWordsRepository(factory.create());
    }

    @Override
    public IRepository<IAuthor> createRepositoryAuthors() {
        IAuthorsFactory factory = createAuthorsFactory();
        return new AuthorsRepository(factory.create());
    }
}
