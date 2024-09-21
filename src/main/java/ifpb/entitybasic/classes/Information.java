package ifpb.entitybasic.classes;
/**
 * A classe Information implementa a interface IInformation e fornece uma forma de
 * gerenciar e atualizar informações compostas por um título e uma descrição.
 *
 * Princípios Aplicados:
 *
 * - Single Responsibility Principle (SRP):
 *   A classe Information é responsável por gerenciar e atualizar um título e uma descrição.
 *
 * - Liskov Substitution Principle (LSP):
 *   A classe pode ser substituída por outras implementações de IInformation sem comprometer
 *   o comportamento esperado.
 *
 * - Open/Closed Principle (OCP):
 *   A classe está aberta para extensão ao permitir adicionar novas formas de validar ou
 *   processar título e descrição sem alterar a implementação existente.
 *
 * - Interface Segregation Principle (ISP):
 *   A classe implementa apenas os métodos definidos na interface IInformation, mantendo
 *   responsabilidades bem definidas.
 *
 * - Object Calisthenics: Small Entities:
 *   A classe encapsula a lógica de gerenciamento de título e descrição, mantendo-se
 *   pequena e coesa.
 *
 * - Object Calisthenics: One Dot Per Line:
 *   O código segue a regra de um ponto por linha, melhorando a legibilidade.
 */
import ifpb.entitybasic.interfaces.IDescription;
import ifpb.entitybasic.interfaces.IInformation;
import ifpb.entitybasic.interfaces.ITitle;

public class Information implements IInformation {
    private ITitle title;
    private IDescription description;

    public Information(ITitle title, IDescription description) {
        this.title = title;
        this.description = description;
    }

    @Override
    public void changeTitle(String title) throws Exception {
        this.title.changeTitle(title);
    }
    @Override
    public void changeDescription(String description) throws Exception {
        this.description.changeDescription(description);
    }

    @Override
    public IDescription getDescription() {
        return this.description;
    }

    @Override
    public ITitle getTitle() {
        return this.title;
    }
}
