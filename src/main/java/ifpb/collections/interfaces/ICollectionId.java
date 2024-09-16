package ifpb.collections.interfaces;

import ifpb.entitybasic.interfaces.IID;

public interface ICollectionId {
    void add(IID id);
    int remove(IID id);
    IID[] getAll();
    IID getById(IID id);
    int getSize();
}
