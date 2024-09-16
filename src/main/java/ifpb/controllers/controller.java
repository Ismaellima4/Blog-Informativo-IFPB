package ifpb.controllers;

import ifpb.controllers.interfaces.IController;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitycomplex.interfaces.IArticle;
import ifpb.entitycomplex.interfaces.INews;
import ifpb.repositories.interfaces.IRepository;

import java.util.List;

public class controller implements IController {
    private final IRepository<INews> newsRepository;
    private final IRepository<IArticle> articleRepository;

    public controller(IRepository<INews> newsRepository, IRepository<IArticle>  articleRepository) {
        this.newsRepository = newsRepository;
        this.articleRepository = articleRepository;
    }

    @Override
    public INews getNewsById(IID<Integer> id) {
        return this.newsRepository.getById(id);
    }

    @Override
    public IArticle getArticleById(IID<Integer> id) {
        return this.articleRepository.getById(id);
    }

    @Override
    public INews[] getNews() {
        return this.newsRepository.getAll();
    }

    @Override
    public IArticle[] getArticles() {
        return this.articleRepository.getAll();
    }
}
