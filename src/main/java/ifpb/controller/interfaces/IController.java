package ifpb.controller.interfaces;

import ifpb.Article;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitycomplex.interfaces.INews;

import java.util.ArrayList;

public interface IController {
    INews getNewsById(IID<Integer> id);
    Article getArticleById(IID<Integer> id);
    ArrayList<INews> getNews();
    ArrayList<Article> getArticles();
}
