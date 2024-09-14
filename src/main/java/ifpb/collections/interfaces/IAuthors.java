package ifpb.collections.interfaces;

import ifpb.entitybasic.interfaces.IAuthor;
import ifpb.entitybasic.interfaces.IID;

public interface IAuthors {
        void add(IAuthor author);
        void remove(String matricula);
        IAuthor get(IID matricula);
        IAuthor[] get();
        void update(IAuthor author);
}

