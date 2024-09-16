package ifpb.collections.classes;

import ifpb.collections.interfaces.ICollection;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitycomplex.interfaces.IArticle;

import java.util.ArrayList;

public class ArticleCollection implements ICollection<IArticle> {

    private ArrayList<IArticle> articles;

    @Override
    public void add(IArticle content) {
        if (content != null) this.articles.add(content);
    }

    @Override
    public int remove(IID id) {
        IArticle article = getById(id);
        if (id != null || article != null) {
            this.articles.remove(getById(id));
            return 0;
        }
        return 1;
    }

    @Override
    public IArticle getById(IID id) {
        for (IArticle article: this.articles){
            if (article.compareKeys(id)) return article;
        }
        return null;
    }

    @Override
    public IArticle[] getAll() {
        return this.articles.toArray(new IArticle[this.articles.size()]);
    }

    @Override
    public int update(IID id, IArticle content) {
        int result = remove(id);
        if (result == 0){
            add(content);
        }
        return result;
    }

    @Override
    public int getSize() {
        return this.articles.size();
    }
}
