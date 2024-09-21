package ifpb.factorys.interfaces;
/**
 * A interface ICollectionFactory define um contrato para a criação de coleções
 * de objetos de um tipo específico.
 */
import ifpb.collections.interfaces.ICollection;

public interface ICollectionFactory<T> {
    ICollection<T> create();
}
