package ifpb.collections.classes;

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
    public int remove(IID id) {
        INews news = getById(id);
        if (id != null || news != null) {
            this.newsList.remove(getById(id));
            return 0;
        }
        return 1;

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
    public int update(IID id,INews news) {
        int result = remove(id);
        if (result == 0){
            add(news);
        }
        return result;
    }

    @Override
    public int getSize() {
        return this.newsList.size();
    }
}
