/**
 * A classe ID é uma implementação genérica da interface IID que representa um identificador
 * composto por múltiplos elementos. A classe é projetada para aceitar tipos genéricos e
 * combinar esses elementos em uma string única.
 * 
 * Princípios Aplicados:
 * 
 * - Single Responsibility Principle (SRP):
 *   A classe ID é responsável apenas por criar e gerenciar um identificador único.
 * 
 * - Liskov Substitution Principle (LSP):
 *   A classe pode ser substituída por outras implementações de IID sem impactar o
 *   comportamento de código que a utiliza.
 * 
 * - Open/Closed Principle (OCP):
 *   A classe está aberta para extensão, permitindo adicionar novas maneiras de combinar
 *   ou validar identificadores sem modificar seu comportamento existente.
 * 
 * - Interface Segregation Principle (ISP):
 *   A classe implementa os métodos necessários da interface IID de forma concisa, sem
 *   sobrecarregar com outras responsabilidades.
 * 
 * - Object Calisthenics: Wrap All Primitives and Strings:
 *   A classe encapsula a lógica de criação e comparação de identificadores compostos, promovendo clareza e encapsulamento.
 * 
 * - Object Calisthenics: First-Class Collections:
 *   A coleção de argumentos args é gerenciada adequadamente, utilizando streams para
 *   processar os dados.
 */

package ifpb.entitybasic;

import ifpb.entitybasic.interfaces.IID;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ID<T> implements IID {
    private final String id;

    @SafeVarargs
    public ID(T... args) {
        this.id = Arrays.stream(args).map(String::valueOf).collect(Collectors.joining("+","(",")"));
    }

    @Override
    public String getId() {
        return this.id;
    }

    public boolean compareTo(IID compareId) {
        return this.id.equals(compareId.getId());
    }
}