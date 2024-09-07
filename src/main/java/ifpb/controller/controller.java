package ifpb.controller;

import ifpb.Article;
import ifpb.ArticleRepository;
import ifpb.controller.interfaces.IController;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitycomplex.interfaces.INews;
import ifpb.repositories.interfaces.INewsRepository;

import java.util.ArrayList;

public class controller implements IController {
    private final INewsRepository newsRepository;
    private final ArticleRepository articleRepository;

    public controller(INewsRepository newsRepository, ArticleRepository articleRepository) {
        this.newsRepository = newsRepository;
        this.articleRepository = articleRepository;
    }

    @Override
    public INews getNewsById(IID<Integer> id) {
        return newsRepository.getNewsById(id);
    }

    @Override
    public Article getArticleById(IID<Integer> id) {
        return null;
    }

    @Override
    public ArrayList<INews> getNews() {
        return this.newsRepository.getNews();
    }

    @Override
    public ArrayList<Article> getArticles() {
        return null;
    }
}
