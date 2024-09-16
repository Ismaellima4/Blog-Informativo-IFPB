package ifpb.controllers.interfaces;

import ifpb.entitybasic.interfaces.IID;
import ifpb.entitycomplex.interfaces.IArticle;
import ifpb.entitycomplex.interfaces.INews;

import java.util.List;

public interface IController {
    INews getNewsById(IID<Integer> id);
    IArticle getArticleById(IID<Integer> id);
    INews[] getNews();
    IArticle[] getArticles();
}
