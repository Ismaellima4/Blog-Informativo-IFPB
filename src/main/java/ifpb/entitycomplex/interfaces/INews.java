package ifpb.entitycomplex.interfaces;

import ifpb.collections.interfaces.IHeader;
import ifpb.entitybasic.exceptions.InvalidNullException;

public interface INews {
    String getNews();
    void changeNews(String news) throws InvalidNullException;
    IHeader getHeader();
}