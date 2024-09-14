package ifpb.repositories;

import ifpb.Article;
import ifpb.collections.interfaces.ICollection;
import ifpb.entitybasic.interfaces.IID;
import ifpb.repositories.interfaces.IRepository;

public class ArticleRepository implements IRepository<Article> {
    private ICollection<Article> articles;

    public ArticleRepository(ICollection<Article> articles) {
        this.articles = articles;
    }

    @Override
    public void add(Article content) {
        this.articles.add(content);
    }

    @Override
    public void update(IID id, Article content) {
        this.articles.update(id, content);
    }

    @Override
    public void remove(IID id) {
        this.articles.remove(id);
    }

    @Override
    public Article[] getAll() {
        return this.articles.getAll();
    }

    @Override
    public Article getById(IID id) {
        return this.articles.getById(id);
    }
}
