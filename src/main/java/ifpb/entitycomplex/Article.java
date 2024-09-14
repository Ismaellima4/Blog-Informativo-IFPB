package ifpb.entitycomplex;

import ifpb.collections.interfaces.ICollectionId;
import ifpb.entitybasic.interfaces.IHeader;
import ifpb.collections.interfaces.IKeyWords;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitycomplex.interfaces.IArticle;

import java.io.InputStream;

public class Article implements IArticle {
    private IID<String> id;
    private IHeader header;
    private ICollectionId keyWords;
    private InputStream article;

    public Article(IID<String> publicaitonId, IHeader header, ICollectionId keyWords, InputStream article) {
        this.id = publicaitonId;
        this.header = header;
        this.keyWords = keyWords;
        this.article = article;
    }

    @Override
    public InputStream getArticleFile() {
        return null;
    }

    @Override
    public int updateArticleFile() {
        return 0;
    }

    @Override
    public int updateHeader(IHeader header) {
        return 0;
    }

    @Override
    public int updateKeyWords(ICollectionId keyWords) {
        return 0;
    }

    @Override
    public IHeader getHeader() {
        return null;
    }

    @Override
    public ICollectionId getKeyWords() {
        return null;
    }
}
