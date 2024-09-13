package ifpb.factorys.classes;

import ifpb.collections.Authors;
import ifpb.collections.interfaces.IAuthors;
import ifpb.factorys.interfaces.IAuthorsFactory;

public class AuthorsFactory implements IAuthorsFactory {

    @Override
    public IAuthors create() {
        return new Authors();
    }
}
