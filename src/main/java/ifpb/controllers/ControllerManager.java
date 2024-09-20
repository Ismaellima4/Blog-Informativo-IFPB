package ifpb.controllers;

import ifpb.controllers.interfaces.IControllerManager;
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.exceptions.InvalidPasswordException;
import ifpb.entitybasic.interfaces.IAuthor;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitybasic.interfaces.IKeyWord;
import ifpb.entitybasic.interfaces.IUser;
import ifpb.entitycomplex.interfaces.IArticle;
import ifpb.entitycomplex.interfaces.INews;
import ifpb.repositories.interfaces.IKeyWordsRepository;
import ifpb.repositories.interfaces.IRepository;
import ifpb.repositories.interfaces.IUserRepository;

public class ControllerManager implements IControllerManager {

    private final IRepository<INews> newsRepository;
    private final IRepository<IArticle> articleRepository;
    private final IKeyWordsRepository keyWordsRepository;
    private final IRepository<IAuthor> authorRepository;
    private final IUserRepository userRepository;

    public ControllerManager(IRepository<INews> newsRepository, IRepository<IArticle>  articleRepository, IKeyWordsRepository keyWordsRepository, IRepository<IAuthor> authorIRepository, IUserRepository userRepository) {
        this.newsRepository = newsRepository;
        this.articleRepository = articleRepository;
        this.keyWordsRepository = keyWordsRepository;
        this.authorRepository = authorIRepository;
        this.userRepository = userRepository;
    }


    @Override
    public void signUp(IUser user) throws InvalidNullException {
        this.userRepository.signUp(user);
    }

    @Override
    public void updateUser(IID id, IUser user) throws InvalidNullException {
        this.userRepository.updateUser(id, user);
    }

    @Override
    public void deleteUser(IID id) throws InvalidNullException {
        this.userRepository.removeUser(id);
    }

    @Override
    public int signIn(String id,String password) throws InvalidNullException, InvalidPasswordException {
        return this.userRepository.signIn(id,password);
    }

    @Override
    public void createNews(INews news) {
        this.newsRepository.add(news);
    }

    @Override
    public void deleteNews(IID id) throws InvalidNullException {
        this.newsRepository.remove(id);
    }

    @Override
    public void updateNews(IID id, INews news) throws InvalidNullException {
        this.newsRepository.update(id, news);
    }

    @Override
    public void createArticle(IArticle article) {
        this.articleRepository.add(article);
    }

    @Override
    public void deleteArticle(IID id) throws InvalidNullException {
        this.articleRepository.remove(id);
    }

    @Override
    public void updateArticle(IID id, IArticle article) throws InvalidNullException {
        this.articleRepository.update(id, article);
    }

    @Override
    public void addAuthor(IAuthor author) {
        this.authorRepository.add(author);
    }

    @Override
    public void removeAuthor(IID id) throws InvalidNullException {
        this.authorRepository.remove(id);
    }

    @Override
    public void updateAuthor(IID id, IAuthor author) throws InvalidNullException {
        this.authorRepository.update(id, author);
    }

    @Override
    public IAuthor[] getAuthors() throws InvalidNullException {
        return this.authorRepository.getAll();
    }

    @Override
    public IAuthor getAuthorById(IID id) throws InvalidNullException {
        return this.authorRepository.getById(id);
    }

    @Override
    public void addKeyWord(IKeyWord keyWord) throws InvalidNullException {
        this.keyWordsRepository.add(keyWord);
    }

    @Override
    public void removeKeyWord(IKeyWord keyWord) throws InvalidNullException {
        this.keyWordsRepository.remove(keyWord);
    }

    @Override
    public void updateKeyWord(IKeyWord oldKeyWord, IKeyWord newKeyWord) throws InvalidNullException {
        this.keyWordsRepository.update(oldKeyWord, newKeyWord);
    }

    @Override
    public IKeyWord[] getKeyWords(IKeyWord[] keyWords) throws InvalidNullException {
        return this.keyWordsRepository.getByKeyWords(keyWords);
    }

    @Override
    public IKeyWord getKeyWord(IKeyWord keyWord) throws InvalidNullException {
        return this.keyWordsRepository.getByKeyWord(keyWord);
    }

    @Override
    public INews getNewsById(IID<Integer> id) throws InvalidNullException {
        return this.newsRepository.getById(id);
    }

    @Override
    public IArticle getArticleById(IID<Integer> id) throws InvalidNullException {
        return this.articleRepository.getById(id);
    }

    @Override
    public INews[] getNews() throws InvalidNullException {
        return this.newsRepository.getAll();
    }

    @Override
    public IArticle[] getArticles() throws InvalidNullException {
        return this.articleRepository.getAll();
    }
}
