package ifpb.entitycomplex.interfaces;

import ifpb.collections.interfaces.ICollectionId;
import ifpb.entitybasic.interfaces.IHeader;

import java.io.InputStream;

public interface IArticle {
    InputStream getArticleFile();
    int updateArticleFile();
    int updateHeader(IHeader header);
    int updateKeyWords(ICollectionId keyWords);
    IHeader getHeader();
    ICollectionId getKeyWords();
}
