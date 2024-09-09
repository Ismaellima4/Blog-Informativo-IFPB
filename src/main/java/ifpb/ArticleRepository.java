package ifpb;

import ifpb.collections.interfaces.IAuthors;
<<<<<<< HEAD
import ifpb.collections.interfaces.IKeyWords;
=======
import ifpb.collections.interfaces.IHeader;
>>>>>>> f2ac7668201f4047ab6cb6536aaec5993916a21c

import java.io.InputStream;
import java.util.ArrayList;

public interface ArticleRepository {
<<<<<<< HEAD
    void addArticle(Header header, IKeyWords keyWords, ifpb.collections.interfaces.IAuthors.IAuthors authors, InputStream article);
    Article getArticleById(int id);
    void updateArticle(int id, Header header, IKeyWords keyWords, IAuthors.IAuthors authors, InputStream article);
=======
    void addArticle(IHeader header, KeyWords keyWords, IAuthors authors, InputStream article);
    Article getArticleById(int id);
    void updateArticle(int id, IHeader header, KeyWords keyWords, IAuthors authors, InputStream article);
>>>>>>> f2ac7668201f4047ab6cb6536aaec5993916a21c
    void removeArticle(int id);
    ArrayList<Article> getArticles();
}
