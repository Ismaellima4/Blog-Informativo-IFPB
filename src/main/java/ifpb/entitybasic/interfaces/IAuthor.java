package ifpb.entitybasic.interfaces;

import ifpb.entitybasic.Author;

public interface IAuthor extends IBasicEntity<Author> {
    boolean isEmpty();
    boolean compareTo(Author compareData);
    boolean compareKeys(String name);
    String getName();
}
