package ifpb.factorys.classes;
/**
 * A classe ControllerFactoryMemory implementa a interface IControllerFactory e é responsável
 * pela criação de instâncias de controladores, utilizando um padrão de fábrica baseado em memória.
 */
import ifpb.controllers.Controller;
import ifpb.controllers.ControllerManager;
import ifpb.controllers.interfaces.IController;
import ifpb.controllers.interfaces.IControllerManager;
import ifpb.entitybasic.interfaces.IAuthor;
import ifpb.entitycomplex.interfaces.IArticle;
import ifpb.entitycomplex.interfaces.INews;
import ifpb.factorys.interfaces.IAbstractFactory;
import ifpb.factorys.interfaces.IControllerFactory;
import ifpb.repositories.interfaces.IKeyWordsRepository;
import ifpb.repositories.interfaces.IRepository;
import ifpb.repositories.interfaces.IUserRepository;

public class ControllerFactoryMemory implements IControllerFactory {

    @Override
    public IController createController() {
        IAbstractFactory factory = new FactoryMemory();
        IRepository<IArticle> articleRepository = factory.createRespositoryArticle();
        IRepository<INews> newsRepository = factory.createRepositoryNews();
        return new Controller(newsRepository, articleRepository);
    }

    @Override
    public IControllerManager createControllerManager() {
        IAbstractFactory factory = new FactoryMemory();
        IRepository<IArticle> articleRepository = factory.createRespositoryArticle();
        IRepository<INews> newsRepository = factory.createRepositoryNews();
        IRepository<IAuthor> authorIRepository = factory.createRepositoryAuthors();
        IKeyWordsRepository keyWordsRepository = factory.createRespositoryKeyWords();
        IUserRepository userRepository = factory.createRepositoryUser();
        return new ControllerManager(newsRepository, articleRepository, keyWordsRepository, authorIRepository, userRepository);
    }
}
