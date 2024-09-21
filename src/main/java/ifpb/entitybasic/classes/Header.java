package ifpb.entitybasic.classes;
/**
 * A classe Header implementa a interface IHeader e gerencia o cabeçalho de um artigo, incluindo informações
 * básicas e uma lista de autores. Essa classe garante que as informações e a lista de autores sejam válidas
 * ao serem instanciadas e permite atualizações controladas.
 *
 * Princípios Aplicados:
 *
 * - Single Responsibility Principle (SRP):
 *   A classe Header é responsável apenas por gerenciar o cabeçalho de um artigo, garantindo a consistência
 *   das informações e dos autores.
 *
 * - Liskov Substitution Principle (LSP):
 *   A classe Header pode ser substituída por qualquer outra implementação de IHeader sem comprometer o funcionamento
 *   do sistema.
 *
 * - Open/Closed Principle (OCP):
 *   A classe Header está aberta para extensão através da interface IHeader, permitindo novas funcionalidades
 *   sem modificar o código existente.
 *
 * - Interface Segregation Principle (ISP):
 *   Implementa apenas os métodos definidos na interface IHeader, mantendo as responsabilidades claramente
 *   definidas e separadas.
 *
 * - Object Calisthenics: Small Entities:
 *   A classe Header é pequena e focada, gerenciando apenas o cabeçalho e a lista de autores de um artigo.
 *
 * - Object Calisthenics: First Class Collections:
 *   Utiliza ICollection para encapsular a lista de autores, evitando manipulação direta de coleções.
 *
 * - Object Calisthenics: No Primitives:
 *   Utiliza objetos para encapsular o comportamento ao invés de tipos primitivos.
 */
import ifpb.collections.interfaces.ICollection;
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitybasic.interfaces.IInformation;
import ifpb.entitycomplex.exceptions.InvalidSizeAuthors;
import ifpb.entitybasic.interfaces.IHeader;

public class Header implements IHeader {
    private IInformation information;
    private ICollection<IID> authors;

    public Header(IInformation information, ICollection<IID> authors) throws Throwable {
        this.information = hasNullInformation(information);
        this.authors = hasNullAuthors(authors);
        hasSizeValidForAuthor(authors);
    }

    @Override
    public IInformation getInformation() {
        return this.information;
    }

    @Override
    public ICollection<IID> getAuthors() {
        return this.authors;
    }

    @Override
    public IHeader update(IHeader header) {
        this.information = header.getInformation();
        this.authors = getAuthors();
        return header;
    }

    private IInformation hasNullInformation(IInformation information) throws InvalidNullException {
        if (information == null || information.getDescription() == null || information.getTitle() == null){
            throw new InvalidNullException();
        }

        return information;
    }

    private void hasSizeValidForAuthor(ICollection<IID> authors) throws InvalidSizeAuthors {
        if (authors.getSize() < 1) throw new InvalidSizeAuthors();
    }

    private ICollection<IID> hasNullAuthors(ICollection<IID> authors) throws Throwable {
        if (authors == null) throw new InvalidNullException();

        return authors;
    }
}
