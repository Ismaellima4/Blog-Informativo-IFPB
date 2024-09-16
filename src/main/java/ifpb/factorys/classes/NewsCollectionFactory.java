package ifpb.factorys.classes;

import ifpb.collections.classes.NewsCollection;
import ifpb.collections.interfaces.ICollection;
import ifpb.entitycomplex.interfaces.INews;
import ifpb.factorys.interfaces.ICollectionFactory;

public class NewsCollectionFactory implements ICollectionFactory<INews> {
    private static ICollection<INews> news;

    private static void setCollection(ICollection<INews> instance){
        news = instance;
    }
    @Override
    public ICollection<INews> create() {
        if (news == null){
            setCollection(new NewsCollection());
        }
        return news;
    }
}
