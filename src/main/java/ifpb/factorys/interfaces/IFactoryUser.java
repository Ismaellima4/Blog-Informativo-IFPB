package ifpb.factorys.interfaces;
/**
 * A interface IKeyWordsFactory define um contrato para a criação de objetos do tipo IUser.
 */
import ifpb.entitybasic.interfaces.IUser;

public interface IFactoryUser {
    IUser create(String username, String name, String email, String password);
}
