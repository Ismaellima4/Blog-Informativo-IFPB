package ifpb.collections;

import ifpb.Article;
import ifpb.collections.interfaces.ICollection;
import ifpb.entitybasic.interfaces.IID;

import java.util.ArrayList;

public class ArticleCollection implements ICollection<Article> {

    private ArrayList<Article> articles;

    @Override
    public void add(Article content) {
        if (content != null) this.articles.add(content);
    }

    @Override
    public void remove(IID id) {
        if (id != null) this.articles.remove(getById(id));
    }

    @Override
    public Article getById(IID id) {
        for (Article article: this.articles){
            if (article.compareKeys(id)) return article;
        }
        return null;
    }

    @Override
    public Article[] getAll() {
        return this.articles.toArray(new Article[this.articles.size()]);
    }

    @Override
    public void update(IID id, Article content) {
        remove(id);
        add(content);
    }
}
