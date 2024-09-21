package ifpb.collections.classes;
/**
 * A classe UserCollection implementa a interface ICollection e gerencia uma coleção de usuários (IUser).
 * Oferece métodos para adicionar, remover, atualizar e recuperar usuários, garantindo a validade dos dados
 * durante as operações.
 *
 * Princípios Aplicados:
 *
 * - Single Responsibility Principle (SRP):
 *   A classe é responsável apenas por gerenciar a coleção de usuários, mantendo as operações de manipulação de dados
 *   separadas e organizadas.
 *
 * - Liskov Substitution Principle (LSP):
 *   A classe pode ser substituída por qualquer outra implementação de ICollection<IUser> sem comprometer o funcionamento
 *   do sistema.
 *
 * - Open/Closed Principle (OCP):
 *   A classe está aberta para extensão, permitindo que novas funcionalidades sejam adicionadas sem alterar o código existente.
 *
 * - Interface Segregation Principle (ISP):
 *   Implementa apenas os métodos definidos na interface ICollection, mantendo as responsabilidades claramente definidas.
 *
 * - Object Calisthenics: First Class Collections:
 *   Encapsula a lista de usuários, evitando manipulações diretas da lista interna.
 *
 * - Object Calisthenics: No Primitives:
 *   Utiliza a interface IUser para representar usuários, evitando o uso de tipos primitivos e melhorando o encapsulamento.
 */
import ifpb.collections.interfaces.ICollection;
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitybasic.interfaces.IUser;

import java.util.ArrayList;
import java.util.List;

public class UserCollection implements ICollection<IUser> {

    private final List<IUser> users;

    public UserCollection() {
        this.users = new ArrayList<>();
    }

    @Override
    public void add(IUser user) {
        try {
            validateUser(user);
        } catch (InvalidNullException e) {
            throw new RuntimeException(e);
        }
        users.add(user);
    }

    @Override
    public int remove(IID id) {
        IUser user = null;
        try {
            validateId(id);
            user = getById(id);
        } catch (InvalidNullException e) {
            throw new RuntimeException(e);
        }
        if (user != null) {
            users.remove(user);
            return 0;
        }
        return 1;
    }

    @Override
    public IUser getById(IID id) {
        try {
            validateId(id);
        } catch (InvalidNullException e) {
            throw new RuntimeException(e);
        }
        for (IUser user : users) {
            if (user.compareId(id)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public IUser[] getAll() throws InvalidNullException {
        if (users.isEmpty()) throw new InvalidNullException();
        IUser[] usersArray = new IUser[users.size() - 1];
        for(int i = 0; i<users.size(); i++){
            usersArray[i] = users.get(i);
        }
        return usersArray;
    }

    @Override
    public int update(IID id, IUser newUser) {
        try {
            validateId(id);
            validateUser(newUser);
        } catch (InvalidNullException e) {
            throw new RuntimeException(e);
        }
        IUser user = getById(id);
        if (user != null) {
            users.remove(user);
            users.add(newUser);
            return 0;
        }
        return 1;
    }

    @Override
    public int getSize() {
        return users.size();
    }

    private void validateUser(IUser user) throws InvalidNullException {
        if (user == null) {
            throw new InvalidNullException();
        }
    }

    private void validateId(IID id) throws InvalidNullException {
        if (id == null || id.getId() == null) {
            throw new InvalidNullException();
        }
    }
}
