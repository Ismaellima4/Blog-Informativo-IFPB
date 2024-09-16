package ifpb.factorys.classes;

import ifpb.entitybasic.interfaces.IAuthor;
import ifpb.entitycomplex.interfaces.IArticle;
import ifpb.entitycomplex.interfaces.INews;
import ifpb.factorys.interfaces.IAbstractFactory;
import ifpb.factorys.interfaces.IAuthorsFactory;
import ifpb.factorys.interfaces.ICollectionFactory;
import ifpb.factorys.interfaces.IKeyWorsFactory;
import ifpb.repositories.classes.ArticleRepository;
import ifpb.repositories.classes.AuthorsRepository;
import ifpb.repositories.classes.KeyWordsRepository;
import ifpb.repositories.classes.NewsRepository;
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
    public ICollectionFactory<IArticle> createArtcileCollectionFactory() {
        return new ArticleCollectionFactory();
    }

    @Override
    public ICollectionFactory<INews> createNewsCollectionFactory() {
        return new NewsCollectionFactory();
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

    @Override
    public IRepository<IArticle> createRespositoryArticle() {
        ICollectionFactory<IArticle> factory = createArtcileCollectionFactory();
        return new ArticleRepository(factory.create());
    }

    @Override
    public IRepository<INews> createRepositoryNews() {
        ICollectionFactory<INews> factory = createNewsCollectionFactory();
        return new NewsRepository(factory.create());
    }
}
