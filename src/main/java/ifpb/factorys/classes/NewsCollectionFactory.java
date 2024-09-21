package ifpb.factorys.classes;
/**
 * A classe NewsCollectionFactory é responsável pela criação de instâncias de ICollection<INews>.
 * Ela implementa a interface ICollectionFactory e assegura que apenas uma instância da coleção
 * de notícias seja criada (padrão Singleton).
 */
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
