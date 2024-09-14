package ifpb.factorys.classes;

import ifpb.collections.classes.CollectionId;
import ifpb.collections.interfaces.ICollectionId;
import ifpb.factorys.interfaces.ICollectionIdFactory;

public class CollectionIdFactory implements ICollectionIdFactory {
    @Override
    public ICollectionId create() {
        return new CollectionId();
    }
}
