package ifpb.collections.classes;

import ifpb.collections.interfaces.ICollection;
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitycomplex.interfaces.IArticle;

import java.util.ArrayList;

public class ArticleCollection implements ICollection<IArticle> {

    private ArrayList<IArticle> articles = new ArrayList<>();

    @Override
    public void add(IArticle content) {
        if (content != null) this.articles.add(content);
    }

    @Override
    public int remove(IID id) throws InvalidNullException {
        IArticle article = getById(id);
        if (id != null || article != null) {
            this.articles.remove(getById(id));
            return 0;
        }
        return 1;
    }

    @Override
    public IArticle getById(IID id) throws InvalidNullException {
        for (IArticle article: this.articles){
            if (article.compareKeys(id)) return article;
        }
        throw new InvalidNullException();
    }

    @Override
    public IArticle[] getAll() throws InvalidNullException {
        if (articles.isEmpty()) throw new InvalidNullException();
        return this.articles.toArray(new IArticle[this.articles.size()]);
    }

    @Override
    public int update(IID id, IArticle content) throws InvalidNullException {
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
