package ifpb.entitybasic.classes;
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
import ifpb.entitybasic.interfaces.IEmail;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitybasic.interfaces.IName;
import ifpb.entitybasic.interfaces.IUser;

public class User implements IUser {

    private IName name;
    private IEmail email;
    private IID<String> username;
    private String password;

    public User(IID<String> username, IName name, IEmail email, String password) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    @Override
    public void changeName(String name) {
        this.name.changeName(name);
    }

    @Override
    public void changeEmail(String email) {
        this.email.changeEmail(email);
    }
    @Override
    public IID getUsername() {
        return username;
    }

    @Override
    public void changePassword(String newPassword) {
        this.password = newPassword;
    }

    @Override
    public boolean verifyPassword(String password) {
        return this.password.equals(password);
    }

    @Override
    public boolean compareId(IID id) {
        return username.compareTo(id);
    }
}
