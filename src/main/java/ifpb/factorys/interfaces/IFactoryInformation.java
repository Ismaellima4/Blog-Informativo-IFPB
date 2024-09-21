package ifpb.factorys.interfaces;
/**
 * A interface IKeyWordsFactory define um contrato para a criação de objetos do tipo IInformation.
 */
import ifpb.entitybasic.interfaces.IInformation;

public interface IFactoryInformation {
    IInformation create(String title, String description) throws Exception;
}
