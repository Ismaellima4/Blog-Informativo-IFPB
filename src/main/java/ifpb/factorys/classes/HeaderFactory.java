package ifpb.factorys.classes;

import ifpb.collections.Header;
import ifpb.collections.interfaces.IAuthors;
import ifpb.collections.interfaces.IHeader;
import ifpb.entitybasic.interfaces.IInformation;
import ifpb.factorys.interfaces.IAuthorsFactory;
import ifpb.factorys.interfaces.IFactoryInformation;
import ifpb.factorys.interfaces.IHeaderFactory;

public class HeaderFactory implements IHeaderFactory {

    @Override
    public IHeader create(String title, String description, String[] idAuthors) throws Throwable {
        IFactoryInformation factoryInformation = new FactoryInformation();
        IInformation information = factoryInformation.create(title, description);
        IAuthorsFactory authorsFactory = new AuthorsFactory();
        IAuthors authors = authorsFactory.create();

        return new Header(information, authors);
    }
}
