package ifpb.controllers;

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
