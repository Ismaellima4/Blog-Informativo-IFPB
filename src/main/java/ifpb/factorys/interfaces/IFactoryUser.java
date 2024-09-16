package ifpb.factorys.interfaces;

import ifpb.entitybasic.interfaces.IUser;

public interface IFactoryUser {
    IUser create(String username, String name, String email);
}
