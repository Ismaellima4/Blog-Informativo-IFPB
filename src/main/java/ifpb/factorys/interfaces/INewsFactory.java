package ifpb.factorys.interfaces;
/**
 * A interface INewsFactory define um contrato para a criação de objetos do tipo INews.
 */
import ifpb.entitycomplex.interfaces.INews;

public interface INewsFactory {
    INews create(String id, String title, String description, String[] authors, String news) throws Throwable;
}
