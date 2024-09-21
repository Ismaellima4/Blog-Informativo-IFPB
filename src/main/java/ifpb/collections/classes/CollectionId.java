package ifpb.collections.classes;
/**
 * A classe CollectionId implementa a interface ICollection para gerenciar uma coleção de identificadores (IID).
 * Fornece métodos para adicionar, remover, atualizar e recuperar identificadores, garantindo a integridade e
 * consistência da coleção.
 *
 * Princípios Aplicados:
 *
 * - Single Responsibility Principle (SRP):
 *   A classe é responsável apenas por gerenciar uma coleção de identificadores, oferecendo métodos para manipulação
 *   segura e eficiente da coleção.
 *
 * - Liskov Substitution Principle (LSP):
 *   A classe pode ser substituída por qualquer outra implementação de ICollection<IID> sem afetar o
 *   funcionamento correto do sistema, desde que siga o contrato da interface.
 *
 * - Open/Closed Principle (OCP):
 *   A classe está aberta para extensão, permitindo novas funcionalidades, como novos tipos de coleções
 *   de identificadores, sem modificar o código existente.
 *
 * - Interface Segregation Principle (ISP):
 *   Implementa apenas os métodos definidos na interface ICollection, mantendo as responsabilidades claramente
 *   definidas e separadas.
 *
 * - Object Calisthenics: First Class Collections:
 *   Encapsula a coleção de identificadores, evitando manipulação direta da lista interna.
 *
 * - Object Calisthenics: No Primitives:
 *   Utiliza a interface IID para representar identificadores, evitando o uso de tipos primitivos e
 *   melhorando a expressividade e o encapsulamento.
 */
import ifpb.collections.interfaces.ICollection;
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IID;

import java.util.ArrayList;

public class CollectionId implements ICollection<IID> {
    ArrayList<IID> listId = new ArrayList<>();
    @Override
    public void add(IID id) {
        listId.add(id);
    }

    @Override
    public int remove(IID id) {
        boolean result = listId.remove(id);
        return result ? 0: 1;
    }

    @Override
    public IID[] getAll() throws InvalidNullException {
        if (listId.isEmpty()) throw new InvalidNullException();
        IID[] ids = new IID[listId.size() - 1];
        for(int i = 0; i<listId.size(); i++){
            ids[i] = listId.get(i);
        }
        return ids;
    }

    @Override
    public int update(IID ID, IID content) {

        if(ID != null){
            int result = this.remove(ID);
            if (result == 0){
                add(content);
            }
            return result;
        }
        return 0;
    }

    @Override
    public IID getById(IID id) throws InvalidNullException {
        for (int i = 0; i< listId.size(); i++){
            if(listId.get(i).compareTo(id)){
                return listId.get(i);
            }
        }
        throw new InvalidNullException();
    }

    @Override
    public int getSize() {
        return this.listId.size();
    }
}
