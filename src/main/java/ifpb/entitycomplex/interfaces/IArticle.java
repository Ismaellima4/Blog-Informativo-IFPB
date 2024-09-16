package ifpb.entitycomplex.interfaces;

import ifpb.collections.interfaces.ICollectionId;
import ifpb.entitybasic.interfaces.IHeader;
import ifpb.entitybasic.interfaces.IID;

import java.io.IOException;
import java.io.InputStream;

public interface IArticle {
    InputStream getArticleFile();
    int updateArticleFile(InputStream article) throws IOException;
    int updateHeader(IHeader header);
    int updateKeyWords(ICollectionId keyWords);
    IHeader getHeader();
    ICollectionId getKeyWords();
    boolean compareKeys(IID id);
}
