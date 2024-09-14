package ifpb.collections.interfaces;

import ifpb.entitybasic.interfaces.IID;

public interface ICollection<T> {
    void add(T content);
    void remove(IID id);
    T getById(IID id);
    T[] getAll();
    void update(IID ID, T content);
}
