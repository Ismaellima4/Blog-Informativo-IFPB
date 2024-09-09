package ifpb.factorys.interfaces;

import ifpb.entitybasic.interfaces.IAuthor;

public interface IFactoryAuthor {
    IAuthor create(String name, String enroll);
}
