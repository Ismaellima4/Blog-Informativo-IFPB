package ifpb.factorys.interfaces;

import ifpb.collections.interfaces.IHeader;

public interface IHeaderFactory {
    IHeader create(String title, String description, String[] idAuthors) throws Throwable;
}
