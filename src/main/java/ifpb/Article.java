package ifpb;

import ifpb.entitybasic.interfaces.IID;

public interface Article {
    IID getId();
    boolean compareKeys(IID id);
}
