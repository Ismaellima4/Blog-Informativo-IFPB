package ifpb.repositories.interfaces;
/**
 * A interface IKeyWordsRepository define as operações básicas para gerenciar palavras-chave em um repositório.
 */
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IKeyWord;

public interface IKeyWordsRepository {
    void add(IKeyWord content) throws InvalidNullException;
    void add(IKeyWord[] contents) throws InvalidNullException;
    int remove(IKeyWord content) throws InvalidNullException;
    int update(IKeyWord oldKeyWord, IKeyWord newKeyWord) throws InvalidNullException;
    IKeyWord getByKeyWord(IKeyWord keyWord) throws InvalidNullException;
    IKeyWord[] getByKeyWords(IKeyWord[] keyWords) throws InvalidNullException;
    IKeyWord[] getAll() throws InvalidNullException;
}
