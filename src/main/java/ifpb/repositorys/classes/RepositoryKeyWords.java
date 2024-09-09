package ifpb.repositorys.classes;

import ifpb.collections.interfaces.IKeyWords;
import ifpb.entitybasic.KeyWord;
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IKeyWord;
import ifpb.factorys.classes.KeyWordsFactory;
import ifpb.repositorys.interfaces.IRepositoryKeyWords;

public class RepositoryKeyWords implements IRepositoryKeyWords {

    private IKeyWords keyWords = new KeyWordsFactory().create();

    @Override
    public void add(String keyWord) throws InvalidNullException {
        IKeyWord keyWordObject = new KeyWord(keyWord);
        this.keyWords.add(keyWordObject);
    }

    @Override
    public void add(String[] keyWordsArray) throws InvalidNullException {
        for (int i = 0; i < keyWordsArray.length; i++){
            this.add(keyWordsArray[i]);
        }
    }

    @Override
    public int remove(String keyWord) throws InvalidNullException {
        IKeyWord keyWordObject = new KeyWord(keyWord);
        return this.keyWords.remove(keyWordObject);
    }

    @Override
    public int update(String oldKeyWord, String newKeyWord) throws InvalidNullException {
        IKeyWord oldKeyWordObject = new KeyWord(oldKeyWord);
        IKeyWord newKeyWordObject = new KeyWord(newKeyWord);
        return this.keyWords.update(oldKeyWordObject, newKeyWordObject);
    }

    @Override
    public IKeyWord get(String keyWord) throws InvalidNullException {
        IKeyWord keyWordObject = new KeyWord(keyWord);
        return this.keyWords.get(keyWordObject);
    }

    @Override
    public IKeyWord[] get(String[] keyWords) throws InvalidNullException {
        IKeyWord[] resultArray = new IKeyWord[keyWords.length];
        for (int i = 0; i < keyWords.length; i++){
            resultArray[i] = new KeyWord(keyWords[i]);
        }
        return this.keyWords.get(resultArray);
    }

    @Override
    public IKeyWord[] get() {
        return this.keyWords.get();
    }
}
