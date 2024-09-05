/**
 * A interface NewsRepository define um contrato para gerenciar e manipular notícias no sistema. Ela fornece métodos
 * para adicionar, obter, atualizar e remover notícias, bem como para listar todas as notícias.
 * 
 * Princípios Aplicados:
 * 
 * - Single Responsibility Principle (SRP):
 *   A interface NewsRepository é responsável exclusivamente por gerenciar a persistência e manipulação de notícias.
 * 
 * - Liskov Substitution Principle (LSP):
 *   Qualquer implementação da interface NewsRepository deve ser capaz de substituir outras implementações sem alterar
 *   o comportamento esperado do sistema.
 * 
 * - Open/Closed Principle (OCP):
 *   A interface está aberta para extensão (por exemplo, novos métodos podem ser adicionados) e fechada para modificação (não
 *   é necessário alterar a interface existente para adicionar novas funcionalidades).
 * 
 * - Interface Segregation Principle (ISP):
 *   A interface é projetada para fornecer métodos específicos para a gestão de notícias, evitando métodos desnecessários e
 *   mantendo uma responsabilidade claramente definida.
 * 
 * - Object Calisthenics: Small Interfaces:
 *   A interface NewsRepository é pequena e focada em uma única responsabilidade, mantendo a clareza e a coesão.
 * 
 * - Object Calisthenics: One Dot Per Line:
 *   Segue a regra de um ponto por linha para manter a legibilidade e clareza dos métodos.
 */

package ifpb;

import ifpb.collections.interfaces.IAuthors;

import java.io.InputStream;
import java.util.ArrayList;

public interface NewsRepository {
    void addNews(Header header, IAuthors authors, String news, InputStream anexo);
    News getNewsById(int id);
    void updateNews(int id, Header header, IAuthors authors, String news, InputStream anexo);
    void removeNews(int id);
    ArrayList<News> getNews();
}