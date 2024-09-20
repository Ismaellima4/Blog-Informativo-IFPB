package ifpb.collections.classes;

import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitybasic.interfaces.IUser;

import java.util.ArrayList;
import java.util.List;

public class UserCollection implements IUsers {

    private final List<IUser> users;

    public UserCollection() {
        this.users = new ArrayList<>();
    }

    @Override
    public void add(IUser user) throws InvalidNullException {
        validateUser(user);
        users.add(user);
    }

    @Override
    public int remove(IID id) throws InvalidNullException {
        validateId(id);
        IUser user = get(id);
        if (user != null) {
            users.remove(user);
            return 0;
        }
        return 1;
    }

    @Override
    public IUser get(IID id) throws InvalidNullException {
        validateId(id);
        for (IUser user : users) {
            if (user.getUsername().equals(id.getId())) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<IUser> getAll() {
        return new ArrayList<>(users);
    }

    @Override
    public int update(IID id, IUser newUser) throws InvalidNullException {
        validateId(id);
        validateUser(newUser);
        IUser user = get(id);
        if (user != null) {
            users.remove(user);
            users.add(newUser);
            return 0;
        }
        return 1;
    }

    @Override
    public int getSize() {
        return users.size();
    }

    private void validateUser(IUser user) throws InvalidNullException {
        if (user == null) {
            throw new InvalidNullException("User cannot be null");
        }
    }

    private void validateId(IID id) throws InvalidNullException {
        if (id == null || id.getId() == null) {
            throw new InvalidNullException("ID cannot be null");
        }
    }
}
