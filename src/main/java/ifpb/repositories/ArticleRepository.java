package ifpb.repositories;

import ifpb.Article;
import ifpb.entitybasic.interfaces.IID;
import ifpb.repositories.interfaces.IRepository;

import java.util.ArrayList;
import java.util.List;

public class ArticleRepository implements IRepository<Article> {
    private ArrayList<Article> listArticle;

    @Override
    public void add(Article content) {
        this.listArticle.add(content);
    }

    @Override
    public void update(IID id, Article content) {
        remove(id);
        add(content);
    }

    @Override
    public void remove(IID id) {
        this.listArticle.remove(getById(id));
    }

    @Override
    public List<Article> getAll() {
        return this.listArticle;
    }

    @Override
    public Article getById(IID id) {
        for (Article article: this.listArticle) {
            if (article.getId().compareTo(id)) return article;
        }
        return null;
    }

    @Override
    public Article get(Article content) {
        return getById(content.getId());
    }
}
