package ifpb.factorys.classes;
/**
 * A classe CollectionUserFactory implementa a interface ICollectionFactory e é responsável
 * pela criação de coleções de usuários.
 */
import ifpb.collections.classes.UserCollection;
import ifpb.collections.interfaces.ICollection;
import ifpb.entitybasic.interfaces.IUser;
import ifpb.factorys.interfaces.ICollectionFactory;

public class CollectionUserFactory implements ICollectionFactory<IUser> {
    private static ICollection<IUser> users;

    private static void setUserCollection(ICollection<IUser> userCollection){
        users = userCollection;
    }
    @Override
    public ICollection<IUser> create() {
        if(users == null){
            setUserCollection(new UserCollection());
        }
        return users;
    }
}
