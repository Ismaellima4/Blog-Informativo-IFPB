package ifpb.repositories.classes;

import ifpb.collections.interfaces.IKeyWords;
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IKeyWord;
import ifpb.repositories.interfaces.IKeyWordsRepository;

public class KeyWordsRepository implements IKeyWordsRepository {

    private IKeyWords keyWords;

    public KeyWordsRepository(IKeyWords instance){
        this.keyWords = instance;
    }

    @Override
    public void add(IKeyWord content) throws InvalidNullException {
        this.keyWords.add(content);
    }

    @Override
    public void add(IKeyWord[] contents) throws InvalidNullException {
        for (IKeyWord s : contents) {
            this.add(s);
        }
    }

    @Override
    public int remove(IKeyWord content) throws InvalidNullException {
        return this.keyWords.remove(content);
    }

    @Override
    public int update(IKeyWord oldKeyWord, IKeyWord newKeyWord) throws InvalidNullException {
        return this.keyWords.update(oldKeyWord, newKeyWord);
    }

    @Override
    public IKeyWord getByKeyWord(IKeyWord keyWord) throws InvalidNullException {
        return this.keyWords.get(keyWord);
    }

    @Override
    public IKeyWord[] getByKeyWords(IKeyWord[] keyWords) throws InvalidNullException {
        IKeyWord[] resultArray = new IKeyWord[keyWords.length];
        for (int i = 0; i < keyWords.length; i++){
            resultArray[i] = keyWords[i];
        }
        return this.keyWords.get(resultArray);
    }

    @Override
    public IKeyWord[] getAll() {
        return this.keyWords.get();
    }
}
