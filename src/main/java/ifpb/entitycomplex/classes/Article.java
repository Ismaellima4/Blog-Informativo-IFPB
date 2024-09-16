package ifpb.entitycomplex.classes;

import ifpb.collections.interfaces.ICollection;
import ifpb.entitybasic.interfaces.IHeader;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitycomplex.interfaces.IArticle;

import java.io.IOException;
import java.io.InputStream;

public class Article implements IArticle {
    private IID<String> id;
    private IHeader header;
    private ICollection<IID> keyWords;
    private InputStream article;

    public Article(IID<String> publicaitonId, IHeader header, ICollection<IID> keyWords, InputStream article) {
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
    public int updateKeyWords(ICollection<IID> keyWords) {
        this.keyWords = keyWords;
        return 0;
    }

    @Override
    public IHeader getHeader() {
        return this.header;
    }

    @Override
    public ICollection<IID> getKeyWords() {
        return this.keyWords;
    }

    @Override
    public boolean compareKeys(IID id) {
        return this.id.compareTo(id);
    }


}
