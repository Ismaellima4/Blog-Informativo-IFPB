package ifpb;

import ifpb.entitybasic.interfaces.IUser;
import ifpb.entitybasic.interfaces.IID;

public interface IUserRepository {
    IUser signIn(String username, String password);
    boolean signUp(IUser user, String password);
    boolean removeUser(IID id);
    boolean updateUser(IID id, IUser newUser, String newPassword);
}