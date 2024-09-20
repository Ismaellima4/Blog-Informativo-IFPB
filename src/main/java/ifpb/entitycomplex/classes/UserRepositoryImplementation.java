package ifpb;

import ifpb.entitybasic.classes.ID;
import ifpb.entitybasic.interfaces.IUser;
import ifpb.entitybasic.interfaces.IID;
import ifpb.collections.classes.UserCollection;
import ifpb.entitybasic.exceptions.InvalidNullException;

import java.util.HashMap;
import java.util.Map;

public class UserRepositoryImplementation implements IUserRepository {

    private final UserCollection UserCollection;
    private final Map<IID<String>, String> passwords = new HashMap<>();

    public UserRepositoryImplementation() {
        this.UserCollection = new UserCollection();
    }

    @Override
    public IUser signIn(String username, String password) {
        IID<String> id = new ID<>(username);
        IUser user = UserCollection.get(id);
        if (user != null && passwords.get(id).equals(password)) {
            return user;
        }
        return null;
    }

    @Override
    public boolean signUp(IUser user, String password) {
        IID<String> id = new ID<>(user.getUsername());
        try {
            if (UserCollection.get(id) != null) {
                return false;
            }
            UserCollection.add(user);
            passwords.put(id, password);
            return true;
        } catch (InvalidNullException e) {
            return false;
        }
    }

    @Override
    public boolean removeUser(IID id) {
        try {
            if (UserCollection.remove(id) == 0) {
                passwords.remove(id);
                return true;
            }
        } catch (InvalidNullException e) {
        }
        return false;
    }

    @Override
    public boolean updateUser(IID id, IUser newUser, String newPassword) {
        try {
            if (UserCollection.update(id, newUser) == 0) {
                passwords.put(id, newPassword);
                return true;
            }
        } catch (InvalidNullException e) {
        }
        return false;
    }
}
