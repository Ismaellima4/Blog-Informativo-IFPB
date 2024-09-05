package ifpb;

import ifpb.collections.interfaces.IAuthors;

import java.io.InputStream;
import java.util.ArrayList;

public interface ArticleRepository {
    void addArticle(Header header, KeyWords keyWords, ifpb.collections.interfaces.IAuthors.IAuthors authors, InputStream article);
    Article getArticleById(int id);
    void updateArticle(int id, Header header, KeyWords keyWords, IAuthors.IAuthors authors, InputStream article);
    void removeArticle(int id);
    ArrayList<Article> getArticles();
}