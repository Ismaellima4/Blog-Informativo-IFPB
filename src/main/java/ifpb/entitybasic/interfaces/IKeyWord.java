package ifpb.entitybasic.interfaces;

import ifpb.entitybasic.KeyWord;

public interface IKeyWord extends IBasicEntity<KeyWord> {
    boolean compareTo( KeyWord compareData);
}
