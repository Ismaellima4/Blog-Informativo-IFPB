package ifpb.collections.interfaces;
/**
 * A interface ICollection define um conjunto de operações para gerenciar coleções de elementos de maneira genérica.
 * Cada elemento da coleção é identificado por um identificador único (IID), permitindo adicionar, remover, atualizar e recuperar elementos.
 *
 * Princípios Aplicados:
 *
 * - Single Responsibility Principle (SRP):
 *   A ICollection é responsável por definir a estrutura básica de uma coleção, com operações de manipulação de elementos.
 *
 * - Liskov Substitution Principle (LSP):
 *   Qualquer implementação de ICollection pode substituir outra sem alterar o comportamento esperado do sistema, desde que siga as especificações.
 *
 * - Open/Closed Principle (OCP):
 *   A interface está aberta para extensão e novas funcionalidades podem ser adicionadas sem alterar a interface original.
 *
 * - Interface Segregation Principle (ISP):
 *   Define um contrato claro e conciso para manipulação de coleções, sem sobrecarregar as classes que a implementam com funcionalidades extras.
 *
 * - Object Calisthenics: First Class Collections:
 *   Foca na utilização de coleções como objetos de primeira classe, encapsulando a lógica de manipulação e evitando a manipulação direta de estruturas de dados.
 *
 * - Object Calisthenics: No Primitives:
 *   Utiliza identificadores (IID) e objetos genéricos em vez de tipos primitivos, para maior expressividade e encapsulamento.
 *
 * - Object Calisthenics: No Getters/Setters:
 *   Em vez de fornecer métodos get/set tradicionais, a interface foca em operações mais ricas e significativas, como add, remove, e update.
 */
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IID;

public interface ICollection<T> {
    void add(T content);
    int remove(IID id) throws InvalidNullException;
    T getById(IID id) throws InvalidNullException;
    T[] getAll() throws InvalidNullException;
    int update(IID ID, T content) throws InvalidNullException;
    int getSize();
}