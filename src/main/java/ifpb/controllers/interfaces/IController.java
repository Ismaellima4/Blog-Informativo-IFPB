package ifpb.controllers.interfaces;

import ifpb.Article;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitycomplex.interfaces.INews;

import java.util.List;

public interface IController {
    INews getNewsById(IID<Integer> id);
    Article getArticleById(IID<Integer> id);
    List<INews> getNews();
    List<Article> getArticles();
}
