package ifpb.entitybasic.interfaces;

import ifpb.collections.interfaces.ICollectionId;
import ifpb.entitybasic.interfaces.IInformation;

public interface IHeader {
    IInformation getInformation();
    ICollectionId getAuthors();
    IHeader update(IHeader header);
}
