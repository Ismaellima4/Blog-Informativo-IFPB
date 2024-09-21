package ifpb.factorys.classes;
/**
 * A classe CollectionIdFactory implementa a interface ICollectionFactory e é responsável
 * pela criação de coleções de identificadores (IDs).
 */
import ifpb.collections.classes.CollectionId;
import ifpb.collections.interfaces.ICollection;
import ifpb.entitybasic.interfaces.IID;
import ifpb.factorys.interfaces.ICollectionFactory;

public class CollectionIdFactory implements ICollectionFactory<IID> {
    @Override
    public ICollection<IID> create() {
        return new CollectionId();
    }
}
