package ifpb;

import ifpb.collections.interfaces.IAuthors;
<<<<<<< HEAD
import ifpb.collections.interfaces.IKeyWords;
=======
import ifpb.entitybasic.interfaces.IHeader;
>>>>>>> f2ac7668201f4047ab6cb6536aaec5993916a21c

import java.io.InputStream;

public interface ControllerManager extends Controller {
    void addNews(IHeader header, IAuthors authors, String news, InputStream anexo);
    void updateNews(int id, IHeader header, IAuthors authors, String news, InputStream anexo);
    void removeNews(int id);
<<<<<<< HEAD
    void addArticle(Header header, IKeyWords keyWords, IAuthors authors, InputStream article);
    void updateArticle(int id, Header header, IKeyWords keyWords, IAuthors authors, InputStream article);
=======
    void addArticle(IHeader header, KeyWords keyWords, IAuthors authors, InputStream article);
    void updateArticle(int id, IHeader header, KeyWords keyWords, IAuthors authors, InputStream article);
>>>>>>> f2ac7668201f4047ab6cb6536aaec5993916a21c
    void removeArticle(int id);
    String singIn(String email,String pasword);
    String signUp(String name,String email,String password,String username);
    void removeUser(int id);
    boolean update(int id, String name, String email, String password,String username);
}
