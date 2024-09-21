package ifpb.factorys.classes;
/**
 * A classe NewsFactory é responsável pela criação de instâncias de INews.
 * Ela implementa a interface INewsFactory e fornece a lógica para a
 * construção de um objeto de notícia, incluindo a criação do cabeçalho.
 */
import ifpb.entitybasic.classes.ID;
import ifpb.entitybasic.interfaces.IHeader;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitycomplex.classes.News;
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
