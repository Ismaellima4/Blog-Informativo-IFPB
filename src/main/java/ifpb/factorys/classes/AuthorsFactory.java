package ifpb.factorys.classes;

import ifpb.collections.Authors;
import ifpb.collections.interfaces.IAuthors;
import ifpb.entitybasic.ID;
import ifpb.entitybasic.interfaces.IAuthor;
import ifpb.entitybasic.interfaces.IID;
import ifpb.factorys.interfaces.IAuthorsFactory;
import ifpb.factorys.interfaces.IFactoryAuthor;

public class AuthorsFactory implements IAuthorsFactory {
    private static IAuthors authors;

    @Override
    public IAuthors create() {
        if (authors == null){
            return new Authors();
        }
        return authors;
    }
}
