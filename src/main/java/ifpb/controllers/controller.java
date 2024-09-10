package ifpb.controllers;

import ifpb.Article;
import ifpb.controllers.interfaces.IController;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitycomplex.interfaces.INews;
import ifpb.repositories.interfaces.IRepository;

import java.util.List;

public class controller implements IController {
    private final IRepository<INews> newsRepository;
    private final IRepository<Article> articleRepository;

    public controller(IRepository<INews> newsRepository, IRepository<Article>  articleRepository) {
        this.newsRepository = newsRepository;
        this.articleRepository = articleRepository;
    }

    @Override
    public INews getNewsById(IID<Integer> id) {
        return this.newsRepository.getById(id);
    }

    @Override
    public Article getArticleById(IID<Integer> id) {
        return this.articleRepository.getById(id);
    }

    @Override
    public List<INews> getNews() {
        return this.newsRepository.getAll();
    }

    @Override
    public List<Article> getArticles() {
        return this.articleRepository.getAll();
    }
}
