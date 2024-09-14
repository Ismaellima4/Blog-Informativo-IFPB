package ifpb.factorys.classes;

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
