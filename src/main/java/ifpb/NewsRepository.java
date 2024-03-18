package ifpb;

import java.io.InputStream;
import java.util.ArrayList;

public interface NewsRepository {
    void addNews(Header header, Authors authors, String news, InputStream anexo);
    News getNewsById(int id);
    void updateNews(int id, Header header, Authors authors, String news, InputStream anexo);
    void removeNews(int id);
    ArrayList<News> getNews();
}
