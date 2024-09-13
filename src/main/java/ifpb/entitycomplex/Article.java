package ifpb.entitycomplex;

import ifpb.collections.interfaces.IHeader;
import ifpb.collections.interfaces.IKeyWords;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitycomplex.interfaces.IArticle;

import java.io.InputStream;

public class Article implements IArticle {
    private IID<String> id;
    private IHeader header;
    private IKeyWords keyWords;
    private InputStream article;

    public Article(IID<String> publicaitonId, IHeader header, IKeyWords keyWords, InputStream article) {
        this.id = publicaitonId;
        this.header = header;
        this.keyWords = keyWords;
        this.article = article;
    }
}
