package ifpb.factorys.interfaces;

import ifpb.repositorys.interfaces.IAuthorsRepository;
import ifpb.repositorys.interfaces.IKeyWordsRepository;

public interface IAbstractFactory {
    IAuthorsFactory createAuthorsFactory();
    IKeyWorsFactory createKeyWordsFactory();
    IKeyWordsRepository createRespositoryKeyWords();
    IAuthorsRepository createRepositoryAuthors();

}
