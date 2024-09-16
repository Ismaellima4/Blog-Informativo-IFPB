package ifpb.factorys.classes;

import ifpb.collections.classes.ArticleCollection;
import ifpb.collections.interfaces.ICollection;
import ifpb.entitycomplex.interfaces.IArticle;
import ifpb.factorys.interfaces.ICollectionFactory;

public class ArticleCollectionFactory implements ICollectionFactory<IArticle> {
    private static ICollection<IArticle> articles;

    private static void setCollection(ICollection<IArticle> instance){
        articles = instance;
    }

    @Override
    public ICollection<IArticle> create() {
        if (articles == null){
            setCollection(new ArticleCollection());
        }
        return articles;
    }
}
