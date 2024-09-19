package ifpb.repositories.classes;

import ifpb.entitybasic.classes.ID;
import ifpb.entitybasic.interfaces.IUser;
import ifpb.entitybasic.interfaces.IID;
import ifpb.collections.classes.UserCollection;
import ifpb.collections.interfaces.IUsers;
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.repositories.interfaces.IUserRepository;

import java.util.HashMap;
import java.util.Map;

public class UserRepository implements IUserRepository {

    private final IUsers userCollection;
    private final Map<IID<String>, String> passwords = new HashMap<>();
    private int currentId = 1;

    public UserRepository() {
        this.userCollection = new UserCollection();
    }

    @Override
    public IUser signIn(String username, String password) throws InvalidNullException {
        IID<String> id = new ID<>(username);
        IUser user = userCollection.get(id);
        if (user != null && passwords.get(id).equals(password)) {
            return user;
        }
        return null;
    }

    @Override
    public boolean signUp(IUser user, String password) {
        IID<String> id = new ID<>(user.getUsername());
        try {
            if (userCollection.get(id) != null) {
                return false;
            }
            userCollection.add(user);
            passwords.put(id, password);
            return true;
        } catch (InvalidNullException e) {
            return false;
        }
    }

    @Override
    public boolean removeUser(IID id) {
        try {
            if (userCollection.remove(id) == 0) {
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
            if (userCollection.update(id, newUser) == 0) {
                passwords.put(id, newPassword);
                return true;
            }
        } catch (InvalidNullException e) {
        }
        return false;
    }
}
