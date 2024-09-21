package ifpb.collections.classes;
/**
 * A classe NewsCollection implementa a interface ICollection para gerenciar uma coleção de notícias (INews).
 * Fornece métodos para adicionar, remover, atualizar e recuperar notícias, garantindo a consistência e a integridade
 * da coleção.
 *
 * Princípios Aplicados:
 *
 * - Single Responsibility Principle (SRP):
 *   A classe é responsável apenas por gerenciar a coleção de notícias, oferecendo métodos para manipulação segura
 *   e eficiente da coleção.
 *
 * - Liskov Substitution Principle (LSP):
 *   A classe pode ser substituída por qualquer outra implementação de ICollection<INews> sem comprometer o funcionamento
 *   correto do sistema.
 *
 * - Open/Closed Principle (OCP):
 *   A classe está aberta para extensão, permitindo novas funcionalidades, como novas formas de gerenciar notícias,
 *   sem modificar o código existente.
 *
 * - Interface Segregation Principle (ISP):
 *   Implementa apenas os métodos definidos na interface ICollection, mantendo as responsabilidades
 *   claramente definidas e separadas.
 *
 * - Object Calisthenics: First Class Collections:
 *   Encapsula a lista de notícias, evitando a manipulação direta da lista interna.
 *
 * - Object Calisthenics: No Primitives:
 *   Utiliza a interface INews para representar as notícias, evitando o uso de tipos primitivos e
 *   melhorando a expressividade e o encapsulamento.
 */
import ifpb.collections.interfaces.ICollection;
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitycomplex.interfaces.INews;

import java.util.ArrayList;

public class NewsCollection implements ICollection<INews> {

    private ArrayList<INews> newsList = new ArrayList<>();

    @Override
    public void add(INews news) {
        if (news != null) this.newsList.add(news);
    }

    @Override
    public int remove(IID id) throws InvalidNullException {
        INews news = getById(id);
        if (id != null || news != null) {
            this.newsList.remove(getById(id));
            return 0;
        }
        return 1;

    }

    @Override
    public INews getById(IID id) throws InvalidNullException {
        for (INews news: this.newsList) {
            if (news.comparekeys(id)) return news;
        }
        throw new InvalidNullException();
    }

    @Override
    public INews[] getAll() throws InvalidNullException {
        if (this.newsList.isEmpty()){
            throw new InvalidNullException();
        }
        return this.newsList.toArray(new INews[this.newsList.size()]);
    }

    @Override
    public int update(IID id,INews news) throws InvalidNullException {
        int result = remove(id);
        if (result == 0){
            add(news);
        }
        return result;
    }

    @Override
    public int getSize() {
        return this.newsList.size();
    }
}
