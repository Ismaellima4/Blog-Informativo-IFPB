package ifpb.controllers.interfaces;

import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IAuthor;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitybasic.interfaces.IKeyWord;
import ifpb.entitybasic.interfaces.IUser;
import ifpb.entitycomplex.interfaces.IArticle;
import ifpb.entitycomplex.interfaces.INews;

public interface IControllerManager extends IController {
    void createUser(IUser user);
    void updateUser(IID id, IUser user);
    void deleteUser(IID id);
    IUser getUserById(IID id);
    IUser[] getAllUser();

    void createNews(INews news);
    void deleteNews(IID id);
    void updateNews(IID id, INews news);

    void createArticle(IArticle article);
    void deleteArticle(IID id);
    void updateArticle(IID id, IArticle article);

    void addAuthor(IAuthor author);
    void removeAuthor(IID id);
    void updateAuthor(IID id, IAuthor author);
    IAuthor[] getAuthors();
    IAuthor getAuthorById(IID id);

    void addKeyWord(IKeyWord keyWord) throws InvalidNullException;
    void removeKeyWord(IKeyWord keyWord) throws InvalidNullException;
    void updateKeyWord(IKeyWord oldKeyWord, IKeyWord newKeyWord) throws InvalidNullException;
    IKeyWord[] getKeyWords(IKeyWord[] keyWords) throws InvalidNullException;
    IKeyWord getKeyWord(IKeyWord keyWord) throws InvalidNullException;
}
