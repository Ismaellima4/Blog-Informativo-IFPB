package ifpb.factorys.interfaces;

import ifpb.entitybasic.interfaces.IAuthor;
import ifpb.entitycomplex.interfaces.IArticle;
import ifpb.entitycomplex.interfaces.INews;
import ifpb.repositories.interfaces.IKeyWordsRepository;
import ifpb.repositories.interfaces.IRepository;

public interface IAbstractFactory {
    IAuthorsFactory createAuthorsFactory();
    IKeyWorsFactory createKeyWordsFactory();
    ICollectionFactory<IArticle> createArtcileCollectionFactory();
    ICollectionFactory<INews> createNewsCollectionFactory();
    IKeyWordsRepository createRespositoryKeyWords();
    IRepository<IAuthor> createRepositoryAuthors();
    IRepository<IArticle> createRespositoryArticle();
    IRepository<INews> createRepositoryNews();

}
