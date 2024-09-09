package ifpb.factorys.classes;

import ifpb.collections.KeyWords;
import ifpb.collections.interfaces.IKeyWords;
import ifpb.factorys.interfaces.IKeyWorsFactory;

public class KeyWordsFactory implements IKeyWorsFactory {
    private static IKeyWords keyWords;

    @Override
    public IKeyWords create() {
        if (keyWords == null){
            return new KeyWords();
        }
        return keyWords;
    }
}
