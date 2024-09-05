/** 
 * A classe Email implementa a interface IEmail, responsável por gerenciar e validar
 * endereços de email.
 * 
 * Princípios Aplicados:
 * 
 * - Single Responsibility Principle (SRP):
 *   A classe Email é responsável por armazenar e validar endereços de email.
 * 
 * - Liskov Substitution Principle (LSP):
 *   A classe Email pode ser substituída por outras implementações da interface IEmail
 *   sem quebrar o comportamento esperado.
 * 
 * - Open/Closed Principle (OCP):
 *   A classe está aberta para extensão ao permitir novas regras de validação de email sem
 *   alterar o código existente.
 * 
 * - Interface Segregation Principle (ISP):
 *   A classe implementa apenas os métodos necessários da interface IEmail.
 * 
 * - Object Calisthenics: Wrap All Primitives and Strings:
 *   O email é encapsulado em uma classe dedicada, promovendo a responsabilidade de validação.
 * 
 * - Object Calisthenics: One Dot Per Line:
 *   Segue a regra de um ponto por linha, promovendo legibilidade.
 */

package ifpb.entitybasic;

import ifpb.entitybasic.exceptions.InvalidEmailException;
import ifpb.entitybasic.interfaces.IEmail;

public class Email implements IEmail {
    private String email;

    public Email(String email){
        this.email = validateEmail(email);
    }

    @Override
    public void changeEmail(String newEmail) {
        this.email = validateEmail(newEmail);
    }

    private String validateEmail(String email){
        if (email == null || email.isEmpty()){
            throw new InvalidEmailException();
        }
        return email;
    }
}