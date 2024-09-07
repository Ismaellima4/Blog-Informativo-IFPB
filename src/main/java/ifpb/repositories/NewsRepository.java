package ifpb.repositories;

import ifpb.entitybasic.interfaces.IID;
import ifpb.entitycomplex.interfaces.INews;
import ifpb.repositories.interfaces.INewsRepository;

import java.util.ArrayList;

public class NewsRepository implements INewsRepository {
    private ArrayList<INews> listNews;

    @Override
    public void addNews(INews news) throws Throwable {
        this.listNews.add(news);
    }

    @Override
    public INews getNewsById(IID<Integer> id) {
        for (INews news : listNews) {
            if (id.compareTo(news.getId())) return news;
        }
        return null;
    }

    @Override
    public void updateNews(IID<Integer> id, INews news) throws Throwable {
        INews oldNews = getNewsById(id);
        removeNews(oldNews.getId());
        addNews(news);
    }

    @Override
    public void removeNews(IID<Integer> id) {
        INews oldNews = getNewsById(id);
        listNews.remove(oldNews);
    }

    @Override
    public ArrayList<INews> getNews() {
        return this.listNews;
    }
}
