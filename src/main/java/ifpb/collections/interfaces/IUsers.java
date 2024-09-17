package ifpb.collections.interfaces;

import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitybasic.interfaces.IUser;
import java.util.List;

public interface IUsers {

    void add(IUser user) throws InvalidNullException;
    int remove(IID id) throws InvalidNullException;
    IUser get(IID id) throws InvalidNullException;
    List<IUser> getAll() throws InvalidNullException;
    int update(IID id, IUser user) throws InvalidNullException;
    int getSize();
}
