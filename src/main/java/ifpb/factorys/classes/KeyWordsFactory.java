package ifpb.factorys.classes;
/**
 * A classe KeyWordsFactory é responsável pela criação de instâncias de IKeyWords.
 * Ela implementa a interface IKeyWorsFactory e utiliza o padrão Singleton para garantir
 * que apenas uma instância da coleção de palavras-chave seja criada.
 */
import ifpb.collections.classes.KeyWords;
import ifpb.collections.interfaces.IKeyWords;
import ifpb.factorys.interfaces.IKeyWorsFactory;

public class KeyWordsFactory implements IKeyWorsFactory {
    private static IKeyWords keyWords;

    private static void setKeyWords(IKeyWords keyWords) {
        KeyWordsFactory.keyWords = keyWords;
    }

    @Override
    public IKeyWords create() {
        if (keyWords == null){
            setKeyWords(new KeyWords());
        }
        return keyWords;
    }
}
