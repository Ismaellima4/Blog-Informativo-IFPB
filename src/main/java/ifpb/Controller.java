/**
 * A interface Controller define os métodos para gerenciar e acessar informações de notícias e artigos.
 * Ela fornece um contrato para obter notícias e artigos com base em seus identificadores e recuperar listas de ambos.
 * 
 * Princípios Aplicados:
 * 
 * - Single Responsibility Principle (SRP):
 *   A interface Controller é responsável apenas por fornecer métodos para acessar e gerenciar notícias e artigos.
 * 
 * - Liskov Substitution Principle (LSP):
 *   Qualquer implementação da interface Controller deve ser capaz de substituir outra sem alterar a funcionalidade esperada.
 * 
 * - Open/Closed Principle (OCP):
 *   A interface está aberta para extensão, permitindo que novas funcionalidades relacionadas a notícias e artigos sejam adicionadas sem modificar o contrato existente.
 * 
 * - Interface Segregation Principle (ISP):
 *   A interface Controller está segmentada para lidar com operações específicas de notícias e artigos, evitando métodos desnecessários para outras operações.
 * 
 * - Object Calisthenics: Small Interfaces:
 *   A interface é pequena e focada, com métodos específicos para acessar e gerenciar notícias e artigos.
 * 
 * - Object Calisthenics: One Dot Per Line:
 *   Segue a regra de um ponto por linha para promover clareza e legibilidade.
 */

package ifpb;

import java.util.ArrayList;

public interface Controller {
    News getNewsById(int id);
    Article getArticleById(int id);
    ArrayList<News> getNews();
    ArrayList<Article> getArticles();
}