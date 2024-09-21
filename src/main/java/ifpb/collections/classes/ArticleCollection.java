package ifpb.collections.classes;
/**
 * A classe ArticleCollection implementa a interface ICollection para gerenciar uma coleção de artigos.
 * Fornece operações para adicionar, remover, atualizar e recuperar artigos, garantindo a integridade
 * e consistência da coleção. Cada artigo é identificado por um identificador único (IID).
 *
 * Princípios Aplicados:
 *
 * - Single Responsibility Principle (SRP):
 *   A classe é responsável apenas por gerenciar uma coleção de artigos, oferecendo métodos para manipulação
 *   segura e eficiente da coleção.
 *
 * - Liskov Substitution Principle (LSP):
 *   A classe pode ser substituída por qualquer outra implementação de ICollection<IArticle> sem afetar o
 *   funcionamento correto do sistema, desde que sigam o contrato da interface.
 *
 * - Open/Closed Principle (OCP):
 *   A classe está aberta para extensão, permitindo novas funcionalidades, como novos tipos de coleções
 *   de artigos, sem modificar o código existente.
 *
 * - Interface Segregation Principle (ISP):
 *   Implementa apenas os métodos definidos na interface ICollection, mantendo as responsabilidades claramente
 *   definidas e separadas.
 *
 * - Object Calisthenics: First Class Collections:
 *   Encapsula a coleção de artigos, evitando manipulação direta da lista interna de artigos.
 *
 * - Object Calisthenics: No Primitives:
 *   Utiliza a interface IArticle para representar artigos e IID para identificadores, evitando o uso de tipos
 *   primitivos e melhorando a expressividade e o encapsulamento.
 */
import ifpb.collections.interfaces.ICollection;
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitycomplex.interfaces.IArticle;

import java.util.ArrayList;

public class ArticleCollection implements ICollection<IArticle> {

    private ArrayList<IArticle> articles = new ArrayList<>();

    @Override
    public void add(IArticle content) {
        if (content != null) this.articles.add(content);
    }

    @Override
    public int remove(IID id) throws InvalidNullException {
        IArticle article = getById(id);
        if (id != null || article != null) {
            this.articles.remove(getById(id));
            return 0;
        }
        return 1;
    }

    @Override
    public IArticle getById(IID id) throws InvalidNullException {
        for (IArticle article: this.articles){
            if (article.compareKeys(id)) return article;
        }
        throw new InvalidNullException();
    }

    @Override
    public IArticle[] getAll() throws InvalidNullException {
        if (articles.isEmpty()) throw new InvalidNullException();
        return this.articles.toArray(new IArticle[this.articles.size()]);
    }

    @Override
    public int update(IID id, IArticle content) throws InvalidNullException {
        int result = remove(id);
        if (result == 0){
            add(content);
        }
        return result;
    }

    @Override
    public int getSize() {
        return this.articles.size();
    }
}
