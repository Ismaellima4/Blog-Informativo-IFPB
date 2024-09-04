package ifpb;

import ifpb.collections.interfaces.IAuthors;
import ifpb.collections.interfaces.IKeyWords;

import java.io.InputStream;

public interface ControllerManager extends Controller {
    void addNews(Header header, IAuthors authors, String news, InputStream anexo);
    void updateNews(int id, Header header, IAuthors authors, String news, InputStream anexo);
    void removeNews(int id);
    void addArticle(Header header, IKeyWords keyWords, IAuthors authors, InputStream article);
    void updateArticle(int id, Header header, IKeyWords keyWords, IAuthors authors, InputStream article);
    void removeArticle(int id);
    String singIn(String email,String pasword);
    String signUp(String name,String email,String password,String username);
    void removeUser(int id);
    boolean update(int id, String name, String email, String password,String username);
}
