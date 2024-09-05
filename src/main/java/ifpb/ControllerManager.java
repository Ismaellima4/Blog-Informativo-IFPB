/**
 * A interface ControllerManager estende a interface Controller e adiciona métodos para gerenciar notícias, artigos
 * e usuários, além de realizar operações de autenticação. Ela define um contrato para adicionar, atualizar e remover
 * notícias, artigos e usuários, bem como para autenticar e registrar usuários.
 * 
 * Princípios Aplicados:
 * 
 * - Single Responsibility Principle (SRP):
 *   A interface ControllerManager é responsável por gerenciar e manipular notícias, artigos e usuários, além de fornecer
 *   operações de autenticação e registro.
 * 
 * - Liskov Substitution Principle (LSP):
 *   Qualquer implementação da interface ControllerManager deve poder substituir outras implementações de Controller e ControllerManager
 *   sem alterar o comportamento esperado.
 * 
 * - Open/Closed Principle (OCP):
 *   A interface está aberta para extensão, permitindo que novas funcionalidades sejam adicionadas sem modificar a interface existente.
 * 
 * - Interface Segregation Principle (ISP):
 *   A interface está dividida em métodos específicos para gerenciar notícias, artigos, usuários e operações de autenticação,
 *   evitando métodos desnecessários e mantendo responsabilidades claramente definidas.
 * 
 * - Object Calisthenics: Small Interfaces:
 *   A interface é relativamente grande, mas os métodos são específicos para suas responsabilidades e estão organizados por tipo de operação.
 * 
 * - Object Calisthenics: One Dot Per Line:
 *   Segue a regra de um ponto por linha para manter clareza e legibilidade.
 */

package ifpb;

import ifpb.collections.interfaces.IAuthors;

import java.io.InputStream;

public interface ControllerManager extends Controller {
    void addNews(Header header, IAuthors authors, String news, InputStream anexo);
    void updateNews(int id, Header header, IAuthors authors, String news, InputStream anexo);
    void removeNews(int id);
    void addArticle(Header header, KeyWords keyWords, IAuthors authors, InputStream article);
    void updateArticle(int id, Header header, KeyWords keyWords, IAuthors authors, InputStream article);
    void removeArticle(int id);
    String singIn(String email,String pasword);
    String signUp(String name,String email,String password,String username);
    void removeUser(int id);
    boolean update(int id, String name, String email, String password,String username);
}
