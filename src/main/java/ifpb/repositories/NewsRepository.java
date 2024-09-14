package ifpb.repositories;

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
    public void update(IID id, INews content) {
        this.listNews.update(id, content);
    }

    @Override
    public void remove(IID id) {
        this.listNews.remove(id);
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
