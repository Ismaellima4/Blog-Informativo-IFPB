package ifpb.collections.interfaces;

import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IID;

public interface ICollection<T> {
    void add(T content);
    int remove(IID id) throws InvalidNullException;
    T getById(IID id) throws InvalidNullException;
    T[] getAll() throws InvalidNullException;
    int update(IID ID, T content) throws InvalidNullException;
    int getSize();
}