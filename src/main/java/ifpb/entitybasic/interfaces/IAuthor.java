package ifpb.entitybasic.interfaces;

import ifpb.entitybasic.Author;

public interface IAuthor extends IBasicEntity<IAuthor> {
    boolean compareKeys(IID id);
    String getName();
    IID<String> getId();
}