package ifpb.factorys.interfaces;

import ifpb.collections.interfaces.ICollection;

public interface ICollectionFactory<T> {
    ICollection<T> create();
}
