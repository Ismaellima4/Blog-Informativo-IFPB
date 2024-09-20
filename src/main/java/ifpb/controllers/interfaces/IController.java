package ifpb.controllers.interfaces;

import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitycomplex.interfaces.IArticle;
import ifpb.entitycomplex.interfaces.INews;

import java.util.List;

public interface IController {
    INews getNewsById(IID<Integer> id) throws InvalidNullException;
    IArticle getArticleById(IID<Integer> id) throws InvalidNullException;
    INews[] getNews() throws InvalidNullException;
    IArticle[] getArticles() throws InvalidNullException;
}
