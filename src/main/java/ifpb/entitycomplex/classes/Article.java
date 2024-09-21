package ifpb.entitycomplex.classes;
/**
 * A classe Article implementa a interface IArticle e representa um artigo
 * com um cabeçalho, palavras-chave e o conteúdo do artigo em forma de
 * fluxo de entrada. Esta classe fornece métodos para acessar e atualizar
 * as propriedades do artigo, garantindo que as informações sejam gerenciadas
 * de forma adequada.
 *
 * Princípios Aplicados:
 *
 * - Single Responsibility Principle (SRP):
 *   A classe Article é responsável apenas por gerenciar os dados de um artigo
 *   e suas operações relacionadas, mantendo um foco claro em suas responsabilidades.
 *
 * - Open/Closed Principle (OCP):
 *   A classe Article está aberta para extensão através da interface IArticle,
 *   permitindo que novas funcionalidades sejam adicionadas sem modificar o código existente.
 *
 * - Liskov Substitution Principle (LSP):
 *   A classe Article pode ser substituída por qualquer outra implementação de IArticle
 *   sem comprometer o funcionamento do sistema.
 *
 * - Interface Segregation Principle (ISP):
 *   A classe implementa apenas os métodos definidos na interface IArticle, evitando
 *   métodos desnecessários e mantendo as responsabilidades claramente definidas.
 */
import ifpb.collections.interfaces.ICollection;
import ifpb.entitybasic.interfaces.IHeader;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitycomplex.interfaces.IArticle;

import java.io.IOException;
import java.io.InputStream;

public class Article implements IArticle {
    private IID<String> id;
    private IHeader header;
    private ICollection<IID> keyWords;
    private InputStream article;

    public Article(IID<String> publicaitonId, IHeader header, ICollection<IID> keyWords, InputStream article) {
        this.id = publicaitonId;
        this.header = header;
        this.keyWords = keyWords;
        this.article = article;
    }

    @Override
    public InputStream getArticleFile() {
        return this.article;
    }

    @Override
    public int updateArticleFile(InputStream article) throws IOException {
        int validator = article.available();
        if (validator == 0) {
            return 1;
        }
        this.article = article;
        return 0;
    }

    @Override
    public int updateHeader(IHeader header) {
        this.header.update(header);
        return 0;
    }

    @Override
    public int updateKeyWords(ICollection<IID> keyWords) {
        this.keyWords = keyWords;
        return 0;
    }

    @Override
    public IHeader getHeader() {
        return this.header;
    }

    @Override
    public ICollection<IID> getKeyWords() {
        return this.keyWords;
    }

    @Override
    public boolean compareKeys(IID id) {
        return this.id.compareTo(id);
    }


}
