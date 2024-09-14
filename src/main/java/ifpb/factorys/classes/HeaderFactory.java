package ifpb.factorys.classes;

import ifpb.collections.interfaces.ICollectionId;
import ifpb.entitybasic.Header;
import ifpb.entitybasic.ID;
import ifpb.entitybasic.interfaces.IHeader;
import ifpb.entitybasic.interfaces.IInformation;
import ifpb.factorys.interfaces.ICollectionIdFactory;
import ifpb.factorys.interfaces.IFactoryInformation;
import ifpb.factorys.interfaces.IHeaderFactory;

public class HeaderFactory implements IHeaderFactory {

    @Override
    public IHeader create(String title, String description, String[] idAuthors) throws Throwable {
        IFactoryInformation factoryInformation = new FactoryInformation();
        IInformation information = factoryInformation.create(title, description);
        ICollectionIdFactory collectionIdFactory = new CollectionIdFactory();
        ICollectionId authorsId = collectionIdFactory.create();
        for (String id : idAuthors){
            authorsId.add(new ID(id));
        }
        return new Header(information, authorsId);
    }
}
