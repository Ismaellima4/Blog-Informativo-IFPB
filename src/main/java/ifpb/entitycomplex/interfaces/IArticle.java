package ifpb.entitycomplex.interfaces;
/**
 * A interface IArticle define a estrutura básica de um artigo,
 * incluindo operações para manipulação de seu conteúdo, cabeçalho e palavras-chave.
 */
import ifpb.collections.interfaces.ICollection;
import ifpb.entitybasic.interfaces.IHeader;
import ifpb.entitybasic.interfaces.IID;

import java.io.IOException;
import java.io.InputStream;

public interface IArticle {
    InputStream getArticleFile();
    int updateArticleFile(InputStream article) throws IOException;
    int updateHeader(IHeader header);
    int updateKeyWords(ICollection<IID> keyWords);
    IHeader getHeader();
    ICollection<IID> getKeyWords();
    boolean compareKeys(IID id);
}
