package ifpb.repositories.interfaces;

import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.exceptions.InvalidPasswordException;
import ifpb.entitybasic.interfaces.IUser;
import ifpb.entitybasic.interfaces.IID;

public interface IUserRepository {
    int signIn(String username, String password) throws InvalidNullException, InvalidPasswordException;
    boolean signUp(IUser user) throws InvalidNullException;
    boolean removeUser(IID id) throws InvalidNullException;
    boolean updateUser(IID id, IUser newUser) throws InvalidNullException;
}
