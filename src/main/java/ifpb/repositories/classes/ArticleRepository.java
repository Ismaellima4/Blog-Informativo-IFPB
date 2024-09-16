package ifpb.repositories.classes;

import ifpb.collections.interfaces.ICollection;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitycomplex.interfaces.IArticle;
import ifpb.repositories.interfaces.IRepository;

public class ArticleRepository implements IRepository<IArticle> {
    private ICollection<IArticle> articles;

    public ArticleRepository(ICollection<IArticle> articles) {
        this.articles = articles;
    }

    @Override
    public void add(IArticle content) {
        this.articles.add(content);
    }

    @Override
    public int update(IID id, IArticle content) {
        return this.articles.update(id, content);
    }

    @Override
    public int remove(IID id) {
        return  this.articles.remove(id);
    }

    @Override
    public IArticle[] getAll() {
        return this.articles.getAll();
    }

    @Override
    public IArticle getById(IID id) {
        return this.articles.getById(id);
    }
}
