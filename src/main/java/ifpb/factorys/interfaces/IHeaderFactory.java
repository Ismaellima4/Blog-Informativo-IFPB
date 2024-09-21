package ifpb.factorys.interfaces;
/**
 * A interface IHeaderFactory define um contrato para a criação de objetos do tipo IHeader.
 */
import ifpb.entitybasic.interfaces.IHeader;

public interface IHeaderFactory {
    IHeader create(String title, String description, String[] idAuthors) throws Throwable;
}
