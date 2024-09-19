package ifpb.controllers;

import ifpb.controllers.interfaces.IControllerManager;
import ifpb.entitybasic.exceptions.InvalidNullException;
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
    public void createUser(IUser user) {

    }

    @Override
    public void updateUser(IID id, IUser user) {

    }

    @Override
    public void deleteUser(IID id) {

    }

    @Override
    public IUser getUserById(IID id) {
        return null;
    }

    @Override
    public IUser[] getAllUser() {
        return new IUser[0];
    }

    @Override
    public void createNews(INews news) {
        this.newsRepository.add(news);
    }

    @Override
    public void deleteNews(IID id) {
        this.newsRepository.remove(id);
    }

    @Override
    public void updateNews(IID id, INews news) {
        this.newsRepository.update(id, news);
    }

    @Override
    public void createArticle(IArticle article) {
        this.articleRepository.add(article);
    }

    @Override
    public void deleteArticle(IID id) {
        this.articleRepository.remove(id);
    }

    @Override
    public void updateArticle(IID id, IArticle article) {
        this.articleRepository.update(id, article);
    }

    @Override
    public void addAuthor(IAuthor author) {
        this.authorRepository.add(author);
    }

    @Override
    public void removeAuthor(IID id) {
        this.authorRepository.remove(id);
    }

    @Override
    public void updateAuthor(IID id, IAuthor author) {
        this.authorRepository.update(id, author);
    }

    @Override
    public IAuthor[] getAuthors() {
        return this.authorRepository.getAll();
    }

    @Override
    public IAuthor getAuthorById(IID id) {
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
    public INews getNewsById(IID<Integer> id) {
        return this.newsRepository.getById(id);
    }

    @Override
    public IArticle getArticleById(IID<Integer> id) {
        return this.articleRepository.getById(id);
    }

    @Override
    public INews[] getNews() {
        return this.newsRepository.getAll();
    }

    @Override
    public IArticle[] getArticles() {
        return this.articleRepository.getAll();
    }
}
