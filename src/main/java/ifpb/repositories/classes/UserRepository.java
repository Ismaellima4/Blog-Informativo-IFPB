package ifpb.repositories.classes;
/**
 * A classe UserRepository implementa as operações para gerenciar usuários em um repositório.
 */
import ifpb.collections.interfaces.ICollection;
import ifpb.entitybasic.classes.ID;
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.exceptions.InvalidPasswordException;
import ifpb.entitybasic.interfaces.IUser;
import ifpb.entitybasic.interfaces.IID;
import ifpb.collections.classes.UserCollection;
import ifpb.repositories.interfaces.IUserRepository;

public class UserRepository implements IUserRepository {

    private final ICollection<IUser> UserCollection;

    public UserRepository(ICollection<IUser> iUserICollection) {
        this.UserCollection = iUserICollection;
    }

    @Override
    public int signIn(String username, String password) throws InvalidNullException, InvalidPasswordException {
        IID<String> id = new ID<>(username);
        IUser user = null;
        user = UserCollection.getById(id);
        if (user != null) {
            return user.hashCode();
        }
        throw new InvalidPasswordException();
    }

    @Override
    public boolean signUp(IUser user) throws InvalidNullException {
        if (UserCollection.getById(user.getUsername()) != null) {
            return false;
        }
        UserCollection.add(user);
        return true;
    }

    @Override
    public boolean removeUser(IID id) throws InvalidNullException {
        return UserCollection.remove(id) == 0;
    }

    @Override
    public boolean updateUser(IID id, IUser newUser) throws InvalidNullException {
        UserCollection.update(id, newUser);
        return true;
    }
}
