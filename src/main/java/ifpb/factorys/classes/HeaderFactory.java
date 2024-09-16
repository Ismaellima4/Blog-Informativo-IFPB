package ifpb.factorys.classes;

import ifpb.collections.interfaces.ICollection;
import ifpb.entitybasic.classes.Header;
import ifpb.entitybasic.classes.ID;
import ifpb.entitybasic.interfaces.IHeader;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitybasic.interfaces.IInformation;
import ifpb.factorys.interfaces.ICollectionFactory;
import ifpb.factorys.interfaces.IFactoryInformation;
import ifpb.factorys.interfaces.IHeaderFactory;

public class HeaderFactory implements IHeaderFactory {

    @Override
    public IHeader create(String title, String description, String[] idAuthors) throws Throwable {
        IFactoryInformation factoryInformation = new FactoryInformation();
        IInformation information = factoryInformation.create(title, description);
        ICollectionFactory collectionIdFactory = new CollectionIdFactory();
        ICollection<IID> authorsId = collectionIdFactory.create();
        for (String id : idAuthors){
            authorsId.add(new ID(id));
        }
        return new Header(information, authorsId);
    }
}
