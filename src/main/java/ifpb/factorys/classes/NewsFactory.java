package ifpb.factorys.classes;

import ifpb.entitybasic.ID;
import ifpb.entitybasic.interfaces.IHeader;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitycomplex.News;
import ifpb.entitycomplex.interfaces.INews;
import ifpb.factorys.interfaces.INewsFactory;

public class NewsFactory implements INewsFactory {
    @Override
    public INews create(String id, String title, String description, String[] authors, String news) throws Throwable {
        IID idObject = new ID(id);
        IHeader header = new HeaderFactory().create(title, description, authors);
        return new News(idObject, header, news);
    }
}
