package ifpb.collections;

import ifpb.collections.interfaces.ICollection;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitycomplex.interfaces.INews;

import java.util.ArrayList;

public class NewsCollection implements ICollection<INews> {

    private ArrayList<INews> newsList;

    @Override
    public void add(INews news) {
        if (news != null) this.newsList.add(news);
    }

    @Override
    public void remove(IID id) {
        if (id != null) this.newsList.remove(getById(id));
    }

    @Override
    public INews getById(IID id) {
        for (INews news: this.newsList) {
            if (news.comparekeys(id)) return news;
        }
        return null;
    }

    @Override
    public INews[] getAll() {
        return this.newsList.toArray(new INews[this.newsList.size()]);
    }

    @Override
    public void update(IID id,INews news) {
        remove(id);
        add(news);
    }
}
