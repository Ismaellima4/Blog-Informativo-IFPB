package ifpb.entitybasic.interfaces;

import ifpb.entitybasic.ID;

public interface IID<T> {
    T getId();
    boolean compareTo(IID<T> compareId);
}