package ifpb;

import ifpb.collections.interfaces.IAuthors;
import ifpb.entitybasic.interfaces.IHeader;
import ifpb.entitycomplex.interfaces.INews;

import java.io.InputStream;
import java.util.ArrayList;

public interface NewsRepository {
    void addNews(IHeader header, IAuthors authors, String news, InputStream anexo);
    INews getNewsById(int id);
    void updateNews(int id, IHeader header, IAuthors authors, String news, InputStream anexo);
    void removeNews(int id);
    ArrayList<INews> getNews();
}
