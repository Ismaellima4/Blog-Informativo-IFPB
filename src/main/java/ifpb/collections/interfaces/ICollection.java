package ifpb.collections.interfaces;

import ifpb.entitybasic.interfaces.IID;

public interface ICollection<T> {
    void add(T content);
    int remove(IID id);
    T getById(IID id);
    T[] getAll();
    int update(IID ID, T content);
    int getSize();
}