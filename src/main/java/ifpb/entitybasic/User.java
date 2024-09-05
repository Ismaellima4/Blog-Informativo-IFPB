/**
 * A classe User implementa a interface IUser e fornece funcionalidades para gerenciar as informações de um usuário,
 * incluindo nome e e-mail. A classe delega a validação e alteração dessas informações para as classes Name e Email.
 * 
 * Princípios Aplicados:
 * 
 * - Single Responsibility Principle (SRP):
 *   A classe User é responsável apenas por gerenciar as informações básicas do usuário, nome e e-mail.
 * 
 * - Liskov Substitution Principle (LSP):
 *   A classe User pode ser substituída por qualquer outra implementação de IUser sem afetar o sistema.
 * 
 * - Open/Closed Principle (OCP):
 *   A classe está aberta para extensão, permitindo que novas funcionalidades sejam adicionadas sem alterar o código existente.
 * 
 * - Interface Segregation Principle (ISP):
 *   Implementa os métodos definidos na interface IUser, mantendo as responsabilidades claramente definidas.
 * 
 * - Object Calisthenics: Small Entities:
 *   A classe é pequena e focada, gerenciando apenas o nome e o e-mail do usuário.
 * 
 * - Object Calisthenics: One Dot Per Line:
 *   Segue a regra de um ponto por linha para garantir clareza e legibilidade.
 */

package ifpb.entitybasic;

import ifpb.entitybasic.interfaces.IUser;

public class User implements IUser {

    private Name name;
    private Email email;

    public User(Name name, Email email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public void changeName(String name) {
        this.name.changeName(name);
    }

    @Override
    public void changeEmail(String email) {
        this.email.changeEmail(email);
    }
}