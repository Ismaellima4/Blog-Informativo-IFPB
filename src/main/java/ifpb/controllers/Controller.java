package ifpb.controllers;
/**
 * A classe Controller implementa a interface IController e atua como um
 * intermediário entre os repositórios de notícias e artigos, facilitando
 * a recuperação de dados.
 *
 * Princípios Aplicados:
 *
 * - Single Responsibility Principle (SRP):
 *   A classe Controller é responsável apenas por gerenciar a lógica de
 *   controle e interação entre os repositórios de notícias e artigos.
 *
 * - Liskov Substitution Principle (LSP):
 *   A classe Controller pode ser substituída por qualquer outra implementação
 *   de IController sem afetar a funcionalidade do sistema.
 *
 * - Open/Closed Principle (OCP):
 *   A classe Controller está aberta para extensão, permitindo que novas
 *   funcionalidades sejam adicionadas sem modificar o código existente.
 *
 * - Dependency Inversion Principle (DIP):
 *   A classe depende de abstrações (IRepository), não de implementações concretas.
 */
import ifpb.controllers.interfaces.IController;
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitycomplex.interfaces.IArticle;
import ifpb.entitycomplex.interfaces.INews;
import ifpb.repositories.interfaces.IRepository;

public class Controller implements IController {
    private final IRepository<INews> newsRepository;
    private final IRepository<IArticle> articleRepository;

    public Controller(IRepository<INews> newsRepository, IRepository<IArticle>  articleRepository) {
        this.newsRepository = newsRepository;
        this.articleRepository = articleRepository;
    }

    @Override
    public INews getNewsById(IID<Integer> id) throws InvalidNullException {
        return this.newsRepository.getById(id);
    }

    @Override
    public IArticle getArticleById(IID<Integer> id) throws InvalidNullException {
        return this.articleRepository.getById(id);
    }

    @Override
    public INews[] getNews() throws InvalidNullException {
        return this.newsRepository.getAll();
    }

    @Override
    public IArticle[] getArticles() throws InvalidNullException {
        return this.articleRepository.getAll();
    }
}
