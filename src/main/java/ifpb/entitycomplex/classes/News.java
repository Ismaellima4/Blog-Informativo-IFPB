package ifpb.entitycomplex.classes;

import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitybasic.interfaces.IHeader;
import ifpb.entitycomplex.interfaces.INews;

public class News implements INews {
    private final IID<Integer> ID;
    private IHeader header;
    private String news;

    public News(IID<Integer> ID, IHeader header, String news) throws Throwable {
        this.ID = ID;
        this.header = hasNullHeader(header);
        this.news = hasNullNews(news);
    }

    @Override
    public String getNews() {
        return this.news;
    }

    @Override
    public void changeNews(String news) throws InvalidNullException {
        this.news = hasNullNews(news);
    }

    @Override
    public IHeader getHeader() {
        return this.header;
    }

    @Override
    public IID<Integer> getId() {
        return this.ID;
    }

    @Override
    public boolean comparekeys(IID id) {
        return this.ID.compareTo(id);
    }

    private IHeader hasNullHeader(IHeader header) throws InvalidNullException {
        if (header == null) throw new InvalidNullException();

        return header;
    }

    private String hasNullNews(String news) throws InvalidNullException {
        if (news == null) throw new InvalidNullException();

        return news;
    }
}
