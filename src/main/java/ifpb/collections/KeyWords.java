package ifpb.collections;

import ifpb.collections.interfaces.IKeyWords;
import ifpb.entitybasic.KeyWord;
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IKeyWord;

import java.util.ArrayList;

public class KeyWords implements IKeyWords {

    private ArrayList<IKeyWord> keyWords = new ArrayList<>();

    @Override
    public void add(String keyWord) throws InvalidNullException {
        this.keyWords.add(new KeyWord(keyWord));
    }

    @Override
    public int remove(String keyWord) throws InvalidNullException {
        IKeyWord value = get(keyWord);
        if(value != null){
            this.keyWords.remove(value);
        }
        return 0;
    }

    @Override
    public int update(String oldKeyWord, String newKeyWord) throws InvalidNullException {
        int result = remove(oldKeyWord);
        if (result == 1){
            add(newKeyWord);
            return 1;
        }
        return 0;
    }

    @Override
    public IKeyWord get(String keyWord) throws InvalidNullException {
        try {
            IKeyWord key = new KeyWord(keyWord);
            for (IKeyWord value : this.keyWords){
                if(value.compareTo(key)) return value;
            }
        } catch(Exception e){
            return null;
        }
        return null;
    }

    @Override
    public IKeyWord[] get() {
        IKeyWord[] array = new IKeyWord[this.keyWords.size()];
        for (int i = 0; i < this.keyWords.size(); i++){
            array[i] = this.keyWords.get(i);
        }
        return array;
    }
}
