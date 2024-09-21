package ifpb.collections.classes;
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
import ifpb.collections.interfaces.IAuthors;
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IAuthor;
import ifpb.entitybasic.interfaces.IID;

import java.util.ArrayList;

public class Authors implements IAuthors {
    private ArrayList<IAuthor> authors = new ArrayList<IAuthor>();


    @Override
    public void add(IAuthor author) {
        authors.add(author);
    }

    @Override
    public int remove(IID matricula) throws InvalidNullException {
        IAuthor author = get(matricula);
        if (author != null) {
            this.authors.remove(author);
            return 1;
        }
        return 0;
    }

    @Override
    public IAuthor get(IID id) throws InvalidNullException {
        for (IAuthor author : this.authors){
            if(author.compareKeys(id)) return author;
        }
        throw new InvalidNullException();
    }

    @Override
    public IAuthor[] get() throws InvalidNullException {
        if (authors.isEmpty()) throw new InvalidNullException();
        IAuthor[] authorArray = new IAuthor[this.authors.size()];
        for (int i = 0; i < authorArray.length; i++) {
            authorArray[i] = this.authors.get(i);
        }
        return authorArray;
    }

    @Override
    public int update(IAuthor author) throws InvalidNullException {
        int value = this.remove(author.getId());
        if (value == 0){
            return 0;
        }
        this.add(author);
        return 1;
    }

    @Override
    public int getSize() {
        return this.authors.size();
    }
}
