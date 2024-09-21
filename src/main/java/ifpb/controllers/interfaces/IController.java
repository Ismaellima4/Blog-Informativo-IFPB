package ifpb.controllers.interfaces;
/**
 * A interface IController define os contratos para gerenciar operações relacionadas a notícias e artigos.
 * Ela fornece métodos para recuperar notícias e artigos por ID, bem como obter listas de todos os itens.
 *
 * Princípios Aplicados:
 *
 * - Single Responsibility Principle (SRP):
 *   A interface é responsável por definir operações relacionadas à recuperação de notícias e artigos.
 *
 * - Liskov Substitution Principle (LSP):
 *   Qualquer classe que implemente IController pode ser usada sem afetar a funcionalidade do sistema.
 *
 * - Open/Closed Principle (OCP):
 *   A interface está aberta para extensão, permitindo que novas implementações sejam criadas sem modificar o código existente.
 *
 * - Interface Segregation Principle (ISP):
 *   Define métodos específicos para operações relacionadas a notícias e artigos, evitando a inclusão de métodos desnecessários.
 */
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitycomplex.interfaces.IArticle;
import ifpb.entitycomplex.interfaces.INews;

import java.util.List;

public interface IController {
    INews getNewsById(IID<Integer> id) throws InvalidNullException;
    IArticle getArticleById(IID<Integer> id) throws InvalidNullException;
    INews[] getNews() throws InvalidNullException;
    IArticle[] getArticles() throws InvalidNullException;
}
