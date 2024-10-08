package ifpb.factorys.classes;
/**
 * A classe FactoryUser é responsável pela criação de instâncias de IUser.
 * Ela implementa a interface IFactoryUser e encapsula a lógica de criação
 * de um usuário, incluindo a construção de seu ID, nome e e-mail.
 */
import ifpb.entitybasic.classes.Email;
import ifpb.entitybasic.classes.ID;
import ifpb.entitybasic.classes.Name;
import ifpb.entitybasic.classes.User;
import ifpb.entitybasic.interfaces.IEmail;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitybasic.interfaces.IName;
import ifpb.entitybasic.interfaces.IUser;
import ifpb.factorys.interfaces.IFactoryUser;

public class FactoryUser implements IFactoryUser {
    @Override
    public IUser create(String username, String name, String email, String password) {
        IID<String> id = new ID<String>(username);
        IName nameObject = new Name(name);
        IEmail emailObject = new Email(email);
        return new User(id, nameObject, emailObject, password);
    }
}