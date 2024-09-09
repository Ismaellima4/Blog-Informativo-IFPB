package ifpb.factorys.classes;

import ifpb.entitybasic.Author;
import ifpb.entitybasic.ID;
import ifpb.entitybasic.Name;
import ifpb.entitybasic.interfaces.IAuthor;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitybasic.interfaces.IName;
import ifpb.factorys.interfaces.IFactoryAuthor;

public class FactoryAuthor implements IFactoryAuthor {
    @Override
    public IAuthor create(String name, String enroll) {
        IName nameObject = new Name(name);
        IID<String> id = new ID<String>(enroll);

        return new Author(id, nameObject);
    }
}
