package ifpb.entitybasic;

import ifpb.entitybasic.interfaces.IAuthor;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitybasic.interfaces.IName;

public class Author implements IAuthor {
    private final IName name;
    private IID<String> id;

    public Author(String name, String matricula) {
        this.name = new Name(name);
        this.id = new ID<String>(matricula);
    }

    @Override
    public boolean compareKeys(IID id) {
        return this.id.compareTo(id);
    }

    @Override
    public String getName() {
        return this.name.getName();
    }
    @Override
    public IID<String> getId(){
        return this.id;
    }

    @Override
    public boolean compareTo(IAuthor compareData) {
        return this.compareKeys(compareData.getId());
    }
}
