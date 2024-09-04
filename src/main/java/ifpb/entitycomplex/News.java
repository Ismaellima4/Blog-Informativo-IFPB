package ifpb.entitycomplex;

import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitycomplex.interfaces.IHeader;
import ifpb.entitycomplex.interfaces.INews;

public class News implements INews {
    private IID ID;
    private IHeader header;
    private String news;

    public News(IID ID, IHeader header, String news) throws Throwable {
        this.ID = ID;
        this.header = header;
        this.news = validateNews(news);
    }

    @Override
    public String getNews() {
        return this.news;
    }

    @Override
    public void changeNews(String news) throws InvalidNullException {
        this.news = validateNews(news);
    }

    @Override
    public IHeader getHeader() {
        return this.header;
    }

    private String validateNews(String news) throws InvalidNullException {
        if (news == null){
            throw new InvalidNullException();
        }
        return news;
    }
}
