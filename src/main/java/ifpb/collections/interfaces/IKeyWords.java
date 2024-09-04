package ifpb.collections.interfaces;

import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IKeyWord;

public interface IKeyWords {

    void add(String keyWord) throws InvalidNullException;
    int remove(String keyWord) throws InvalidNullException;
    int update(String oldKeyWord, String newKeyWord) throws InvalidNullException;
    IKeyWord get(String keyWord) throws InvalidNullException;
    IKeyWord[] get();

}
