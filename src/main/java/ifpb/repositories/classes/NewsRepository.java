package ifpb.repositories.classes;

import ifpb.collections.interfaces.ICollection;
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
    public int update(IID id, INews content) {
        return this.listNews.update(id, content);
    }

    @Override
    public int remove(IID id) {
        return this.listNews.remove(id);
    }

    @Override
    public INews[] getAll() {
        return this.listNews.getAll();
    }

    @Override
    public INews getById(IID id) {
        return this.listNews.getById(id);
    }
}
