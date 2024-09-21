package ifpb.collections.interfaces;
/**
 * A interface IUsers define um conjunto de operações para gerenciar uma coleção de usuários. Ela permite
 * adicionar, remover, atualizar e recuperar usuários individuais ou todos os usuários da coleção.
 * Cada usuário é identificado por um identificador único (IID).
 *
 * Princípios Aplicados:
 *
 * - Single Responsibility Principle (SRP):
 *   A interface IUsers é responsável por definir operações básicas de manipulação de uma coleção de usuários,
 *   encapsulando a lógica de gerenciamento de usuários em um único lugar.
 *
 * - Liskov Substitution Principle (LSP):
 *   Qualquer implementação de IUsers pode substituir outra sem alterar o comportamento do sistema,
 *   desde que siga o contrato definido pela interface.
 *
 * - Open/Closed Principle (OCP):
 *   A interface está aberta para extensão, permitindo novas funcionalidades na manipulação de usuários
 *   sem modificar a interface original.
 *
 * - Interface Segregation Principle (ISP):
 *   A interface define métodos específicos para a manipulação de usuários, mantendo as responsabilidades
 *   bem definidas e evitando a sobrecarga das classes que a implementam.
 *
 * - Object Calisthenics: First Class Collections:
 *   Encapsula o comportamento de uma coleção de usuários, tratando usuários como objetos de primeira classe.
 *
 * - Object Calisthenics: No Primitives:
 *   Utiliza a interface IUser para representar usuários e IID para identificadores, evitando o uso de tipos primitivos,
 *   melhorando a expressividade e o encapsulamento.
 */
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitybasic.interfaces.IUser;
import java.util.List;

public interface IUsers {

    void add(IUser user) throws InvalidNullException;
    int remove(IID id) throws InvalidNullException;
    IUser get(IID id) throws InvalidNullException;
    List<IUser> getAll() throws InvalidNullException;
    int update(IID id, IUser user) throws InvalidNullException;
    int getSize();
}
