/**
 * A classe Password implementa a interface IPassword e fornece funcionalidades para gerenciar e validar
 * senhas, incluindo a validação e a criptografia da senha.
 * 
 * Princípios Aplicados:
 * 
 * - Single Responsibility Principle (SRP):
 *   A classe Password é responsável por validar e criptografar senhas.
 * 
 * - Liskov Substitution Principle (LSP):
 *   A classe pode ser substituída por outras implementações de IPassword sem impactar o comportamento do sistema.
 * 
 * - Open/Closed Principle (OCP):
 *   A classe está aberta para extensão ao permitir a adição de novas funcionalidades de validação ou criptografia
 *   sem modificar o código existente.
 * 
 * - Interface Segregation Principle (ISP):
 *   Implementa apenas os métodos definidos na interface IPassword, mantendo as responsabilidades bem definidas.
 * 
 * - Object Calisthenics: Small Entities:
 *   A classe é focada e gerencia a validação e criptografia de senhas.
 * 
 * - Object Calisthenics: One Dot Per Line:
 *   O código segue a regra de um ponto por linha, garantindo clareza e legibilidade.
 */


package ifpb.entitybasic;

import ifpb.entitybasic.exceptions.InvalidChangePassword;
import ifpb.entitybasic.exceptions.InvalidPasswordException;
import ifpb.entitybasic.interfaces.IPassword;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class Password implements IPassword {
    private String password;

    public Password(String password) throws Exception {
        this.password = validate(password);
    }

    private String validate(String password) throws Exception {
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!?.,*/_])(?=\\S+$).{8,20}$";
        if (!password.matches(regex)){
            throw new InvalidPasswordException();
        }
        return generateHash(password);
    }

    private String generateHash(String password) throws Exception {
        MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
        byte[] hash = algorithm.digest(password.getBytes(StandardCharsets.UTF_8));
        StringBuilder hexString = new StringBuilder();
        for (byte b : hash) {
            hexString.append(String.format("%02X", 0xFF & b));
        }
        return hexString.toString();
    }

    @Override
    public void changePassword(String newPassword) throws Exception {
        if (compareHash(newPassword)){
            throw new InvalidPasswordException();
        }
        this.password = validate(newPassword);
    }

    private boolean compareHash(String newPassword) throws Exception {
        String passwordHash = generateHash(newPassword);
        if (this.password.equals(passwordHash)){
            throw new InvalidChangePassword();
        }
        return false;
    }

}