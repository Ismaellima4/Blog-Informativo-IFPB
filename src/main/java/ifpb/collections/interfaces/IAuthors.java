package ifpb.collections.interfaces;

import ifpb.entitybasic.interfaces.IAuthor;
import ifpb.entitybasic.interfaces.IID;

public interface IAuthors {

        void add(IAuthor author);
        int remove(IID matricula);
        IAuthor get(IID matricula);
        IAuthor[] get();

        int update(IAuthor author);

}

