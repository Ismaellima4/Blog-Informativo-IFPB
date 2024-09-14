package ifpb.factorys.interfaces;

import ifpb.entitycomplex.interfaces.INews;

public interface INewsFactory {
    INews create(String id, String title, String description, String[] authors, String news) throws Throwable;
}
