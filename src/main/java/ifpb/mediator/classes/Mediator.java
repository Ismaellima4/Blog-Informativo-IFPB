package ifpb.mediator.classes;

import ifpb.controllers.interfaces.IControllerManager;
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IAuthor;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitybasic.interfaces.IKeyWord;
import ifpb.entitybasic.interfaces.IUser;
import ifpb.entitycomplex.interfaces.IArticle;
import ifpb.entitycomplex.interfaces.INews;
import ifpb.mediator.exceptions.UserNotAuthorized;
import ifpb.mediator.interfaces.IMediator;

public class Mediator implements IMediator {
    private final Boolean isAuthorized;
    private final IControllerManager controllerManager;

    public Mediator(Boolean isAuthorized, IControllerManager controllerManager) {
        this.controllerManager = controllerManager;
        this.isAuthorized = isAuthorized;
    }


    @Override
    public void createUser(IUser user) throws UserNotAuthorized {
        isAuthorized();
        this.controllerManager.createUser(user);
    }

    @Override
    public void updateUser(IID id, IUser user) throws UserNotAuthorized {
        isAuthorized();
        this.controllerManager.updateUser(id, user);
    }

    @Override
    public void deleteUser(IID id) throws UserNotAuthorized {
        isAuthorized();
        this.controllerManager.deleteUser(id);
    }

    @Override
    public IUser getUserById(IID id) throws UserNotAuthorized {
        isAuthorized();
        return this.controllerManager.getUserById(id);
    }

    @Override
    public IUser[] getAllUser() throws UserNotAuthorized {
        isAuthorized();
        return this.controllerManager.getAllUser();
    }

    @Override
    public void createNews(INews news) throws UserNotAuthorized {
        isAuthorized();
        this.controllerManager.createNews(news);
    }

    @Override
    public void deleteNews(IID id) throws UserNotAuthorized {
        isAuthorized();
        this.controllerManager.deleteNews(id);
    }

    @Override
    public void updateNews(IID id, INews news) throws UserNotAuthorized {
        isAuthorized();
        this.controllerManager.updateNews(id, news);
    }

    @Override
    public void createArticle(IArticle article) throws UserNotAuthorized {
        isAuthorized();
        this.controllerManager.createArticle(article);
    }

    @Override
    public void deleteArticle(IID id) throws UserNotAuthorized {
        isAuthorized();
        this.controllerManager.deleteArticle(id);
    }

    @Override
    public void updateArticle(IID id, IArticle article) throws UserNotAuthorized {
        isAuthorized();
        this.controllerManager.updateArticle(id, article);
    }

    @Override
    public void addAuthor(IAuthor author) throws UserNotAuthorized {
        isAuthorized();
        this.controllerManager.addAuthor(author);
    }

    @Override
    public void removeAuthor(IID id) throws UserNotAuthorized {
        isAuthorized();
        this.controllerManager.removeAuthor(id);
    }

    @Override
    public void updateAuthor(IID id, IAuthor author) throws UserNotAuthorized {
        isAuthorized();
        this.controllerManager.updateAuthor(id, author);
    }

    @Override
    public IAuthor[] getAuthors() throws UserNotAuthorized {
        isAuthorized();
        return this.controllerManager.getAuthors();
    }

    @Override
    public IAuthor getAuthorById(IID id) throws UserNotAuthorized {
        isAuthorized();
        return this.controllerManager.getAuthorById(id);
    }

    @Override
    public void addKeyWord(IKeyWord keyWord) throws InvalidNullException, UserNotAuthorized {
        isAuthorized();
        this.controllerManager.addKeyWord(keyWord);
    }

    @Override
    public void removeKeyWord(IKeyWord keyWord) throws InvalidNullException, UserNotAuthorized {
        isAuthorized();
        this.controllerManager.removeKeyWord(keyWord);
    }

    @Override
    public void updateKeyWord(IKeyWord oldKeyWord, IKeyWord newKeyWord) throws InvalidNullException, UserNotAuthorized {
        isAuthorized();
        this.controllerManager.updateKeyWord(oldKeyWord, newKeyWord);
    }

    @Override
    public IKeyWord[] getKeyWords(IKeyWord[] keyWords) throws InvalidNullException, UserNotAuthorized {
        isAuthorized();
        return this.controllerManager.getKeyWords(keyWords);
    }

    @Override
    public IKeyWord getKeyWord(IKeyWord keyWord) throws InvalidNullException, UserNotAuthorized {
        isAuthorized();
        return this.controllerManager.getKeyWord(keyWord);
    }

    @Override
    public INews getNewsById(IID<Integer> id) {
        return this.controllerManager.getNewsById(id);
    }

    @Override
    public IArticle getArticleById(IID<Integer> id) {
        return this.controllerManager.getArticleById(id);
    }

    @Override
    public INews[] getNews() {
        return this.controllerManager.getNews();
    }

    @Override
    public IArticle[] getArticles() {
        return this.controllerManager.getArticles();
    }

    private void isAuthorized() throws UserNotAuthorized {
        if (!isAuthorized) throw new UserNotAuthorized();
    }
}
