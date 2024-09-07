package ifpb.repositories.interfaces;

import ifpb.entitybasic.interfaces.IID;
import ifpb.entitycomplex.interfaces.INews;

import java.util.ArrayList;

public interface INewsRepository {
    void addNews(INews news) throws Throwable;
    INews getNewsById(IID<Integer> id);
    void updateNews(IID<Integer> id, INews news) throws Throwable;
    void removeNews(IID<Integer> id);
    ArrayList<INews> getNews();
}
