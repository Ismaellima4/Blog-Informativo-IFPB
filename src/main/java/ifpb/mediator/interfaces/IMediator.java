package ifpb.mediator.interfaces;

import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IAuthor;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitybasic.interfaces.IKeyWord;
import ifpb.entitybasic.interfaces.IUser;
import ifpb.entitycomplex.interfaces.IArticle;
import ifpb.entitycomplex.interfaces.INews;
import ifpb.mediator.exceptions.UserNotAuthorized;

public interface IMediator {
    void createUser(IUser user) throws UserNotAuthorized;
    void updateUser(IID id, IUser user) throws UserNotAuthorized;
    void deleteUser(IID id) throws UserNotAuthorized;
    IUser getUserById(IID id) throws UserNotAuthorized;
    IUser[] getAllUser() throws UserNotAuthorized;

    void createNews(INews news) throws UserNotAuthorized;
    void deleteNews(IID id) throws UserNotAuthorized;
    void updateNews(IID id, INews news) throws UserNotAuthorized;

    void createArticle(IArticle article) throws UserNotAuthorized;
    void deleteArticle(IID id) throws UserNotAuthorized;
    void updateArticle(IID id, IArticle article) throws UserNotAuthorized;

    void addAuthor(IAuthor author) throws UserNotAuthorized;
    void removeAuthor(IID id) throws UserNotAuthorized;
    void updateAuthor(IID id, IAuthor author) throws UserNotAuthorized;
    IAuthor[] getAuthors() throws UserNotAuthorized;
    IAuthor getAuthorById(IID id) throws UserNotAuthorized;

    void addKeyWord(IKeyWord keyWord) throws InvalidNullException, UserNotAuthorized;
    void removeKeyWord(IKeyWord keyWord) throws InvalidNullException, UserNotAuthorized;
    void updateKeyWord(IKeyWord oldKeyWord, IKeyWord newKeyWord) throws InvalidNullException, UserNotAuthorized;
    IKeyWord[] getKeyWords(IKeyWord[] keyWords) throws InvalidNullException, UserNotAuthorized;
    IKeyWord getKeyWord(IKeyWord keyWord) throws InvalidNullException, UserNotAuthorized;

    INews getNewsById(IID<Integer> id);
    IArticle getArticleById(IID<Integer> id);
    INews[] getNews();
    IArticle[] getArticles();
}
