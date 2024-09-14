package ifpb.factorys.interfaces;

import ifpb.repositorys.classes.AuthorsRepository;
import ifpb.repositorys.interfaces.IKeyWordsRepository;
import ifpb.repositorys.interfaces.IRepository;

public interface IAbstractFactory {
    IAuthorsFactory createAuthorsFactory();
    IKeyWorsFactory createKeyWordsFactory();
    IKeyWordsRepository createRespositoryKeyWords();
    IRepository createRepositoryAuthors();

}
