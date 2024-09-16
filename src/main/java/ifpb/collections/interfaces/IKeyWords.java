package ifpb.collections.interfaces;

import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IKeyWord;

public interface IKeyWords {

    void add(IKeyWord keyWord) throws InvalidNullException;
    int remove(IKeyWord keyWord) throws InvalidNullException;
    int update(IKeyWord oldKeyWord, IKeyWord newKeyWord) throws InvalidNullException;
    IKeyWord get(IKeyWord keyWord) throws InvalidNullException;
    IKeyWord[] get(IKeyWord[] keyWords) throws InvalidNullException;
    IKeyWord[] get();
    int getSize();

}
