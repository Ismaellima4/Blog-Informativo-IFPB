/**
 * A classe Name implementa a interface IName e fornece funcionalidades para gerenciar e formatar
 * um nome. Ela valida e formata o nome, garantindo que ele siga um formato adequado.
 * 
 * Princípios Aplicados:
 * 
 * - Single Responsibility Principle (SRP):
 *   A classe Name é responsável apenas por validar e formatar um nome.
 * 
 * - Liskov Substitution Principle (LSP):
 *   A classe pode ser substituída por outras implementações de IName sem comprometer o comportamento do sistema.
 * 
 * - Open/Closed Principle (OCP):
 *   A classe está aberta para extensão ao permitir adicionar novas formas de validação ou formatação
 *   sem modificar a lógica existente.
 * 
 * - Interface Segregation Principle (ISP):
 *   Implementa os métodos necessários da interface IName, mantendo responsabilidades bem definidas.
 * 
 * - Object Calisthenics: Small Entities:
 *   A classe é pequena e focada, gerenciando a lógica de validação e formatação de nomes.
 * 
 * - Object Calisthenics: One Dot Per Line:
 *   O código segue a regra de um ponto por linha, promovendo clareza e legibilidade.
 */

package ifpb.entitybasic;

import ifpb.entitybasic.exceptions.InvalidNameException;
import ifpb.entitybasic.interfaces.IName;

import java.util.Arrays;

public class Name implements IName {
    private String name;

    public Name(String name) {
        this.name = validateName(name);
    }

    @Override
    public void changeName(String newName) {
        this.name = validateName(newName);
    }
    @Override
    public String getName() {
        return name;
    }

    private String validateName(String name){
        if (name == null || name.isEmpty()){
            throw new InvalidNameException();
        }
        return formatName(name);
    }

    private String formatName(String name){
        return Arrays.stream(name.split(" ")).map((word -> word.substring(0,1).toUpperCase().concat(word.substring(1).toLowerCase()))).toString();
    }
}