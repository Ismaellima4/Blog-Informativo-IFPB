package ifpb.repositories.classes;
/**
 * A classe NewsRepository implementa as operações para gerenciar notícias em um repositório.
 */
import ifpb.collections.interfaces.ICollection;
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitycomplex.interfaces.INews;
import ifpb.repositories.interfaces.IRepository;

public class NewsRepository implements IRepository<INews> {
    private ICollection<INews> listNews;

    public NewsRepository(ICollection<INews> collection){
        this.listNews = collection;
    }

    @Override
    public void add(INews content) {
        this.listNews.add(content);
    }

    @Override
    public int update(IID id, INews content) throws InvalidNullException {
        return this.listNews.update(id, content);
    }

    @Override
    public int remove(IID id) throws InvalidNullException {
        return this.listNews.remove(id);
    }

    @Override
    public INews[] getAll() throws InvalidNullException {
        return this.listNews.getAll();
    }

    @Override
    public INews getById(IID id) throws InvalidNullException {
        return this.listNews.getById(id);
    }
}
