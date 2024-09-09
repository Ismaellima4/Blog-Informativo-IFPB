package ifpb.factorys.interfaces;

import ifpb.repositorys.interfaces.IRepositoryAuthors;
import ifpb.repositorys.interfaces.IRepositoryKeyWords;

public interface IAbstractFactory {
    IAuthorsFactory createAuthorsFactory();
    IKeyWorsFactory createKeyWordsFactory();
    IRepositoryKeyWords createRespositoryKeyWords();
    IRepositoryAuthors createRepositoryAuthors();

}
