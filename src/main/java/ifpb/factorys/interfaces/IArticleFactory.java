package ifpb.factorys.interfaces;
/**
 * A interface IArticleFactory define um contrato para a criação de instâncias de artigos.
 */
import ifpb.entitycomplex.interfaces.IArticle;

import java.io.InputStream;

public interface IArticleFactory {
    IArticle create(String id, String title, String description, String[] authors , String[] keyWords, InputStream article) throws Throwable;
}
