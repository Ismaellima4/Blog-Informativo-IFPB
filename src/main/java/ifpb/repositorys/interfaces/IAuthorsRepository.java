package ifpb.repositorys.interfaces;

import ifpb.entitybasic.interfaces.IAuthor;

public interface IAuthorsRepository {
    void add(String matricula,String name);
    int remove(String matricula);
    IAuthor get(String matricula);
    IAuthor[] get();
    int update(String id, String name);
}
