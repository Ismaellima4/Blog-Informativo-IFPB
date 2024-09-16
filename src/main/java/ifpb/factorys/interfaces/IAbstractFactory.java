package ifpb.factorys.interfaces;

import ifpb.repositories.interfaces.IKeyWordsRepository;
import ifpb.repositories.interfaces.IRepository;

public interface IAbstractFactory {
    IAuthorsFactory createAuthorsFactory();
    IKeyWorsFactory createKeyWordsFactory();
    IKeyWordsRepository createRespositoryKeyWords();
    IRepository createRepositoryAuthors();

}
