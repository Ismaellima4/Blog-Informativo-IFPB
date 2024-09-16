package ifpb.entitycomplex;

import ifpb.collections.interfaces.ICollectionId;
import ifpb.entitybasic.interfaces.IHeader;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitycomplex.interfaces.IArticle;

import java.io.IOException;
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
        return this.article;
    }

    @Override
    public int updateArticleFile(InputStream article) throws IOException {
        int validator = article.available();
        if (validator == 0) {
            return 1;
        }
        this.article = article;
        return 0;
    }

    @Override
    public int updateHeader(IHeader header) {
        this.header.update(header);
        return 0;
    }

    @Override
    public int updateKeyWords(ICollectionId keyWords) {
        this.keyWords = keyWords;
        return 0;
    }

    @Override
    public IHeader getHeader() {
        return this.header;
    }

    @Override
    public ICollectionId getKeyWords() {
        return this.keyWords;
    }

    @Override
    public boolean compareKeys(IID id) {
        return this.id.compareTo(id);
    }


}
