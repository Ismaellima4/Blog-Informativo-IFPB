package ifpb.repositories.classes;

import ifpb.collections.interfaces.ICollection;
import ifpb.entitybasic.classes.ID;
import ifpb.entitybasic.interfaces.IUser;
import ifpb.entitybasic.interfaces.IID;
import ifpb.collections.classes.UserCollection;
import ifpb.repositories.interfaces.IUserRepository;

public class UserRepository implements IUserRepository {

    private final UserCollection UserCollection;

    public UserRepository(ICollection<IUser> iUserICollection) {
        this.UserCollection = new UserCollection();
    }

    @Override
    public IUser signIn(String username, String password) {
        IID<String> id = new ID<>(username);
        IUser user = null;
        user = UserCollection.getById(id);
        if (user != null) {
            return user;
        }
        return null;
    }

    @Override
    public boolean signUp(IUser user) {
        if (UserCollection.getById(user.getUsername()) != null) {
            return false;
        }
        UserCollection.add(user);
        return true;
    }

    @Override
    public boolean removeUser(IID id) {
        return UserCollection.remove(id) == 0;
    }

    @Override
    public boolean updateUser(IID id, IUser newUser) {
        UserCollection.update(id, newUser);
        return true;
    }
}
