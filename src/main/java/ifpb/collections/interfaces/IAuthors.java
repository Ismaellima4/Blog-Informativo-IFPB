package ifpb.collections.interfaces;

import ifpb.entitybasic.interfaces.IAuthor;
import ifpb.entitybasic.interfaces.IID;

public interface IAuthors {
    void add(IAuthor author);
    void remove(IID id);
    IAuthors list();
    void update(IID id, IAuthor author);
    IAuthor get(IAuthor author);
}
