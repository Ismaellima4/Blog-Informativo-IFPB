package ifpb.entitybasic.interfaces;

import ifpb.collections.interfaces.ICollection;

public interface IHeader {
    IInformation getInformation();
    ICollection<IID> getAuthors();
    IHeader update(IHeader header);
}
