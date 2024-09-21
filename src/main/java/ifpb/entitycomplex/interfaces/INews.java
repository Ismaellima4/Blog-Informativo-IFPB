package ifpb.entitycomplex.interfaces;
/**
 * A interface INews define a estrutura básica de uma notícia,
 * incluindo operações para manipulação do conteúdo da notícia, cabeçalho e identificação.
 */
import ifpb.entitybasic.interfaces.IHeader;
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IID;

public interface INews {
    String getNews();
    void changeNews(String news) throws InvalidNullException;
    IHeader getHeader();
    IID getId();
    boolean comparekeys(IID id);
}
