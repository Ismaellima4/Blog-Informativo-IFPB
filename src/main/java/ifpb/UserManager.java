/**
 * A interface UserManager define um contrato para gerenciar usuários no sistema. Ela oferece métodos para autenticação,
 * registro, remoção e atualização de usuários.
 * 
 * Princípios Aplicados:
 * 
 * - Single Responsibility Principle (SRP):
 *   A interface UserManager é responsável exclusivamente por gerenciar operações relacionadas a usuários, como login,
 *   registro, remoção e atualização.
 * 
 * - Liskov Substitution Principle (LSP):
 *   Qualquer implementação da interface UserManager deve ser capaz de substituir outras implementações sem alterar o
 *   comportamento esperado do sistema.
 * 
 * - Open/Closed Principle (OCP):
 *   A interface está aberta para extensão (por exemplo, novos métodos podem ser adicionados) e fechada para modificação (não
 *   é necessário alterar a interface existente para adicionar novas funcionalidades).
 * 
 * - Interface Segregation Principle (ISP):
 *   A interface é projetada para fornecer métodos específicos para a gestão de usuários, evitando métodos desnecessários e
 *   mantendo uma responsabilidade claramente definida.
 * 
 * - Object Calisthenics: Small Interfaces:
 *   A interface UserManager é pequena e focada em uma única responsabilidade, mantendo a clareza e a coesão.
 * 
 * - Object Calisthenics: One Dot Per Line:
 *   Segue a regra de um ponto por linha para manter a legibilidade e clareza dos métodos.
 */

package ifpb;

public interface UserManager {
    String singIn(String email,String pasword);
    String signUp(String name,String email,String password,String username);
    void removeUser(int id);
    boolean update(int id, String name, String email, String password,String username);
}