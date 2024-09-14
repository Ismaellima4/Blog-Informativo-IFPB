package ifpb.entitycomplex.interfaces;

import ifpb.collections.interfaces.IHeader;
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IID;

public interface INews {
    String getNews();
    void changeNews(String news) throws InvalidNullException;
    IHeader getHeader();
    IID getId();
    boolean comparekeys(IID id);
}
