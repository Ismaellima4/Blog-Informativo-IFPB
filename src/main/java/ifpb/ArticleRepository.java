package ifpb;

import ifpb.collections.interfaces.IAuthors;
import ifpb.collections.interfaces.IKeyWords;

import java.io.InputStream;
import java.util.ArrayList;

public interface ArticleRepository {
    void addArticle(Header header, IKeyWords keyWords, ifpb.collections.interfaces.IAuthors.IAuthors authors, InputStream article);
    Article getArticleById(int id);
    void updateArticle(int id, Header header, IKeyWords keyWords, IAuthors.IAuthors authors, InputStream article);
    void removeArticle(int id);
    ArrayList<Article> getArticles();
}
