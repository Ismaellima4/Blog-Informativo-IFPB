package ifpb.entitycomplex.interfaces;

import ifpb.collections.interfaces.IAuthors;
import ifpb.entitybasic.interfaces.IInformation;

public interface IHeader {
    IInformation getInformation();
    IAuthors getAuthors();
}
