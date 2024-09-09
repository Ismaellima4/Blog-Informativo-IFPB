package ifpb.factorys.interfaces;

import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IKeyWord;

public interface IKeyWorsFactory {
    void add(String keyWord) throws InvalidNullException;
    void add(String[] keyWordsArray) throws InvalidNullException;
    int remove(String keyWord) throws InvalidNullException;
    int update(String oldKeyWord, String newKeyWord) throws InvalidNullException;
    IKeyWord get(String keyWord) throws InvalidNullException;
    IKeyWord[] get(String[] keyWords) throws InvalidNullException;
    IKeyWord[] get();
    void create()
}
