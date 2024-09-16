package ifpb.entitybasic.interfaces;

import ifpb.entitybasic.KeyWord;

public interface IKeyWord extends IBasicEntity<IKeyWord> {
    boolean compareTo( IKeyWord compareData);

    IID getId();
}
