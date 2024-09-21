package ifpb.factorys.interfaces;
/**
 * A interface IKeyWordsFactory define um contrato para a criação de objetos do tipo IAuthor.
 */
import ifpb.entitybasic.interfaces.IAuthor;

public interface IFactoryAuthor {
    IAuthor create(String name, String enroll);
}
