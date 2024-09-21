package ifpb.factorys.classes;
/**
 * A classe FactoryMemory implementa a interface IAbstractFactory e é responsável
 * pela criação de instâncias de repositórios e fábricas relacionados a entidades
 * como autores, palavras-chave, artigos, notícias e usuários, todos em memória.
 */
import ifpb.collections.interfaces.ICollection;
import ifpb.entitybasic.interfaces.IAuthor;
import ifpb.entitybasic.interfaces.IUser;
import ifpb.entitycomplex.interfaces.IArticle;
import ifpb.entitycomplex.interfaces.INews;
import ifpb.factorys.interfaces.IAbstractFactory;
import ifpb.factorys.interfaces.IAuthorsFactory;
import ifpb.factorys.interfaces.ICollectionFactory;
import ifpb.factorys.interfaces.IKeyWorsFactory;
import ifpb.repositories.classes.*;
import ifpb.repositories.interfaces.IKeyWordsRepository;
import ifpb.repositories.interfaces.IRepository;
import ifpb.repositories.interfaces.IUserRepository;

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
    public ICollectionFactory<IUser> createUsersCollectionFactory() {
        return new CollectionUserFactory();
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

    @Override
    public IUserRepository createRepositoryUser() {
        ICollectionFactory<IUser> factory = createUsersCollectionFactory();
        return new UserRepository(factory.create());
    }
}
