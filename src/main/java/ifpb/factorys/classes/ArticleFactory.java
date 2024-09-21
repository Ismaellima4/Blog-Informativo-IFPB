package ifpb.factorys.classes;
/**
 * A classe ArticleFactory implementa a interface IArticleFactory e é responsável
 * pela criação de instâncias de IArticle.
 */
import ifpb.collections.interfaces.ICollection;
import ifpb.entitybasic.interfaces.IHeader;
import ifpb.entitybasic.classes.ID;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitycomplex.classes.Article;
import ifpb.entitycomplex.interfaces.IArticle;
import ifpb.factorys.interfaces.IArticleFactory;
import ifpb.factorys.interfaces.IHeaderFactory;

import java.io.InputStream;

public class ArticleFactory implements IArticleFactory {
    @Override
    public IArticle create(String id, String title, String description, String[] authors, String[] keyWords, InputStream article) throws Throwable {
        IID<String> idObject = new ID<String>(id);
        IHeaderFactory headerFactory = new HeaderFactory();
        IHeader header = headerFactory.create(title,description,authors);
        ICollection<IID> collectionId = new CollectionIdFactory().create();
        for (String keyWord : keyWords){
            collectionId.add(new ID(keyWord));
        }
        return  new Article(idObject, header, collectionId, article);
    }
}
