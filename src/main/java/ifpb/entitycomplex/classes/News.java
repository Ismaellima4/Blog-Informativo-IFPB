package ifpb.entitycomplex.classes;
/**
 * A classe News implementa a interface INews e representa uma notícia,
 * contendo um cabeçalho e o conteúdo da notícia. Esta classe fornece métodos
 * para acessar e modificar as propriedades da notícia, garantindo que os
 * dados sejam gerenciados de forma válida.
 *
 * Princípios Aplicados:
 *
 * - Single Responsibility Principle (SRP):
 *   A classe News é responsável apenas por gerenciar os dados de uma notícia,
 *   mantendo um foco claro em suas responsabilidades.
 *
 * - Open/Closed Principle (OCP):
 *   A classe News está aberta para extensão através da interface INews,
 *   permitindo que novas funcionalidades sejam adicionadas sem modificar o código existente.
 *
 * - Liskov Substitution Principle (LSP):
 *   A classe News pode ser substituída por qualquer outra implementação de INews
 *   sem comprometer o funcionamento do sistema.
 *
 * - Interface Segregation Principle (ISP):
 *   A classe implementa apenas os métodos definidos na interface INews, evitando
 *   métodos desnecessários e mantendo as responsabilidades claramente definidas.
 */
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
