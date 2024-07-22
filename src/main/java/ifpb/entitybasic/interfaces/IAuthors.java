package ifpb.entitybasic.interfaces;

public interface IAuthors {

    void add(IAuthor author);
    void remove(String matricula);
    IAuthor get(String matricula);
    IAuthor[] get();

    void update(IAuthor author);

}
