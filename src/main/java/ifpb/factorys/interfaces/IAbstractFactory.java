package ifpb.factorys.interfaces;
/**
 * A interface IAbstractFactory define um contrato para a criação de diferentes fábricas e repositórios
 * relacionados a entidades e coleções de um sistema.
 */
import ifpb.controllers.interfaces.IController;
import ifpb.controllers.interfaces.IControllerManager;
import ifpb.entitybasic.interfaces.IAuthor;
import ifpb.entitybasic.interfaces.IUser;
import ifpb.entitycomplex.interfaces.IArticle;
import ifpb.entitycomplex.interfaces.INews;
import ifpb.repositories.interfaces.IKeyWordsRepository;
import ifpb.repositories.interfaces.IRepository;
import ifpb.repositories.interfaces.IUserRepository;

public interface IAbstractFactory {
    IAuthorsFactory createAuthorsFactory();
    IKeyWorsFactory createKeyWordsFactory();
    ICollectionFactory<IArticle> createArtcileCollectionFactory();
    ICollectionFactory<INews> createNewsCollectionFactory();
    ICollectionFactory<IUser> createUsersCollectionFactory();
    IKeyWordsRepository createRespositoryKeyWords();
    IRepository<IAuthor> createRepositoryAuthors();
    IRepository<IArticle> createRespositoryArticle();
    IRepository<INews> createRepositoryNews();
    IUserRepository createRepositoryUser();
}
