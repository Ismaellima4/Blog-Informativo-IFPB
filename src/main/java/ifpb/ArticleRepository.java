package ifpb;

import ifpb.collections.interfaces.IAuthors;
import ifpb.entitycomplex.interfaces.IHeader;

import java.io.InputStream;
import java.util.ArrayList;

public interface ArticleRepository {
    void addArticle(IHeader header, KeyWords keyWords, IAuthors authors, InputStream article);
    Article getArticleById(int id);
    void updateArticle(int id, IHeader header, KeyWords keyWords, IAuthors authors, InputStream article);
    void removeArticle(int id);
    ArrayList<Article> getArticles();
}
