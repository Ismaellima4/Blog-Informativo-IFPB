package ifpb.factorys.classes;
/**
 * A classe FactoryAuthor implementa a interface IFactoryAuthor e é responsável
 * pela criação de instâncias de IAuthor, encapsulando um nome e um identificador.
 */
import ifpb.entitybasic.classes.Author;
import ifpb.entitybasic.classes.ID;
import ifpb.entitybasic.classes.Name;
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
