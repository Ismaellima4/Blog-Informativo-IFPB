package ifpb.collections.classes;

import ifpb.collections.interfaces.ICollection;
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitybasic.interfaces.IUser;

import java.util.ArrayList;
import java.util.List;

public class UserCollection implements ICollection<IUser> {

    private final List<IUser> users;

    public UserCollection() {
        this.users = new ArrayList<>();
    }

    @Override
    public void add(IUser user) {
        try {
            validateUser(user);
        } catch (InvalidNullException e) {
            throw new RuntimeException(e);
        }
        users.add(user);
    }

    @Override
    public int remove(IID id) {
        IUser user = null;
        try {
            validateId(id);
            user = getById(id);
        } catch (InvalidNullException e) {
            throw new RuntimeException(e);
        }
        if (user != null) {
            users.remove(user);
            return 0;
        }
        return 1;
    }

    @Override
    public IUser getById(IID id) {
        try {
            validateId(id);
        } catch (InvalidNullException e) {
            throw new RuntimeException(e);
        }
        for (IUser user : users) {
            if (user.getUsername().equals(id.getId())) {
                return user;
            }
        }
        return null;
    }

    @Override
    public IUser[] getAll() {
        IUser[] usersArray = new IUser[users.size() - 1];
        for(int i = 0; i<users.size(); i++){
            usersArray[i] = users.get(i);
        }
        return usersArray;
    }

    @Override
    public int update(IID id, IUser newUser) {
        try {
            validateId(id);
            validateUser(newUser);
        } catch (InvalidNullException e) {
            throw new RuntimeException(e);
        }
        IUser user = getById(id);
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
            throw new InvalidNullException();
        }
    }

    private void validateId(IID id) throws InvalidNullException {
        if (id == null || id.getId() == null) {
            throw new InvalidNullException();
        }
    }
}
