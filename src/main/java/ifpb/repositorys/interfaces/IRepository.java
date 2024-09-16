package ifpb.repositorys.interfaces;

import ifpb.entitybasic.interfaces.IID;

public interface IRepository<T> {
    void add(T content);
    int update(IID id, T content);
    int remove(IID id);
    T[] getAll();
    T getById(IID id);
}
