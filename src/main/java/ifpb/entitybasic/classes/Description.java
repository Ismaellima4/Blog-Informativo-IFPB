package ifpb.entitybasic.classes;
/**
 * A classe Description implementa a interface IDescription e fornece um
 * mecanismo para gerenciar descrições com validações de conteúdo.
 *
 * Princípios Aplicados:
 *
 * - Single Responsibility Principle (SRP):
 *   A classe Description é responsável por armazenar e validar a descrição.
 *
 * - Liskov Substitution Principle (LSP):
 *   A classe Description pode ser substituída por outras implementações de IDescription
 *   sem alterar o comportamento de quem a usa.
 *
 * - Open/Closed Principle (OCP):
 *   A classe está aberta para extensão por meio da implementação de novas validações
 *   sem a necessidade de modificar o código existente.
 *
 * - Interface Segregation Principle (ISP):
 *   A classe implementa apenas os métodos definidos pela interface IDescription, mantendo
 *   responsabilidades bem definidas e separadas.
 *
 * - Object Calisthenics: Small Entities:
 *   A classe encapsula a lógica de validação e manipulação de descrições, mantendo-se
 *   simples e coesa.
 *
 * - Object Calisthenics: One Dot Per Line:
 *   O código segue a regra de um ponto por linha, promovendo legibilidade.
 */
import ifpb.entitybasic.exceptions.InvalidDescriptionInformationException;
import ifpb.entitybasic.exceptions.InvalidWhiteSpaceException;
import ifpb.entitybasic.interfaces.IDescription;

public class Description implements IDescription {
    private String description;

    public Description(String description) throws Exception {
        this.description = validateDescription(description.trim());
    }
    @Override
    public void changeDescription(String description) throws Exception {
        this.description = validateDescription(description.trim());
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    private String validateDescription(String description) throws Exception {
        validateWhiteSpaces(description);
        if (!description.matches("^.{30,255}")){
            throw new InvalidDescriptionInformationException();
        }
        return description;
    }

    private void validateWhiteSpaces(String content) throws Exception {
        if (content.isEmpty()){
            throw new InvalidWhiteSpaceException();
        }
    }
}
