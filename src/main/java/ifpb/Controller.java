package ifpb;

import ifpb.entitycomplex.interfaces.INews;

import java.util.ArrayList;

public interface Controller {
    INews getNewsById(int id);
    Article getArticleById(int id);
    ArrayList<INews> getNews();
    ArrayList<Article> getArticles();
}
