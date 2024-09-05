/**
 * A classe Author representa um autor, implementando a interface IAuthor.
 * Ela encapsula um nome e uma matrícula (ID), e fornece operações para
 * comparar autores com base em suas chaves.
 * 
 * - Single Responsibility Principle (SRP):
 *   A classe é responsável por armazenar e gerenciar as informações de um autor,
 *   como nome e matrícula, sem assumir outras responsabilidades.
 * 
 * - Liskov Substitution Principle (LSP):
 *   A classe Author pode ser utilizada no lugar de qualquer outra classe que
 *   implemente IAuthor sem alterar o comportamento do código.
 * 
 * - Open/Closed Principle (OCP):
 *   A classe está aberta para extensão (pode ser estendida ou modificada por meio de
 *   herança ou composição) e fechada para modificação (mudanças na implementação não
 *   afetam sua utilização).
 * 
 * - Dependency Inversion Principle (DIP):
 *   A classe depende de abstrações (IName e IID), permitindo flexibilidade e
 *   substituição de implementações concretas.
 * 
 * - Object Calisthenics: Wrap All Primitives and Strings:
 *   Tanto o nome quanto a matrícula são encapsulados em classes (Name e ID),
 *   seguindo o princípio de encapsular primitivas para melhorar a organização
 *   e validação.
 * 
 * - Object Calisthenics: One Dot Per Line:
 *   O código segue a regra de um ponto por linha, promovendo a legibilidade.
 */

package ifpb.entitybasic;

import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IAuthor;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitybasic.interfaces.IName;

import java.util.Arrays;

public class Author implements IAuthor {
    private final IName name;
    private IID<String> id;

    public Author(String name, String matricula) {
        this.name = new Name(name);
        this.id = new ID<String>(matricula);
    }

    @Override
    public boolean compareKeys(IID id) {
        return this.id.compareTo(id);
    }

    @Override
    public String getName() {
        return this.name.getName();
    }
    @Override
    public IID<String> getId(){
        return this.id;
    }

    @Override
    public boolean compareTo(IAuthor compareData) {
        return this.compareKeys(compareData.getId());
    }
}