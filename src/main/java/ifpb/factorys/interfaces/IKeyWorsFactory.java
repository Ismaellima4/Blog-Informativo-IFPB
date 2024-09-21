package ifpb.factorys.interfaces;
/**
 * A interface IKeyWordsFactory define um contrato para a criação de objetos do tipo IKeyWords.
 */
import ifpb.collections.interfaces.IKeyWords;

public interface IKeyWorsFactory {
    IKeyWords create();
}
