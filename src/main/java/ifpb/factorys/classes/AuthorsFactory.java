package ifpb.factorys.classes;
/**
 * A classe AuthorsFactory implementa a interface IAuthorsFactory e é responsável
 * pela criação de coleções de autores.
 */
import ifpb.collections.classes.Authors;
import ifpb.collections.interfaces.IAuthors;
import ifpb.factorys.interfaces.IAuthorsFactory;

public class AuthorsFactory implements IAuthorsFactory {

    private static IAuthors authors;

    private static void setKeyWords(IAuthors keyWords) {
        AuthorsFactory.authors = keyWords;
    }

    @Override
    public IAuthors create() {
        if (authors == null){
            setKeyWords(new Authors());
        }
        return authors;
    }
}
