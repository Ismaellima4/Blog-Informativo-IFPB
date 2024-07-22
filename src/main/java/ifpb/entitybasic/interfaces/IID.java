package ifpb.entitybasic.interfaces;

import ifpb.entitybasic.ID;

public interface IID<T> {

    boolean compareTo(ID<T> compareId);
}
