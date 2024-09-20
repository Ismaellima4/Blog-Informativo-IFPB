package ifpb.controllers.interfaces;

import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.exceptions.InvalidPasswordException;
import ifpb.entitybasic.interfaces.IAuthor;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitybasic.interfaces.IKeyWord;
import ifpb.entitybasic.interfaces.IUser;
import ifpb.entitycomplex.interfaces.IArticle;
import ifpb.entitycomplex.interfaces.INews;

public interface IControllerManager extends IController {
    void signUp(IUser user) throws InvalidNullException;
    void updateUser(IID id, IUser user) throws InvalidNullException;
    void deleteUser(IID id) throws InvalidNullException;
    int signIn(String id, String password) throws InvalidNullException, InvalidPasswordException;

    void createNews(INews news);
    void deleteNews(IID id) throws InvalidNullException;
    void updateNews(IID id, INews news) throws InvalidNullException;

    void createArticle(IArticle article);
    void deleteArticle(IID id) throws InvalidNullException;
    void updateArticle(IID id, IArticle article) throws InvalidNullException;

    void addAuthor(IAuthor author);
    void removeAuthor(IID id) throws InvalidNullException;
    void updateAuthor(IID id, IAuthor author) throws InvalidNullException;
    IAuthor[] getAuthors() throws InvalidNullException;
    IAuthor getAuthorById(IID id) throws InvalidNullException;

    void addKeyWord(IKeyWord keyWord) throws InvalidNullException;
    void removeKeyWord(IKeyWord keyWord) throws InvalidNullException;
    void updateKeyWord(IKeyWord oldKeyWord, IKeyWord newKeyWord) throws InvalidNullException;
    IKeyWord[] getKeyWords(IKeyWord[] keyWords) throws InvalidNullException;
    IKeyWord getKeyWord(IKeyWord keyWord) throws InvalidNullException;
}
