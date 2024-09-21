package ifpb.factorys.interfaces;
/**
 * A interface IAuthorsFactory define um contrato para a criação de coleções
 * de autores.
 */
import ifpb.collections.interfaces.IAuthors;

public interface IAuthorsFactory {
    IAuthors create();
}
