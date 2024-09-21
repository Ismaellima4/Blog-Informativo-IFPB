package ifpb.repositories.interfaces;
/**
 * A interface IRepository define as operações básicas para gerenciar entidades genéricas em um repositório.
 */
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IID;

public interface IRepository<T> {
    void add(T content);
    int update(IID id, T content) throws InvalidNullException;
    int remove(IID id) throws InvalidNullException;
    T[] getAll() throws InvalidNullException;
    T getById(IID id) throws InvalidNullException;
}
