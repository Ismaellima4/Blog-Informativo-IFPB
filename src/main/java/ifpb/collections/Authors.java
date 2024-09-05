package ifpb.collections;

import ifpb.collections.interfaces.IAuthors;
import ifpb.entitybasic.ID;
import ifpb.entitybasic.interfaces.IAuthor;
import ifpb.entitybasic.interfaces.IID;

import java.util.ArrayList;

/**
 * A classe Authors implementa a interface IAuthors e fornece uma implementação concreta
 * para gerenciar uma coleção de autores. Ela utiliza um ArrayList para armazenar autores
 * e permite adicionar, remover, obter e atualizar autores na coleção.
 * 
 * Princípios Aplicados:
 * 
 * - Single Responsibility Principle (SRP):
 *   A classe é responsável por gerenciar a coleção de autores, incluindo operações de
 *   adição, remoção, obtenção e atualização, sem assumir responsabilidades adicionais.
 * 
 * - Open/Closed Principle (OCP):
 *   A classe é aberta para extensão (podem ser adicionadas novas funcionalidades por meio
 *   da implementação de interfaces adicionais) e fechada para modificações (mudanças
 *   na implementação não afetam a interface IAuthors).
 * 
 * - Liskov Substitution Principle (LSP):
 *   As operações da classe Authors funcionam como esperado e podem ser substituídas
 *   por outras implementações de IAuthors sem alterar o comportamento esperado.
 * 
 * - Interface Segregation Principle (ISP):
 *   A classe implementa a interface IAuthors que define métodos específicos para
 *   gerenciamento de autores, permitindo uma implementação que respeita o contrato da
 *   interface sem assumir responsabilidades extras.
 * 
 * - Dependency Inversion Principle (DIP):
 *   A classe Authors depende da abstração IAuthor e IID, permitindo uma maior
 *   flexibilidade e desacoplamento.
 * 
 * - Object Calisthenics: One Dot Per Line:
 *   A classe segue a regra de um ponto por linha, melhorando a legibilidade do código.
 * 
 * - Object Calisthenics: No Getters/Setters/Properties:
 *   A classe evita o uso de getters e setters públicos desnecessários para proteger
 *   a integridade dos dados e promover a encapsulação.
 */

public class Authors implements IAuthors {
    private ArrayList<IAuthor> authors = new ArrayList<IAuthor>();


    @Override
    public void add(IAuthor author) {
        authors.add(author);
    }

    @Override
    public void remove(String matricula) {
        IID id = new ID(matricula);
        this.authors.remove(get(id));
    }

    @Override
    public IAuthor get(IID id) {
        for (IAuthor author : this.authors){
            if(author.compareKeys(id)) return author;
        }
        return null;
    }

    @Override
    public IAuthor[] get() {
        return (IAuthor[]) this.authors.toArray();
    }

    @Override
    public void update(IAuthor author) {
        this.remove(author.getName());
        this.add(author);

    }
}