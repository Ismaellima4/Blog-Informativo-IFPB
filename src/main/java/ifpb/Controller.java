package ifpb;

import java.util.ArrayList;

public interface Controller {
    News getNewsById(int id);
    Article getArticleById(int id);
    ArrayList<News> getNews();
    ArrayList<Article> getArticles();
}
