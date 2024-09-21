package ifpb.controllers.interfaces;
/**
 * A interface IControllerManager estende IController e define operações adicionais
 * para gerenciar usuários, notícias, artigos, autores e palavras-chave.
 * Ela oferece métodos para realizar operações CRUD (Criar, Ler, Atualizar, Excluir)
 * e manipular autenticação de usuários.
 *
 * Princípios Aplicados:
 *
 * - Single Responsibility Principle (SRP):
 *   A interface é responsável por gerenciar as operações de controle e manipulação
 *   de diversos recursos do sistema.
 *
 * - Liskov Substitution Principle (LSP):
 *   Qualquer classe que implemente IControllerManager pode ser usada sem afetar
 *   a funcionalidade do sistema.
 *
 * - Open/Closed Principle (OCP):
 *   A interface está aberta para extensão, permitindo que novas funcionalidades
 *   sejam adicionadas sem modificar o código existente.
 *
 * - Interface Segregation Principle (ISP):
 *   Define métodos específicos para operações relacionadas a usuários, notícias,
 *   artigos, autores e palavras-chave, evitando a inclusão de métodos desnecessários.
 */
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.exceptions.InvalidPasswordException;
import ifpb.entitybasic.interfaces.IAuthor;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitybasic.interfaces.IKeyWord;
import ifpb.entitybasic.interfaces.IUser;
import ifpb.entitycomplex.interfaces.IArticle;
import ifpb.entitycomplex.interfaces.INews;

public interface IControllerManager extends IController {
    void signUp(IUser user) throws InvalidNullException;
    void updateUser(IID id, IUser user) throws InvalidNullException;
    void deleteUser(IID id) throws InvalidNullException;
    int signIn(String id, String password) throws InvalidNullException, InvalidPasswordException;

    void createNews(INews news);
    void deleteNews(IID id) throws InvalidNullException;
    void updateNews(IID id, INews news) throws InvalidNullException;

    void createArticle(IArticle article);
    void deleteArticle(IID id) throws InvalidNullException;
    void updateArticle(IID id, IArticle article) throws InvalidNullException;

    void addAuthor(IAuthor author);
    void removeAuthor(IID id) throws InvalidNullException;
    void updateAuthor(IID id, IAuthor author) throws InvalidNullException;
    IAuthor[] getAuthors() throws InvalidNullException;
    IAuthor getAuthorById(IID id) throws InvalidNullException;

    void addKeyWord(IKeyWord keyWord) throws InvalidNullException;
    void removeKeyWord(IKeyWord keyWord) throws InvalidNullException;
    void updateKeyWord(IKeyWord oldKeyWord, IKeyWord newKeyWord) throws InvalidNullException;
    IKeyWord[] getKeyWords(IKeyWord[] keyWords) throws InvalidNullException;
    IKeyWord getKeyWord(IKeyWord keyWord) throws InvalidNullException;
}
