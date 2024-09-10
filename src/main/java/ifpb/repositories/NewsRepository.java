package ifpb.repositories;

import ifpb.entitybasic.interfaces.IID;
import ifpb.entitycomplex.interfaces.INews;
import ifpb.repositories.interfaces.IRepository;

import java.util.ArrayList;
import java.util.List;

public class NewsRepository implements IRepository<INews> {
    private ArrayList<INews> listNews;

    @Override
    public void add(INews content) {
        this.listNews.add(content);
    }

    @Override
    public void update(IID id, INews content) {
        remove(id);
        add(content);
    }

    @Override
    public void remove(IID id) {
        this.listNews.remove(getById(id));
    }

    @Override
    public List<INews> getAll() {
        return this.listNews;
    }

    @Override
    public INews getById(IID id) {
        for (INews news: this.listNews){
            if (news.getId().compareTo(id)) return news;
        }
        return null;
    }

    @Override
    public INews get(INews content) {
        return getById(content.getId());
    }
}
