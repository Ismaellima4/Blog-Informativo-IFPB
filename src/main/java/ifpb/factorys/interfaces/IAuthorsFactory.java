package ifpb.factorys.interfaces;

import ifpb.entitybasic.interfaces.IAuthor;

public interface IAuthorsFactory {
    void add(String matricula,String name);
    int remove(String matricula);
    IAuthor get(String matricula);
    IAuthor[] get();

    int update(String id, String name);
    void create();
}
