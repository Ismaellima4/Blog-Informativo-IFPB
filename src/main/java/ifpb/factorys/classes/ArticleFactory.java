package ifpb.factorys.classes;

import ifpb.collections.interfaces.IAuthors;
import ifpb.collections.interfaces.IHeader;
import ifpb.collections.interfaces.IKeyWords;
import ifpb.entitybasic.ID;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitycomplex.Article;
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
        IKeyWords keyWordsCollection = new KeyWordsFactory().create();
        return  new Article(idObject, header, keyWordsCollection, article);
    }
}
