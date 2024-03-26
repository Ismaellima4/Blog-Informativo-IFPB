package ifpb;

import ifpb.collections.interfaces.IAuthors;

import java.io.InputStream;
import java.util.ArrayList;

public interface NewsRepository {
    void addNews(Header header, IAuthors authors, String news, InputStream anexo);
    News getNewsById(int id);
    void updateNews(int id, Header header, IAuthors authors, String news, InputStream anexo);
    void removeNews(int id);
    ArrayList<News> getNews();
}
