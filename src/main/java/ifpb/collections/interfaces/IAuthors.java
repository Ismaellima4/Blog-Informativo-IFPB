package ifpb.collections.interfaces;
/**
 * Interface IAuthors define um contrato para operações de gerenciamento de autores.
 * Esta interface expõe métodos para adicionar, remover, obter e atualizar autores,
 * e é projetada para garantir a flexibilidade e a extensão das implementações.
 *
 * Princípios Aplicados:
 *
 * - Interface Segregation Principle (ISP):
 *   A interface define métodos específicos para operações com autores, permitindo que
 *   as implementações forneçam apenas o comportamento necessário, sem forçar a implementação
 *   de métodos não utilizados.
 *
 * - Open/Closed Principle (OCP):
 *   A interface está aberta para extensão, permitindo que novas implementações sejam adicionadas
 *   sem modificar a interface existente. Ela é fechada para modificações, garantindo que
 *   alterações na implementação não afetem a interface.
 *
 * - Single Responsibility Principle (SRP):
 *   A interface tem a responsabilidade única de definir operações relacionadas ao gerenciamento
 *   de autores, sem misturar outras responsabilidades.
 */
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IAuthor;
import ifpb.entitybasic.interfaces.IID;

public interface IAuthors {
        void add(IAuthor author);
        int remove(IID matricula) throws InvalidNullException;
        IAuthor get(IID matricula) throws InvalidNullException;
        IAuthor[] get() throws InvalidNullException;
        int update(IAuthor author) throws InvalidNullException;
        int getSize();
}