package ifpb.collections.classes;

import ifpb.entitybasic.interfaces.IID;
import ifpb.entitybasic.interfaces.IUser;

import java.util.ArrayList;
import java.util.List;

public class UserList {

    private final List<IUser> users;

    public UserList() {
        this.users = new ArrayList<>();
    }

    public void add(IUser user) {
        users.add(user);
    }

    public int removeById(IID id) {
        IUser user = getById(id);
        if (user != null) {
            users.remove(user);
            return 0;
        }
        return 1;
    }

    public IUser getById(IID id) {
        for (IUser user : users) {
            if (user.getUsername().equals(id.getId())) {
                return user;
            }
        }
        return null;
    }

    public int size() {
        return users.size();
    }

    public List<IUser> getUsers() {
        return new ArrayList<>(users);
    }
}
