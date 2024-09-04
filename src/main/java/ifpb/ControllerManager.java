package ifpb;

import ifpb.collections.interfaces.IAuthors;
import ifpb.entitycomplex.interfaces.IHeader;

import java.io.InputStream;

public interface ControllerManager extends Controller {
    void addNews(IHeader header, IAuthors authors, String news, InputStream anexo);
    void updateNews(int id, IHeader header, IAuthors authors, String news, InputStream anexo);
    void removeNews(int id);
    void addArticle(IHeader header, KeyWords keyWords, IAuthors authors, InputStream article);
    void updateArticle(int id, IHeader header, KeyWords keyWords, IAuthors authors, InputStream article);
    void removeArticle(int id);
    String singIn(String email,String pasword);
    String signUp(String name,String email,String password,String username);
    void removeUser(int id);
    boolean update(int id, String name, String email, String password,String username);
}
