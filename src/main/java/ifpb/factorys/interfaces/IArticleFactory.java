package ifpb.factorys.interfaces;

import ifpb.entitycomplex.interfaces.IArticle;

import java.io.InputStream;

public interface IArticleFactory {
    IArticle create(String id, String title, String description, String[] authors , String[] keyWords, InputStream article) throws Throwable;
}
