package ifpb.collections.interfaces;

import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IAuthor;
import ifpb.entitybasic.interfaces.IID;

public interface IAuthors {
        void add(IAuthor author);
        int remove(IID matricula) throws InvalidNullException;
        IAuthor get(IID matricula) throws InvalidNullException;
        IAuthor[] get() throws InvalidNullException;
        int update(IAuthor author) throws InvalidNullException;
        int getSize();
}