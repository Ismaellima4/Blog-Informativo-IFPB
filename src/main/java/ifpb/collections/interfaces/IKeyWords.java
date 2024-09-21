package ifpb.collections.interfaces;
/**
 * A interface IKeyWords define um conjunto de operações para gerenciar uma coleção de palavras-chave (keyWords).
 * Permite adicionar, remover, atualizar e recuperar palavras-chave individuais ou em grupos.
 *
 * Princípios Aplicados:
 *
 * - Single Responsibility Principle (SRP):
 *   A interface IKeyWords é responsável por definir operações básicas de manipulação de uma coleção de palavras-chave,
 *   encapsulando a lógica de gerenciamento de palavras-chave em um único lugar.
 *
 * - Liskov Substitution Principle (LSP):
 *   Qualquer implementação de IKeyWords pode substituir outra sem alterar o comportamento do sistema, desde que siga
 *   o contrato definido pela interface.
 *
 * - Open/Closed Principle (OCP):
 *   A interface está aberta para extensão, permitindo novas funcionalidades na manipulação de palavras-chave sem alterar
 *   a interface original.
 *
 * - Interface Segregation Principle (ISP):
 *   A interface define métodos específicos para a manipulação de palavras-chave, mantendo as responsabilidades bem definidas
 *   e evitando a sobrecarga das classes que a implementam.
 *
 * - Object Calisthenics: First Class Collections:
 *   Encapsula o comportamento de uma coleção de palavras-chave, tratando palavras-chave como objetos de primeira classe.
 *
 * - Object Calisthenics: No Primitives:
 *   Utiliza a interface IKeyWord para representar palavras-chave, evitando o uso de tipos primitivos para melhorar
 *   a expressividade e o encapsulamento.
 */
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IKeyWord;

public interface IKeyWords {

    void add(IKeyWord keyWord) throws InvalidNullException;
    int remove(IKeyWord keyWord) throws InvalidNullException;
    int update(IKeyWord oldKeyWord, IKeyWord newKeyWord) throws InvalidNullException;
    IKeyWord get(IKeyWord keyWord) throws InvalidNullException;
    IKeyWord[] get(IKeyWord[] keyWords) throws InvalidNullException;
    IKeyWord[] get() throws InvalidNullException;
    int getSize();

}