package ifpb.entitybasic.classes;
/**
 * A classe Title implementa a interface ITitle e fornece funcionalidades para gerenciar e validar
 * títulos, garantindo que eles atendam a requisitos específicos de comprimento e formato.
 *
 * Princípios Aplicados:
 *
 * - Single Responsibility Principle (SRP):
 *   A classe Title é responsável apenas por validar e gerenciar títulos.
 *
 * - Liskov Substitution Principle (LSP):
 *   A classe pode ser substituída por outras implementações de ITitle sem comprometer o funcionamento do sistema.
 *
 * - Open/Closed Principle (OCP):
 *   A classe está aberta para extensão ao permitir a modificação dos critérios de validação sem alterar o código existente.
 *
 * - Interface Segregation Principle (ISP):
 *   Implementa os métodos necessários da interface ITitle, mantendo as responsabilidades bem definidas.
 *
 * - Object Calisthenics: Small Entities:
 *   A classe é pequena e coesa, focando na validação e gerenciamento de títulos.
 *
 * - Object Calisthenics: One Dot Per Line:
 *   Segue a regra de um ponto por linha, promovendo clareza e legibilidade.
 */
import ifpb.entitybasic.exceptions.InvalidTitleInformationException;
import ifpb.entitybasic.exceptions.InvalidWhiteSpaceException;
import ifpb.entitybasic.interfaces.ITitle;

public class Title implements ITitle {
    private String title;

    public Title(String title) throws Exception {
        this.title = validateTitle(title);
    }

    private String validateTitle(String title) throws Exception {
        validateWhiteSpaces(title);
        if (!title.matches("^.{5,60}")){
            throw new InvalidTitleInformationException();
        }
        return title;
    }

    private void validateWhiteSpaces(String content) throws Exception {
        if (content.isEmpty()){
            throw new InvalidWhiteSpaceException();
        }
    }

    @Override
    public void changeTitle(String title) throws Exception {
        this.title = validateTitle(title.trim());
    }

    @Override
    public String getTitle() {
        return this.title;
    }
}
