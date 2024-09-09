package ifpb.entitycomplex;

import ifpb.collections.interfaces.IHeader;
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitybasic.interfaces.IKeyWord;

import java.io.InputStream;

public class Article {
    private IID<String> id;
    private IHeader header;
    private IKeyWord[] keyWords;
    private InputStream article;

    public Article(IID<String> publicaitonId, IHeader header, IKeyWord[] keyWords, InputStream article) {
        this.id = publicaitonId;
        this.header = header;
        this.keyWords = keyWords;
        this.article = article;
    }
}
